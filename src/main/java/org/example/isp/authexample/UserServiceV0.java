package org.example.isp.authexample;

public interface UserServiceV0 {

    /**
     * One general-purpose interface
     * handle user authentication and authorization
     * which violates interface segregation principle
     */
    void registerUser(String username, String password);
    void loginUser(String username, String password);
    void changePassword(String username, String newPassword);
    void assignRole(String username, String role);
    void revokeRole(String username, String role);
}
