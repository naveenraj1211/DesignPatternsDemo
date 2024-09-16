package org.example.factory.version2_abstractfactorydemo;


public class MongoDBFactory implements DatabaseFactory {

    @Override
    public Query createQuery() {
        return new MongoDBQuery();
    }

    @Override
    public Transaction createTransaction() {
        return new MongoDBTransaction();
    }

    @Override
    public Updater createUpdater() {
        return new MongoDBUpdater();
    }
}
