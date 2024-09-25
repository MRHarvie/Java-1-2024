package ca.nl.ca.mitchell.harvie.Assignment1;
/**
 * Import Scanner Class
 */
import java.util.Scanner;

    /**
     * Initiating FunWithCars Class. Initiates Scanner for user inputs: make, model, year, value.
     */
public class FunWithCars {
    public static void main(String[] args) {
        System.out.println("Let's Have Fun With Cars!");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the car's make: ");
        String make = scanner.nextLine();

        System.out.print("Enter the car' model: ");
        String model = scanner.nextLine();

        System.out.print("Enter the car's year: ");
        int year = scanner.nextInt();

        System.out.print("Enter the car's value: ");
        double value = scanner.nextDouble();

        /**
         * Car instance creation using "Car" class
         */
        Car car = new Car(make, model, year, value);

        /**
         * Print out given information to console.
         */
        System.out.printf("Car Information:\nMake: %s\nModel: %s\nYear: %d\nValue: $%.2f%n",car.getMake(),car.getModel(),car.getYear(),car.getValue());



    }
}
