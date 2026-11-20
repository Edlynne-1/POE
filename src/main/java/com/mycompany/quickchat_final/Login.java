package com.mycompany.quickchat_final;

public class Login {

    public User user;
    public String enteredUsername;
    public String enteredPassword;

    public Login(User user,
            String enteredUsername,
            String enteredPassword) {

        this.user = user;
        this.enteredUsername = enteredUsername;
        this.enteredPassword = enteredPassword;
    }

    public boolean loginUser() {

        return this.enteredUsername.equals(this.user.username)
                && this.enteredPassword.equals(this.user.password);
    }

    public String returnLoginStatus() {

        if (this.loginUser()) {

            return "Welcome "
                    + this.user.firstName
                    + ", "
                    + this.user.lastName
                    + " it is great to see you again.";
        }

        return "Username or password incorrect, please try again.";
    }
}