package com.mycompany.quickchat_final;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MessageManagerTest {

    @Test
    public void testLongestMessage() {

        MessageManager manager =
                new MessageManager();

        manager.sentMessages[0] =
                "Did you get the cake?";

        manager.sentMessages[1] =
                "Where are you? You are late! I have asked you to be on time.";

        manager.sentCount = 2;

        assertEquals(
                "Where are you? You are late! I have asked you to be on time.",
                manager.getLongestMessage());
    }

    @Test
    public void testSearchByRecipient() {

        MessageManager manager =
                new MessageManager();

        manager.recipients[0] =
                "+27838884567";

        manager.sentMessages[0] =
                "Where are you?";

        manager.sentCount = 1;

        assertTrue(
                manager.searchByRecipient("+27838884567")
                        .contains("Where are you?"));
    }

    @Test
    public void testDeleteByHash() {

        MessageManager manager =
                new MessageManager();

        manager.sentMessages[0] =
                "Hello";

        manager.messageHashes[0] =
                "HG11";

        manager.sentCount = 1;

        assertEquals(
                "Message deleted successfully",
                manager.deleteByHash("HG11"));
    }

    @Test
    public void testDisplayReport() {

        MessageManager manager =
                new MessageManager();

        manager.sentMessages[0] =
                "Hello";

        manager.messageHashes[0] =
                "HG11";

        manager.recipients[0] =
                "+27838884567";

        manager.sentCount = 1;

        assertTrue(
                manager.displayReport()
                        .contains("Hello"));
    }
}
