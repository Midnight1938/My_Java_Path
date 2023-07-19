package Basics.Operators;

/*
 * These are self explanatory operators, +-%/ etc
 * These are called binary operators because they require two operands
 */

public class binary {
    public static void main(String[] args) {
        int x = 100 + 50;
        double y = 9.99;
        
        System.out.println(x+y);
        System.out.println(y-x);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);

        // When ints are worked on, the result drops the decimal
        System.out.println(11/3);
        System.out.println(11/3.0);

        /*
         * Assignment operators
         * These are used to assign values to variables
         */
        int a = 10;
        a %= 3;
        System.out.println(a);
    } 
    
}
