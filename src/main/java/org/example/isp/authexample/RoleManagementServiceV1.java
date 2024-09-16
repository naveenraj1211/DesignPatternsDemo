package org.example.isp.authexample;

public interface RoleManagementServiceV1 {

    void assignRole(String username, String role);
    void revokeRole(String username, String role);
}
