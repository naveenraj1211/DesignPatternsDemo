package org.example.factory.version1_factorymethoddemo;

public interface Database {

    void connectDb(String url, String userName, String password);

    /**
     * Factory method
     * 1. this is helping to do to the actual functionality
     * 2. SRP violated: Since this interface is handling both db methods, factory methods
     */

    Query createQuery();
    Transaction createTransaction();
    Updater createUpdater();

    // Actual methods doing some task related db
    void connect();
    String getUrl();
    void increasePoolSize();
    void getVersion();
}
