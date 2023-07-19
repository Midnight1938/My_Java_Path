package Basics.Operators;

/*
 * Unary Operators
 * These are used to increment, decrement, or negate an expression
 * Theres precrement and postcrement
 */

public class unary {
    public static void main(String[] args) {
        int x = 100;
        System.out.println(++x); // 101
        System.out.println(x++); // 101
        System.out.println(x); // 102
        System.out.println(--x); // 101
        System.out.println(x--); // 101
        System.out.println(x); // 100

    }
}
