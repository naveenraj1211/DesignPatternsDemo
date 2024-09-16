package org.example.factory.version0;

public class MySqlQuery implements Query{

    @Override
    public void executeQuery(String query) {
        System.out.println("running mysql query");
    }
}
