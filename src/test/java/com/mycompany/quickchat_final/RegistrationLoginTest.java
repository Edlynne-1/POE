package com.mycompany.quickchat_final;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RegistrationLoginTest {

    @Test
    public void testUsernameCorrectlyFormatted() {

        Registration reg =
                new Registration(
                        "kyl_1",
                        "Ch&&sec@ke99!",
                        "+27838968976");

        assertTrue(
                reg.checkUserName());
    }

    @Test
    public void testUsernameIncorrectlyFormatted() {

        Registration reg =
                new Registration(
                        "kyle!!!!",
                        "Ch&&sec@ke99!",
                        "+27838968976");

        assertFalse(
                reg.checkUserName());
    }

    @Test
    public void testPasswordComplexity() {

        Registration reg =
                new Registration(
                        "kyl_1",
                        "Ch&&sec@ke99!",
                        "+27838968976");

        assertTrue(
                reg.checkPasswordComplexity());
    }

    @Test
    public void testLoginSuccess() {

        User user =
                new User(
                        "kyl_1",
                        "Ch&&sec@ke99!",
                        "+27838968976",
                        "Kyl",
                        "Smith");

        Login login =
                new Login(
                        user,
                        "kyl_1",
                        "Ch&&sec@ke99!");

        assertTrue(
                login.loginUser());
    }
}
