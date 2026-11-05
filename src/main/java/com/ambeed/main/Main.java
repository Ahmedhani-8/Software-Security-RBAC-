package com.ambeed.main;

public class Main {
    
    public static void main(String[] args) {
 

        Role adminRole = new Role("Admin");
        adminRole.addPermission(Permission.CREATE);
        adminRole.addPermission(Permission.VIEW);
        adminRole.addPermission(Permission.UPDATE);
        adminRole.addPermission(Permission.DELETE);

        Role managerRole = new Role("Manager");
        managerRole.addPermission(Permission.VIEW);
        managerRole.addPermission(Permission.UPDATE);

        Role customerRole = new Role("Customer");
        customerRole.addPermission(Permission.VIEW);

        User alice = new User("Ahmed_Admin");
        alice.assignRole(adminRole);

        User bob = new User("Ali_Manager");
        bob.assignRole(managerRole);

        User charlie = new User("hani_Customer");
        charlie.assignRole(customerRole);

        AccountService accountService = new AccountService();
        String targetAccount = "ACC-9901";

        System.out.println("--- 1. Testing Admin (" + alice.getUsername() + ") ---");
        accountService.createAccount(alice, targetAccount);
        accountService.viewAccount(alice, targetAccount);
        accountService.updateAccount(alice, targetAccount);
        accountService.deleteAccount(alice, targetAccount);

        System.out.println("\n--- 2. Testing Manager (" + bob.getUsername() + ") ---");
        accountService.createAccount(bob, targetAccount);
        accountService.viewAccount(bob, targetAccount);
        accountService.updateAccount(bob, targetAccount);
        accountService.deleteAccount(bob, targetAccount);

        System.out.println("\n--- 3. Testing Customer (" + charlie.getUsername() + ") ---");
        accountService.createAccount(charlie, targetAccount);
        accountService.viewAccount(charlie, targetAccount);
        accountService.updateAccount(charlie, targetAccount);
        accountService.deleteAccount(charlie, targetAccount);

        System.out.println("\n=================================================");
    }
}