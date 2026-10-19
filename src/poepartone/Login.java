
package poepartone;

import java.util.Scanner;

/**
 * Handles user login and registration status.
 *
 * @author Student
 */
public class Login extends Registration {

    /**
     * Checks whether the username and password entered
     * match the details used during registration.
     *
     * @param username username entered during login
     * @param password password entered during login
     * @return true if the login details are correct
     */
    public boolean loginUser(String username, String password) {

        return username.equals(userName)
                && password.equals(passWord);
    }

    /**
     * Allows the user to keep trying to log in until
     * the correct username and password are entered.
     *
     * @param scan Scanner used to receive user input
     */
    public void loginWithAttempts(Scanner scan) {

        boolean loginStatus = false;

        while (!loginStatus) {

            System.out.println("\n=================================");
            System.out.println("              LOGIN");
            System.out.println("=================================");

            System.out.print("Enter username: ");
            String username = scan.nextLine();

            System.out.print("Enter password: ");
            String password = scan.nextLine();

            loginStatus = loginUser(username, password);

            if (loginStatus) {

                System.out.println("Login success.");

                System.out.print("Enter your name: ");
                String name = scan.nextLine();

                System.out.println("Welcome " + name);

            } else {

                System.out.println(
                        "Username or password incorrect, please try again."
                );
            }
        }
    }

    /**
     * Returns the appropriate login status message.
     *
     * @param loginStatus result of the login attempt
     * @return login status message
     */
    public String returnLoginStatus(boolean loginStatus) {

        if (loginStatus) {

            return "Login success.";

        } else {

            return "Username or password incorrect, please try again.";
        }
    }

    /**
     * Checks whether the registration details are provided.
     *
     * @param name registered name
     * @param password registered password
     * @param cellphone registered cellphone number
     * @return true if all three values are non-empty
     */
    public boolean registerStatus(
            String name,
            String password,
            String cellphone) {

        return name != null && !name.trim().isEmpty()
                && password != null && !password.trim().isEmpty()
                && cellphone != null && !cellphone.trim().isEmpty();
    }
}
