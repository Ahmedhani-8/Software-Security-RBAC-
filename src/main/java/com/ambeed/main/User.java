package com.ambeed.main;

import java.util.HashSet;
import java.util.Set;

public class User {
    private String username;
    private Set<Role> roles;

    public User(String username) {
        this.username = username;
        this.roles = new HashSet<>();
    }

    public String getUsername() {
        return username;
    }

    public void assignRole(Role role) {
        this.roles.add(role);
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public boolean checkPermission(Permission permission) {
        for (Role role : roles) {
            if (role.hasPermission(permission)) {
                return true;
            }
        }
        return false;
    }
}