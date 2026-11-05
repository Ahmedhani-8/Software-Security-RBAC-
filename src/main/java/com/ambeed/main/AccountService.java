package com.ambeed.main;

public class AccountService {

    public void createAccount(User user, String accountId) {
        if (user.checkPermission(Permission.CREATE)) {
            System.out.println("[ACCESS GRANTED] User '" + user.getUsername() + "' successfully CREATED Account: " + accountId);
        } else {
            System.out.println("[ACCESS DENIED]  User '" + user.getUsername() + "' is NOT authorized to CREATE accounts.");
        }
    }

    public void viewAccount(User user, String accountId) {
        if (user.checkPermission(Permission.VIEW)) {
            System.out.println("[ACCESS GRANTED] User '" + user.getUsername() + "' successfully VIEWED Account: " + accountId);
        } else {
            System.out.println("[ACCESS DENIED]  User '" + user.getUsername() + "' is NOT authorized to VIEW accounts.");
        }
    }

    public void updateAccount(User user, String accountId) {
        if (user.checkPermission(Permission.UPDATE)) {
            System.out.println("[ACCESS GRANTED] User '" + user.getUsername() + "' successfully UPDATED Account: " + accountId);
        } else {
            System.out.println("[ACCESS DENIED]  User '" + user.getUsername() + "' is NOT authorized to UPDATE accounts.");
        }
    }

    public void deleteAccount(User user, String accountId) {
        if (user.checkPermission(Permission.DELETE)) {
            System.out.println("[ACCESS GRANTED] User '" + user.getUsername() + "' successfully DELETED Account: " + accountId);
        } else {
            System.out.println("[ACCESS DENIED]  User '" + user.getUsername() + "' is NOT authorized to DELETE accounts.");
        }
    }
}