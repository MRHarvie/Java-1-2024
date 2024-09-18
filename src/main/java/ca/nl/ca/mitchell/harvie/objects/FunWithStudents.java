package ca.nl.ca.mitchell.harvie.objects;
/**
 * Introduction to classes + calling them from elsewhere
 */

import java.util.Scanner;

public class FunWithStudents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Fun with Students");
        //Initiating a class named "student"
        Student firstStudent = new Student();
        Student secondStudent = new Student();
        
        System.out.println("Please enter a Name:  ");
        String y = input.next();
        firstStudent.setFirstName(y);

        System.out.println("Please enter a Name:  ");
        String y2 = input.next();
        secondStudent.setFirstName(y2);

        Account account = new Account();
        System.out.println("Please enter a number:  ");
        String x = input.next();
        account.setName(x);

        System.out.printf("Students name: %s\n", firstStudent.getFirstName());
        System.out.printf("Second Students name: %s\n", secondStudent.getFirstName());
        System.out.printf("Students account: %s", account.getName());
    }
}
