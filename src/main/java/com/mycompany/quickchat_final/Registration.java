package com.mycompany.quickchat_final;

public class Registration {

    public String username;
    public String password;
    public String cellNumber;

    public Registration(String username, String password, String cellNumber) {

        this.username = username;
        this.password = password;
        this.cellNumber = cellNumber;
    }

    public boolean checkUserName() {

        return this.username.contains("_")
                && this.username.length() <= 5;
    }

    public boolean checkPasswordComplexity() {

        boolean longEnough = this.password.length() >= 8;

        boolean hasCapital =
                this.password.matches(".*[A-Z].*");

        boolean hasNumber =
                this.password.matches(".*[0-9].*");

        boolean hasSpecial =
                this.password.matches(".*[!@#$%^&*()].*");

        return longEnough
                && hasCapital
                && hasNumber
                && hasSpecial;
    }

    public boolean checkCellPhoneNumber() {

        return this.cellNumber.matches("^\\+27[0-9]{1,10}$");
    }

    public String registerUser() {

        if (!this.checkUserName()) {

            return "Username is not correctly formatted.";
        }

        if (!this.checkPasswordComplexity()) {

            return "Password is not correctly formatted.";
        }

        if (!this.checkCellPhoneNumber()) {

            return "Cell phone number incorrectly formatted.";
        }

        return "Registration successful.";
    }
}