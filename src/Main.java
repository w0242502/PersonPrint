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
//    public static void main(String[] args) {
//        // Prompt user for their name and age
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Please enter your name:");
//        String name = scanner.nextLine();
//
//
//        int age=-1;
//        while (age == -1) {
//            try {
//                System.out.println("Please enter your age:");
//                age = scanner.nextInt();
//            } catch (InputMismatchException e) {
//                age = -1;
//                System.out.println("Error! Please enter a valid number for age.");
//                scanner.next();
//            }
//        }
//
//        printPerson(name, age);
//    }
//
//    public static void printPerson(String name, int age) {
//        System.out.println("Hi "+ name + "! You are "+ age + " years young!");
//    }

    public static void main(String[] args){
        Scanner words = new Scanner(System.in);

        System.out.println("(noun, place)");
        String noun1 = words.nextLine();

        System.out.println("(noun, Crime)");
        String noun2 = words.nextLine();
        int number = -1;
        do {
            System.out.println("whole number");
            try {
                number = words.nextInt();

            }catch (Exception e){
                System.out.println("next time type a whole number");
                words.next();
            }
        }while(number < 0);


        System.out.println("(noun, person name)");
        String noun3 = words.next();

        System.out.printf("%S has commited %S at %S %d times", noun3, noun2, noun1, number);

    }

}