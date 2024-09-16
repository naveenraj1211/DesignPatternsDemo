package org.example.factory.version2_abstractfactorydemo;

public class MySql implements Database {

    @Override
    public void connect() {

    }

    @Override
    public String getUrl() {
        return "";
    }

    @Override
    public void increasePoolSize() {

    }

    @Override
    public void getVersion() {

    }

    @Override
    public DatabaseFactory getDBFactory() {
        return new MySqlDBFactory();
    }
}
