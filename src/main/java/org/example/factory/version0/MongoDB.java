package org.example.factory.version0;

public class MongoDB implements Database{

    @Override
    public void connectDb(String url, String userName, String password) {
        System.out.println("connecting to db");
    }
}
