package org.example.factory.version1_factorymethoddemo;

public class UserService {

    Database db;
    Query query;
    Transaction transaction;
    Updater updater;


    /**
     * Creating one object based on another object
     * Problem with version0 approach:
     * 1. Violates SRP, OCP
     * 2. Doing multiple things - type of query, business logic for creating user,
     * 3. On basis of db object, deciding another obj query  using if-else statements
     * 4. Client or caller is doing the checking
     * ----------------------------------------------
     * To fix:
     * 1. Give responsibility to corresponding classes.
     * ----------------------------------------------
     * Problem with version1 approach:
     * 1. If we need create multiple object bases another objects
     * we create a multiple factory methods - this is overloading class
     */
    void createUser() {
        query = db.createQuery();
        transaction = db.createTransaction();
        updater = db.createUpdater();
        query.executeQuery("dummy query");
    }

}
