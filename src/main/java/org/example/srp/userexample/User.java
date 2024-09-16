package org.example.srp.userexample;

public class User {


    /**
     * Single Responsibility Principle
     * In this example, the User class has multiple responsibilities
     * managing user data and sending emails. This violates SRP
     */

    private String name;
    private String email;
    private String password;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // Methods related to email operations

    /**
     *
     * To fix srp violation: remove this method
     * Here, the User class only handles user data,
     * while the EmailService class handles email-related tasks
     */
    public void sendEmail(String message) {
        EmailService emailService = new EmailService();
        emailService.sendEmail(this.email, message);
    }
}
