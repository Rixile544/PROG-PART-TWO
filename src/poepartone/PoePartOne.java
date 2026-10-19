


package poepartone;

import java.util.Scanner;

public class PoePartOne {

    public static void main(String[] args) {

        Login register = new Login();
        Scanner scan = new Scanner(System.in);
        Messages msg = new Messages();

        System.out.println("\n===== Register =====");

        System.out.print("Please enter the username: ");
        String name = scan.nextLine();

        System.out.print("Enter password: ");
        String password = scan.nextLine();

        System.out.print("Enter cellphone: ");
        String cellphone = scan.nextLine();

        System.out.println(
                register.registerUser(name, password, cellphone)
        );

        if (!register.registerStatus(name, password, cellphone)) {
            scan.close();
            return;
        }

        System.out.println("\n===== Login =====");

        System.out.print("Enter username: ");
        String loginUsername = scan.nextLine();

        System.out.print("Enter password: ");
        String loginPassword = scan.nextLine();

        boolean status = register.loginUser(
                loginUsername, loginPassword
        );

        System.out.println(register.returnLoginStatus(status));

        if (status) {

            int option;

            do {
                System.out.println(
                        "\n===== Select any of the options below ====="
                );
                System.out.println("1. Send Messages");
                System.out.println("2. Coming Soon.");
                System.out.println("3. Quit");

                while (!scan.hasNextInt()) {
                    System.out.println(
                            "Invalid input. Please enter 1, 2 or 3."
                    );
                    scan.nextLine();
                }

                option = scan.nextInt();
                scan.nextLine();

                switch (option) {
                    case 1:
                        msg.sendingMessages();
                        break;

                    case 2:
                        System.out.println("Coming Soon.");
                        break;

                    case 3:
                        System.out.println("Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid option!");
                }

            } while (option != 3);
        }

        scan.close();
    }
}
