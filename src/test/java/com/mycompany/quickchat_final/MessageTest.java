package com.mycompany.quickchat_final;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MessageTest {

    @Test
    public void testMessageIDLength() {

        Message message =
                new Message(
                        "+27838968976",
                        "Hello",
                        1);

        assertTrue(
                message.checkMessageID());
    }

    @Test
    public void testRecipientNumber() {

        Message message =
                new Message(
                        "+27838968976",
                        "Hello",
                        1);

        assertEquals(
                "Cell phone number successfully captured.",
                message.checkRecipientCell());
    }

    @Test
    public void testMessageLength() {

        Message message =
                new Message(
                        "+27838968976",
                        "Hello",
                        1);

        assertEquals(
                "Message ready to send.",
                message.validateMessageLength());
    }

    @Test
    public void testHashCreated() {

        Message message =
                new Message(
                        "+27838968976",
                        "Hello World",
                        1);

        assertNotNull(
                message.createMessageHash());
    }
}
