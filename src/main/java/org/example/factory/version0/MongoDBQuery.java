package org.example.factory.version0;

public class MongoDBQuery implements Query{

    @Override
    public void executeQuery(String query) {
        System.out.println("running mongodb query");
    }
}
