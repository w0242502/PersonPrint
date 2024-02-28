/**
 * Main.java
 * Author: David Kristiansen (W0242502)
 * Date: 2024-02-14
 * Time: 10:35 a.m.
 * Description:
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Prompt user for their name and age
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = scanner.nextLine();


        int age=-1;
        while (age == -1) {
            try {
                System.out.println("Please enter your age:");
                age = scanner.nextInt();
            } catch (InputMismatchException e) {
                age = -1;
                System.out.println("Error! Please enter a valid number for age.");
                scanner.next();
            }
        }

        printPerson(name, age);
        nameLetterCounter(name, age);
    }

    public static void printPerson(String name, int age) {
        System.out.println("Hi "+ name + "! You are "+ age + " years young!");
    }

    public static void nameLetterCounter(String name, int age) {

        System.out.printf("This person is named: %s, and their age is: %d.\n", name, age);

        int totalLength = 0;

        for (int i = 0; i < name.length(); i++) {
            totalLength += 1;
        }

        System.out.printf("This person's name has: %d letters", totalLength);
    }

}