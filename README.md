# QuickChat Final PoE

## Student Information

**Student Name:** Edlyn Seleke  
**Student Number:** ST10507517
**Module:** ICT1511 - Programming  
**Project:** QuickChat Final PoE  
**Year:** 2026

---

# Project Overview

QuickChat is a Java-based messaging application developed as part of the Programming Portfolio of Evidence (PoE).

The application was developed over three parts:

- Part 1: User Registration and Login
- Part 2: Messaging Functionality
- Part 3: Arrays, Searching, Reporting, JSON Storage and Automated Testing

The purpose of the application is to allow users to register, log in, create messages, validate recipient information, generate message IDs and hashes, store message information, and search messages using various methods.

---

# Learning Outcomes Demonstrated

This project demonstrates:

- Object-Oriented Programming
- Classes and Objects
- Methods
- Constructors
- Arrays
- String Manipulation
- Loops
- Selection Statements
- Input Validation
- Unit Testing
- JSON Data Handling
- GitHub Version Control
- GitHub Actions CI/CD

---

# Part 1 - Registration and Login

Part 1 focused on user registration and authentication.

## Features

### Username Validation

The username must:

- Contain an underscore (_)
- Be no longer than 5 characters

### Password Validation

The password must:

- Be at least 8 characters long
- Contain a capital letter
- Contain a number
- Contain a special character

### Cell Phone Validation

The cell phone number must:

- Start with the South African international code (+27)
- Follow the required format

### Login Authentication

The system compares entered credentials against stored user credentials and displays the appropriate login message.

## Classes Used

- User.java
- Registration.java
- Login.java

---

# Part 2 - Messaging System

Part 2 expanded the application into a messaging platform.

## Features

### Message Creation

Users can create and send messages after successfully logging in.

### Message Validation

Messages are validated to ensure:

- Message length does not exceed 250 characters
- Recipient cell phone number is correctly formatted

### Message ID

Each message generates a unique 10-digit message ID.

### Message Hash

Each message generates a message hash based on:

- First two digits of the message ID
- Message number
- First and last word of the message

### Message Actions

The user can:

- Send a Message
- Store a Message
- Disregard a Message

## Classes Used

- Message.java
- QuickChat.java

---

# Part 3 - Advanced Message Management

Part 3 introduces message management functionality using arrays.

## Arrays Implemented

The following arrays are used:

```java
sentMessages[]
storedMessages[]
disregardedMessages[]
messageHashes[]
messageIDs[]
recipients[]
```

## Features

### Search Longest Message

The system searches all sent messages and displays the longest message.

### Search by Message ID

The user can search for messages using a specific Message ID.

### Search by Recipient

The user can search for all messages associated with a particular recipient number.

### Delete by Message Hash

Messages can be deleted by searching for a specific message hash.

### Display Report

A report is generated showing:

- Message Hash
- Recipient
- Message Content

### JSON Storage

Stored messages are maintained within a JSON file and can be displayed to the user.

## Classes Used

- MessageManager.java

---

# Project Structure

```text
QuickChat_Final
│
├── README.md
├── pom.xml
├── messages.json
│
├── .github
│   └── workflows
│       └── testjava.yml
│
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── mycompany
│   │               └── quickchat_final
│   │
│   │                   QuickChat.java
│   │                   User.java
│   │                   Registration.java
│   │                   Login.java
│   │                   Message.java
│   │                   MessageManager.java
│
│   └── test
│       └── java
│           └── com
│               └── mycompany
│                   └── quickchat_final
│
│                       RegistrationLoginTest.java
│                       MessageTest.java
│                       MessageManagerTest.java
```

---

# Unit Testing

JUnit 5 is used to verify that functionality works correctly.

## Test Classes

### RegistrationLoginTest.java

Tests:

- Username validation
- Password validation
- Login functionality

### MessageTest.java

Tests:

- Message ID generation
- Message Hash generation
- Recipient validation
- Message length validation

### MessageManagerTest.java

Tests:

- Longest message functionality
- Search by recipient
- Search by message ID
- Delete by hash
- Report generation

---

# GitHub Actions

GitHub Actions is used for Continuous Integration.

Whenever code is pushed to the repository:

1. The workflow automatically starts.
2. Maven builds the project.
3. JUnit tests are executed.
4. Results are displayed in the Actions tab.

Workflow file:

```text
.github/workflows/testjava.yml
```

---

# How to Run the Project

1. Open the project in Apache NetBeans.
2. Clean and Build the project.
3. Run QuickChat.java.
4. Log in using valid credentials.
5. Use the message menu options to interact with the system.

---

# Technologies Used

- Java
- Apache NetBeans IDE
- Maven
- JUnit 5
- JSON
- GitHub
- GitHub Actions

---

# Author

**Edlyn Seleke**

Programming Portfolio of Evidence (PoE)

2026
