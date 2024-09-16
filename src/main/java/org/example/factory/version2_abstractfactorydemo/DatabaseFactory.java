package org.example.factory.version2_abstractfactorydemo;

public interface DatabaseFactory {

    Query createQuery();
    Transaction createTransaction();
    Updater createUpdater();
}
