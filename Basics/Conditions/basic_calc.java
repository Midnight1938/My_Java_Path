package Basics.Conditions;

import java.util.Scanner;

/*
 * A function in java is similar to a function in C++
 * And we see the use of switch case and ifelse in java
 * Most conditions are similar to C++, while, if, else, switch, case, etc.
 * But there are some differences, like the use of .equals() instead of ==
 * Also, the use of .nextLine() instead of cin
 * And the use of .parseDouble() instead of stoi
 
 * But that is the extent of it so we carry on
 */

public class basic_calc {
    public static void main(String[] args) {
        Scanner scanDt = new Scanner(System.in);

        System.out.print("First number: ");
        double num1 = Double.parseDouble(scanDt.nextLine()); // nextDouble
        System.out.print("Second number: ");
        double num2 = Double.parseDouble(scanDt.nextLine()); // nextDouble

        System.out.print("What operation? ");
        String operation = scanDt.nextLine();

        // calc(num1, num2, operation);
        calcSwitch(num1, num2, operation);

        scanDt.close();
    }

    // If else calc function
    public static void calc(double num1, double num2, String operation) {
        if (operation.equals("add")) {
            System.out.printf("%f + %f = %f", num1, num2, num1 + num2);
        } else if (operation.equals("sub")) {
            System.out.printf("%f - %f = %f", num1, num2, num1 - num2);
        } else if (operation.equals("mul")) {
            System.out.printf("%f * %f = %f", num1, num2, num1 * num2);
        } else if (operation.equals("div")) {
            if (num2 == 0) {
                System.out.println("Cannot divide by zero");
            } else {
                System.out.printf("%f / %f = %f", num1, num2, num1 / num2);
            }
        } else {
            System.out.println("Invalid operation");
        }
    }

    // Switch case calc function
    public static void calcSwitch(double num1, double num2, String operation) {
        switch (operation) {
            case "add":
                System.out.printf("%f + %f = %f", num1, num2, num1 + num2);
                break;
            case "sub":
                System.out.printf("%f - %f = %f", num1, num2, num1 - num2);
                break;
            case "mul":
                System.out.printf("%f * %f = %f", num1, num2, num1 * num2);
                break;
            case "div": // Also check for zero division
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.printf("%f / %f = %f", num1, num2, num1 / num2);
                }
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
    }
}
