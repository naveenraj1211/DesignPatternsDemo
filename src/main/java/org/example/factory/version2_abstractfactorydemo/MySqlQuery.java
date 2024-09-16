package org.example.factory.version2_abstractfactorydemo;

public class MySqlQuery implements Query {

    @Override
    public void executeQuery(String query) {
        System.out.println("running mysql query");
    }



}
