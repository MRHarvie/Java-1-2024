package ca.nl.ca.mitchell.harvie.objects;
/**
 * Introduction to classes + calling them from elsewhere
 */

import java.util.Scanner;

public class FunWithStudents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Fun with Students");

        Student student = new Student();
        System.out.println("Please enter a Name:  ");
        String y = input.next();
        student.setFirstName(y);

        Account account = new Account();
        System.out.println("Please enter a number:  ");
        String x = input.next();
        account.setName(x);

        System.out.printf("Students first name: %s\n", student.getFirstName());
        System.out.printf("Students account: %s", account.getName());
    }
}
