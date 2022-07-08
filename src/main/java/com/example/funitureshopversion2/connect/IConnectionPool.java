package com.example.funitureshopversion2.connect;

import java.sql.Connection;
import java.sql.SQLException;

public interface IConnectionPool {
    Connection getConnection();
    boolean releaseConnection(Connection connection);
    void shutdown() throws SQLException;
}
