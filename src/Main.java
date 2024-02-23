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
        prettyPrint(name, age);
        printPerson(name, age);
    }

    public static void printPerson(String name, int age) {
        System.out.println("Hi "+ name + "! You are "+ age + " years young!");
    }

    public static void prettyPrint(String first, int age) {
        System.out.println(first);
        switch (age) {
            case 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20:
                System.out.println("You're a baby");
                break;
            case 21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38:
                System.out.println("Starting to feel some joint pain right?");
                break;
            case 39,40,41,42,43,44,45,46,47,48,49,50:
                System.out.println("Time for your bimonthly checkup");
                break;
            case 61,62,63,64,65,66,67,68,69,70:
                System.out.println("RETIRED! Hopefully. /: ");
                break;
            default:
                System.out.println("You are either an infant or took great care of yourself during life");
        }
    }
}

