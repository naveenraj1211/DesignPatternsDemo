package org.example.factory.version0;

public class UserService {

    Database db;
    Query query;


    /**
     * Creating one object based on another object
     * Problem with this approach:
     * 1. Violates SRP, OCP
     * 2. Doing multiple things - type of query, business logic for creating user,
     * 3. On basis of db object, deciding another obj query  using if-else statements
     * 4. Client or caller is doing the checking
     * ----------------------------------------------
     * To fix:
     * 1. Give responsibility to corresponding classes.
     */
    void createUser() {
        if (db instanceof MongoDB) {
            query = new MongoDBQuery();
        } else if (db instanceof MySql) {
            query = new MySqlQuery();
        }

        query.executeQuery("dummy query");
    }

}
