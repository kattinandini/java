package com.brigelab.assinmentthree;
import java.util.*;
public class EmployeeWag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of hours worked: ");
        double hoursWorked = scanner.nextDouble();

        System.out.print("Enter the hourly wage rate: ");
        double hourlyRate = scanner.nextDouble();

        System.out.print("Enter the type of employee (1 for full-time, 2 for part-time): ");
        int employeeType = scanner.nextInt();

        double totalWage;

        switch (employeeType) {
            case 1:
                totalWage = hoursWorked * hourlyRate;
                System.out.println("The total wage for full-time employee is: " + totalWage);
                break;
            case 2:
                totalWage = 0.5 * hoursWorked * hourlyRate; // Assuming part-time employees work half the hours of full-time employees
                System.out.println("The total wage for part-time employee is: " + totalWage);
                break;
            default:
                System.out.println("Invalid employee type entered.");
        }
}}
