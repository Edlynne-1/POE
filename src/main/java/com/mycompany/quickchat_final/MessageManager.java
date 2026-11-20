package com.mycompany.quickchat_final;

public class MessageManager {

    public String[] sentMessages = new String[100];
    public String[] storedMessages = new String[100];
    public String[] disregardedMessages = new String[100];
    public String[] messageHashes = new String[100];
    public String[] messageIDs = new String[100];
    public String[] recipients = new String[100];

    public int sentCount = 0;
    public int storedCount = 0;
    public int disregardedCount = 0;

    public void addSentMessage(Message message) {

        sentMessages[sentCount] = message.message;
        recipients[sentCount] = message.recipient;
        messageHashes[sentCount] = message.createMessageHash();
        messageIDs[sentCount] = message.messageID;

        sentCount++;
    }

    public String getLongestMessage() {

        String longest = "";

        for (int i = 0; i < sentCount; i++) {

            if (sentMessages[i] != null
                    && sentMessages[i].length() > longest.length()) {

                longest = sentMessages[i];
            }
        }

        return longest;
    }

    public String searchByMessageID(String id) {

        for (int i = 0; i < sentCount; i++) {

            if (messageIDs[i] != null
                    && messageIDs[i].equals(id)) {

                return sentMessages[i];
            }
        }

        return "Message not found";
    }

    public String searchByRecipient(String recipient) {

        String results = "";

        for (int i = 0; i < sentCount; i++) {

            if (recipients[i] != null
                    && recipients[i].equals(recipient)) {

                results += sentMessages[i] + "\n";
            }
        }

        return results;
    }

    public String deleteByHash(String hash) {

        for (int i = 0; i < sentCount; i++) {

            if (messageHashes[i] != null
                    && messageHashes[i].equals(hash)) {

                sentMessages[i] = null;

                return "Message deleted successfully";
            }
        }

        return "Message hash not found";
    }

    public String displayReport() {

        String report = "";

        for (int i = 0; i < sentCount; i++) {

            if (sentMessages[i] != null) {

                report += "Message Hash: "
                        + messageHashes[i]
                        + "\nRecipient: "
                        + recipients[i]
                        + "\nMessage: "
                        + sentMessages[i]
                        + "\n\n";
            }
        }

        return report;
    }
}