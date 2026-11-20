package com.mycompany.quickchat_final;

import java.util.Random;

public class Message {

    public String messageID;
    public String recipient;
    public String message;
    public int messageNumber;

    public static int totalMessagesSent = 0;

    public Message(String recipient,
                   String message,
                   int messageNumber) {

        this.recipient = recipient;
        this.message = message;
        this.messageNumber = messageNumber;
        this.messageID = generateMessageID();
    }

    private String generateMessageID() {

        Random random = new Random();

        long id =
                1000000000L +
                (long)(random.nextDouble() * 9000000000L);

        return String.valueOf(id);
    }

    public boolean checkMessageID() {

        return this.messageID.length() == 10;
    }

    public String checkRecipientCell() {

        if (this.recipient.matches("^\\+27[0-9]{1,10}$")) {

            return "Cell phone number successfully captured.";
        }

        return "Cell phone number is incorrectly formatted or does not contain an international code.";
    }

    public String createMessageHash() {

        String[] words = this.message.split(" ");

        String hash =
                this.messageID.substring(0, 2)
                + ":"
                + this.messageNumber
                + ":"
                + words[0]
                + words[words.length - 1];

        return hash.toUpperCase();
    }

    public String validateMessageLength() {

        if (this.message.length() <= 250) {

            return "Message ready to send.";
        }

        int extra = this.message.length() - 250;

        return "Message exceeds 250 characters by "
                + extra;
    }

    public String SentMessage(int option) {

        switch (option) {

            case 1:

                totalMessagesSent++;
                return "Message successfully sent.";

            case 2:

                return "Message disregarded.";

            case 3:

                return "Message successfully stored.";

            default:

                return "Invalid option.";
        }
    }

    public String printMessages() {

        return "Message ID: " + this.messageID
                + "\nMessage Hash: " + this.createMessageHash()
                + "\nRecipient: " + this.recipient
                + "\nMessage: " + this.message;
    }

    public int returnTotalMessages() {

        return totalMessagesSent;
    }
}