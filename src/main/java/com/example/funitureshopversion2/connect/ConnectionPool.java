package com.example.funitureshopversion2.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ConnectionPool implements IConnectionPool {
    private String url;
    private String user;
    private String password;
    private Stack<Connection> connectionPool;
    private List<Connection> usedConnections = new ArrayList<>();
    private static int INITIAL_POOL_SIZE = 10;

    public ConnectionPool(String url, String user, String password, Stack<Connection> connectionPool) {
        this.url = url;
        this.user = user;
        this.password = password;
        this.connectionPool = connectionPool;
    }

    public static ConnectionPool create(
            String url, String user,
            String password) throws SQLException {
        Stack<Connection> pool = new Stack<>();
        for (int i = 0; i < INITIAL_POOL_SIZE; i++)
            pool.push(createConnection(url, user, password));
        return new ConnectionPool(url, user, password, pool);
    }

    private static Connection createConnection(
            String url, String user, String password)
            throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    @Override
    public Connection getConnection() {
        Connection connection = connectionPool.pop();
        usedConnections.add(connection);
        return connection;
    }

    @Override
    public boolean releaseConnection(Connection connection) {
        connectionPool.push(connection);
        return usedConnections.remove(connection);
    }

    @Override
    public void shutdown() throws SQLException {
        usedConnections.forEach(this::releaseConnection);
        for(Connection connection: connectionPool) connection.close();
        connectionPool.clear();
    }
}
