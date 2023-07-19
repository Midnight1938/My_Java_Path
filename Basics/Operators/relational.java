package Basics.Operators;

/*
 * Relational Operators & Logical too
 * These are used to check the relationship between two operands
 */

public class relational {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 50;

        System.out.println(num1 == num2);
        System.out.println(num1 != num2);
        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);

        // Lets check the age
        int age = 18; // > isnt >=
        System.out.println("\nYou qualify? " + (age > 18 && age < 30)); // And
        System.out.println("Are you either " + (age > 18 || age < 30)); // Or
        System.out.println("Are you opposite " + !(age > 18 && age < 30)); // Not

    }
}
