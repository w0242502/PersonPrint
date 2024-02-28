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


        int age = -1;
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
        tacoBell(name, age);
    }

    public static void printPerson(String name, int age) {
        System.out.println("Hi " + name + "! You are " + age + " years young!");
    }

    public static void tacoBell(String name, int age) {
        if (age <= 25) {
            int item = (int) (Math.random() * 4);
            String[] menu = {"Cheesy Gordita Crunches", "Chalupa Supremes", "Baja Blasts", "Nacho Cheese Doritos® Locos Tacos"};
            System.out.println("Order for " + name + ". Here are your " + age + " " + menu[item] + ".");
        } else {
            System.out.println("You're " + age + "? Here's your ensure and metamucil smoothie, " + name + ".");
        }
    }

    public static void nameLetterCounter(String name, int age) {

        System.out.printf("This person is named: %s, and their age is: %d.\n", name, age);

        int totalLength = 0;

        for (int i = 0; i < name.length(); i++) {
            totalLength += 1;
        }

        System.out.printf("This person's name has: %d letters", totalLength);
    }

    public static void printString(String name, int age) {
        if (age < 10) {
            System.out.println(name + " is " + age + " years old! Goo goo gah gah.");
        }
        else if ((age > 10) && (age < 20)) {
            System.out.println(name + " is " + age + " years old! Enjoy your youth while you have it.");
        }
        else if ((age > 20) && (age < 30)) {
            System.out.println(name + " is " + age + " years old! Live your life to its fullest!");
        }
        else if ((age > 30) && (age < 40)) {
            System.out.println(name + " is " + age + " years old! " + age + " years ago, I almost disappeared in the jungle!");
        }
        else if ((age > 40) && (age < 50)) {
            System.out.println(name + " is " + age + " years old! I have been committing tax fraud since you were born!");
        }
        else if ((age > 50) && (age < 70)) {
            System.out.println(name + " is " + age + " years old! Time to slow down, eh?");
        }
        else if ((age > 70) && (age < 90)) {
            System.out.println(name + " is " + age + " years old! DO NOT FALL DOWN, it will not end well.");
        }
        else if ((age > 90) && (age < 95)) {
            System.out.println(name + " is " + age + " years old! Congrats for making it this far.");
        }
        else if ((age > 95) && (age < 100)) {
            System.out.println(name + " is " + age + " years old! You have watched the world change drastically.");
        }
        else if (age >= 100) {
            System.out.println(name + " is " + age + " years old! Tell us your secrets!");
        }
    }

}
