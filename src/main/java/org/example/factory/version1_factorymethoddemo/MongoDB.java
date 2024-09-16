package org.example.factory.version1_factorymethoddemo;

public class MongoDB implements Database {

    @Override
    public void connectDb(String url, String userName, String password) {
        System.out.println("connecting to db");
    }

    @Override
    public Query createQuery() {
        return new MongoDBQuery();
    }

    @Override
    public Transaction createTransaction() {
        return null;
    }

    @Override
    public Updater createUpdater() {
        return null;
    }

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
}
