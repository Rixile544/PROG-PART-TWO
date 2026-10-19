
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poeparttwo;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Part2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        runPart2();
    }

    public static void runPart2() {

        Scanner scan = new Scanner(System.in);

        // Connect Part2.java to Messages.java
        Messages msg = new Messages();

        int option = 0;

        do {
            System.out.println("\n===== Select any of the options below =====");
            System.out.println("1. Send message");
            System.out.println("2. Coming soon");
            System.out.println("3. Exit");

            option = scan.nextInt();

            switch (option) {
                case 1 -> msg.sendingMessages();
                case 2 -> System.out.println("Coming soon");
                case 3 -> System.out.println("Good bye!!");
                default -> System.out.println("Invalid option!!");
            }

        } while (option != 3);
    }

}


