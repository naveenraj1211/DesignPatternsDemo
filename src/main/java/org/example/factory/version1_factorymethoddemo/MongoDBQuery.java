package org.example.factory.version1_factorymethoddemo;

public class MongoDBQuery implements Query {

    @Override
    public void executeQuery(String query) {
        System.out.println("running mongodb query");
    }
}
