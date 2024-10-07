package ca.nl.ca.mitchell.harvie.Assignment2;

import java.util.Scanner;

/**
 * Initiating FunWithEmployees Class that utilizing a while loop to prompt for employee's information,
 * Then apply a raise of 8% and determine the average salary
 */
public class FunWithEmployees {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Fun With Employees");

// Setting initial values to 0
        double salaryTotal = 0;
        int employeeCounter = 0;
        final int numberEmployees = 3;

// Starting While Loop to Prompt User for Employee Information
        while (employeeCounter < numberEmployees) {
            System.out.print("Enter First Name: ");
            String firstName = input.nextLine();

            System.out.print("Enter Last Name: ");
            String lastName = input.nextLine();

            System.out.print("Enter Salary: ");
            double annualSalary = input.nextDouble();
            input.nextLine();

            // Create an Employee Object
            Employee employee = new Employee(firstName, lastName, annualSalary);

            // Apply 8% Raise
            employee.giveRaise(8);
            System.out.printf("Employee: %s %s, New Salary: %.2f%n",
                    employee.getFirstName(),employee.getLastName(),employee.getAnnualSalary());
            // Add Employee Salary to Total Salaries and Increment Employee Counter
            salaryTotal += employee.getAnnualSalary();
            employeeCounter++;
        }
        double averageSalary = salaryTotal / numberEmployees;
        System.out.printf("Employee Average: %.2f%n", averageSalary);

    }
}
