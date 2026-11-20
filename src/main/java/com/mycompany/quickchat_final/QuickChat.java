package com.mycompany.quickchat_final;

import java.util.Scanner;

public class QuickChat {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to QuickChat");

        // Temporary code to test the program
        User user = new User(
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976",
                "Kyl",
                "Smith"
        );

        Login login = new Login(
                user,
                "kyl_1",
                "Ch&&sec@ke99!"
        );

        System.out.println(login.returnLoginStatus());

    }
}