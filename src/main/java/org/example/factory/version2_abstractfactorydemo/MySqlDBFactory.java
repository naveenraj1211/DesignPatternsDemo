package org.example.factory.version2_abstractfactorydemo;

public class MySqlDBFactory implements DatabaseFactory{

    @Override
    public Query createQuery() {
        return new MySqlQuery();
    }

    @Override
    public Transaction createTransaction() {
        return new MySqlTransaction();
    }

    @Override
    public Updater createUpdater() {
        return new MySqlUpdater();
    }
}
