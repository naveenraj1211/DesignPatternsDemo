package org.example.isp.authexample;

public interface LoginServiceV1 {

    void registerUser(String username, String password);
    void loginUser(String username, String password);
    void changePassword(String username, String newPassword);

}
