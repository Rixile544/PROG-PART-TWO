
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 */


package poepartone;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Messages {

    ArrayList<String> messageIDs = new ArrayList<>();
    ArrayList<String> recipientNumber = new ArrayList<>();
    ArrayList<String> messages = new ArrayList<>();
    ArrayList<String> msgHash = new ArrayList<>();
    ArrayList<String> messageStatus = new ArrayList<>();

    Scanner input = new Scanner(System.in);
    Random random = new Random();

    int numMessageSent = 0;

    public void sendingMessages() {

        int option;

        do {
            System.out.println("\n===== Select any of the options below =====");
            System.out.println("1. Send Messages");
            System.out.println("2. Coming Soon.");
            System.out.println("3. Quit");

            while (!input.hasNextInt()) {
                System.out.println("Invalid option!");
                input.next();
            }

            option = input.nextInt();
            input.nextLine();

            switch (option) {

                case 1:
                    sendMessages();
                    break;

                case 2:
                    System.out.println("Coming Soon.");
                    break;

                case 3:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option!");
                    break;
            }

        } while (option != 3);
    }

    public void sendMessages() {

        System.out.println("How many messages do you want to send?");

        while (!input.hasNextInt()) {
            System.out.println("Please enter a valid number.");
            input.next();
        }

        int numberOfMessages = input.nextInt();
        input.nextLine();

        if (numberOfMessages <= 0) {
            System.out.println("Please enter a number greater than 0.");
            return;
        }

        for (int i = 1; i <= numberOfMessages; i++) {

            System.out.println("\nMESSAGE " + i);

            String messageID = generateMessageID();

            System.out.println("Enter recipient cell number:");
            String recipient = input.nextLine();

            String recipientResult = checkRecipientCell(recipient);

            if (!recipientResult.equals("Valid number")) {
                System.out.println(recipientResult);
                messageIDs.remove(messageID);
                i--;
                continue;
            }

            System.out.println("Enter your message:");
            String messageText = input.nextLine();

            if (messageText.trim().isEmpty()
                    || messageText.length() > 250) {

                System.out.println(
                        "Your message length should be between 1 and 250 characters."
                );

                messageIDs.remove(messageID);
                i--;
                continue;
            }

            int messageNumber = messages.size() + 1;

            String messageHash = createMessageHash(
                    messageID,
                    messageNumber,
                    messageText
            );

            recipientNumber.add(recipient);
            messages.add(messageText);
            msgHash.add(messageHash);
            messageStatus.add("Sent");
            numMessageSent++;

            System.out.println("Message successfully sent");
        }

        printMessages();

        System.out.println(
                "Total messages sent: " + returnTotalMessages()
        );
    }

    public int returnTotalMessages() {
        return numMessageSent;
    }

    public String generateMessageID() {

        String messageID;

        do {
            long number = 1000000000L
                    + random.nextLong(9000000000L);

            messageID = String.valueOf(number);

        } while (messageIDs.contains(messageID));

        messageIDs.add(messageID);

        return messageID;
    }

    public String checkRecipientCell(String cellPhone) {

        if (cellPhone.matches("^\\+27[0-9]{9}$")
                || cellPhone.matches("^[0-9]{10}$")) {

            return "Valid number";

        } else {
            return "Invalid number.";
        }
    }

    public String createMessageHash(
            String messageID,
            int messageNumber,
            String messageText) {

        String firstTwoNumbers = messageID.substring(0, 2);
        String trimmedMessage = messageText.trim();
        String[] words = trimmedMessage.split("\\s+");

        String firstWord = words[0];
        String lastWord = words[words.length - 1];

        String hash = firstTwoNumbers
                + ":"
                + messageNumber
                + ":"
                + firstWord
                + lastWord;

        return hash.toUpperCase();
    }

    public String SentNessage() {

        System.out.println("\n===== Select any of the options below =====");
        System.out.println("1. Send Messages");
        System.out.println("2. Coming Soon.");
        System.out.println("3. Quit");

        int choice;

        while (!input.hasNextInt()) {
            System.out.println("Invalid option!");
            input.next();
        }

        choice = input.nextInt();
        input.nextLine();

        switch (choice) {

            case 1:
                System.out.println("Send Messages");
                return "Sent";

            case 2:
                System.out.println("Coming Soon.");
                return "Coming Soon.";

            case 3:
                System.out.println("Goodbye!");
                return "Quit";

            default:
                System.out.println("Invalid option!");
                return "Invalid";
        }
    }

    private String SentMessage() {
        return SentNessage();
    }

    public String printMessages() {

        StringBuilder allMessages = new StringBuilder();

        System.out.println("\n===== All messages =====");

        for (int i = 0; i < messages.size(); i++) {

            allMessages.append("\nMessage Number: ")
                    .append(i + 1);

            allMessages.append("\nMessage ID: ")
                    .append(messageIDs.get(i));

            allMessages.append("\nRecipient: ")
                    .append(recipientNumber.get(i));

            allMessages.append("\nMessage: ")
                    .append(messages.get(i));

            allMessages.append("\nMessage Hash: ")
                    .append(msgHash.get(i));

            allMessages.append("\nMessage Status: ")
                    .append(messageStatus.get(i));

            System.out.println("\nMessage " + (i + 1));
            System.out.println("Message ID: " + messageIDs.get(i));
            System.out.println("Recipient: " + recipientNumber.get(i));
            System.out.println("Message: " + messages.get(i));
            System.out.println("Message Hash: " + msgHash.get(i));
            System.out.println("Message Status: " + messageStatus.get(i));
        }

        return allMessages.toString();
    }
}
