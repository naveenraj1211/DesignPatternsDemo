package org.example.factory.version2_abstractfactorydemo;

public interface Database {

    // Actual methods doing some task related db
    void connect();
    String getUrl();
    void increasePoolSize();
    void getVersion();

    DatabaseFactory getDBFactory();
}
