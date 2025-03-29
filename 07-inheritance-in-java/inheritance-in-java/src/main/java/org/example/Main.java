package org.example;

import java.util.List;
import java.util.Scanner;

/**
 * Main class to manage the zoo.
 */
public class Main {
    /**
     * Scanner object to read input from the user.
     */
    private static Scanner scanner = new Scanner(System.in);

    /**
     * List of animals in the zoo.
     */
    private static List<Animal> animals = List.of(
            // TODO: Uncomment these two lines after implementing the Parrot class
            new Parrot("Polly"),
            new Parrot("Loki"),
            // TODO: Uncomment these two lines after implementing the Lion class
            new Lion("Simba"),
            new Lion("Nala"),
            // TODO: Uncomment these two lines after implementing the Elephant class
            new Elephant("Dumbo"),
            new Elephant("Jumbo")

    );

    /**
     * Main method to manage the zoo.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        while (true) {
            System.out.println("Zoo Manager Menu");
            System.out.println("--------------------");
            System.out.println("1. Feed the animals");
            System.out.println("2. Make the animals speak");
            System.out.println("3. Put the animals to sleep");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    for(Animal animal : animals) {
                        System.out.println(animal.eat());
                    }
                    break;
                case 2:
                    for(Animal animal : animals) {
                        System.out.println(animal.speak());
                    }
                    break;
                case 3:
                    for (Animal animal : animals) {
                        System.out.println(animal.sleep());
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}