package Basics.Conditions;

import java.util.Scanner;

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
