package org.example.factory.version1_factorymethoddemo;

public class MySqlQuery implements Query {

    @Override
    public void executeQuery(String query) {
        System.out.println("running mysql query");
    }



}
