package SandwichShop;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for sandwich size
        System.out.println("Choose the size of the sandwich:");
        System.out.println("1: Regular ($5.45)");
        System.out.println("2: Large ($8.95)");
        System.out.print("Enter 1 or 2: ");
        int size = scanner.nextInt();

        //  base price
        float basePrice;
        if (size == 1) {
            basePrice = 5.45f;
        } else if (size == 2) {
            basePrice = 8.95f;
        } else {
            System.out.println("Invalid size selected.");
            return;
        }

        // Prompt for age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Determine discount
        float discount = 0.0f;
        if (age <= 17) {
            discount = 0.10f; // 10% discount for students
        } else if (age >= 65) {
            discount = 0.20f; // 20% discount for seniors
        }

        // Calculate final price
        float finalPrice = basePrice * (1 - discount);

        // Display the cost
        System.out.printf("The cost of your sandwich is: $%.2f%n", finalPrice);


    }
}
