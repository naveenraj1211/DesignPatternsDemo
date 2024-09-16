package org.example.singleton.connectionpool;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectionPoolImpl implements ConnectionPool {

    private int maxConnections;
    private static ConnectionPoolImpl connectionPool = null;
    private Queue<DatabaseConnection> dbQueue;


    private ConnectionPoolImpl(int maxConnections) {
        this.maxConnections = maxConnections;
        dbQueue = new LinkedList<>();
        initializePool();
    }

    public static ConnectionPoolImpl getInstance(int maxConnections) {
        if (connectionPool == null) {
            synchronized (ConnectionPoolImpl.class) {
                if (connectionPool == null)
                    connectionPool = new ConnectionPoolImpl(maxConnections);
            }
        }
        return connectionPool;
    }

    public static void resetInstance() {
        connectionPool = null;
    }


    @Override
    public void initializePool() {
        for (int i = 0; i < maxConnections; i++) {
            dbQueue.add(new DatabaseConnection());
        }
    }

    @Override
    public DatabaseConnection getConnection() {
        return dbQueue.poll();
    }

    @Override
    public void releaseConnection(DatabaseConnection connection) {
        dbQueue.add(connection);
    }

    @Override
    public int getAvailableConnectionsCount() {
        return dbQueue.size();
    }

    @Override
    public int getTotalConnectionsCount() {
        return this.maxConnections;
    }
}
