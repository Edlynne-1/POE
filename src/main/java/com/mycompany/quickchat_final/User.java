package com.mycompany.quickchat_final;

public class User {

    public String username;
    public String password;
    public String cellNumber;
    public String firstName;
    public String lastName;

    public User(String username, String password,
            String cellNumber,
            String firstName,
            String lastName) {

        this.username = username;
        this.password = password;
        this.cellNumber = cellNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}