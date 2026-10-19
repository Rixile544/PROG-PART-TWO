# PoePartTwo

## Project Description

PoePartTwo is a Java console-based application developed using NetBeans IDE. The application allows users to register an account, log in, and access a messaging menu.

The project demonstrates the use of object-oriented programming, input validation, methods, conditional statements, loops, and unit testing in Java.

## Features

### 1. User Registration
- Allows users to enter a username, password, and cellphone number.
- Validates user information during registration.
- Displays the registration result.

### 2. User Login
- Allows registered users to enter their login details.
- Checks whether the login details are correct.
- Displays the login status.

### 3. Messaging Menu

After a successful login, users can access the following options:

1. **Send Messages:** Allows users to create and send messages to recipients.
2. **Coming Soon:** Displays a message indicating that the feature will be available in the future.
3. **Quit:** Exits the messaging menu.

### 4. Message Management
- Generates unique message IDs.
- Validates recipient cellphone numbers.
- Checks message length.
- Creates message hashes.
- Displays message information.
- Keeps track of the total number of messages sent.

## Technologies Used

- Java
- NetBeans IDE
- Java Scanner class
- JUnit 4 for unit testing
- Git and GitHub for version control

## Project Structure

```text
PoePartOne/
├── src/
│   └── poepartone/
│       ├── PoePartOne.java
│       ├── Login.java
│       ├── Registration.java
│       └── Messages.java
├── test/
│   └── poepartone/
│       ├── LoginTest.java
│       ├── RegistrationTest.java
│       └── MessagesTest.java
└── README.md
```

## Requirements

To run this project, you need:

- Java Development Kit (JDK)
- NetBeans IDE
- JUnit 4 configured in the project for running unit tests

## How to Run the Project

1. Open NetBeans IDE.
2. Open the `PoePartOne` project.
3. Locate `PoePartOne.java` in the `poepartone` package.
4. Run the project.
5. Register by entering the requested details.
6. Log in using your registered username and password.
7. Select an option from the messaging menu.

## Testing

The project includes JUnit test classes for testing registration, login, and messaging functionality.

The tests are intended to check that the methods return the expected results for valid and invalid inputs.

To run the tests in NetBeans:

1. Right-click the project.
2. Select **Test**.
3. Review the test results.

## Author

Rixile Ndlovu

## Project Status

The project is under development. Additional features may be added as development continues.

## References

Apache NetBeans (n.d.) *Apache NetBeans Documentation*. Available at: https://netbeans.apache.org/front/main/help/index.html (Accessed: 19 October 2026).

GitHub Docs (n.d.) *Creating and managing repositories*. Available at: https://docs.github.com/en/repositories/creating-and-managing-repositories (Accessed: 19 October 2026).

JUnit (n.d.) *JUnit 4*. Available at: https://junit.org/junit4/ (Accessed: 19 October 2026).

Oracle (n.d.) *Java Platform, Standard Edition: Scanner Class Documentation*. Available at: https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Scanner.html (Accessed: 19 October 2026).

Oracle (n.d.) *Java Documentation*. Available at: https://docs.oracle.com/en/java/ (Accessed: 19 October 2026).

