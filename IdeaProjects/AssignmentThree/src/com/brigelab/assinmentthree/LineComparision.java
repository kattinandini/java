package com.brigelab.assinmentthree;
import java.util.*;
public class LineComparision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates for the first line:");
        System.out.print("Enter x1: ");
        int x1 = scanner.nextInt();
        System.out.print("Enter y1: ");
        int y1 = scanner.nextInt();
        System.out.print("Enter x2: ");
        int x2 = scanner.nextInt();
        System.out.print("Enter y2: ");
        int y2 = scanner.nextInt();

        double length1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.println("Enter coordinates for the second line:");
        System.out.print("Enter x1: ");
        int a1 = scanner.nextInt();
        System.out.print("Enter y1: ");
        int b1 = scanner.nextInt();
        System.out.print("Enter x2: ");
        int a2 = scanner.nextInt();
        System.out.print("Enter y2: ");
        int b2 = scanner.nextInt();

        double length2 = Math.sqrt(Math.pow((a2 - a1), 2) + Math.pow((b2 - b1), 2));

        System.out.println("Length of the first line: " + length1);
        System.out.println("Length of the second line: " + length2);

        if (length1 == length2) {
            System.out.println("Both lines are equal in length.");
        } else if (length1 > length2) {
            System.out.println("The first line is longer than the second line.");
        } else {
            System.out.println("The second line is longer than the first line.");
        }

        scanner.close();
    }
}
