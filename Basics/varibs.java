package Basics;

/*
 * Primitive Data Types
 * | Data Type  | Size      | 
 * | byte       | 1 byte    |
 * | short      | 2 bytes   |
 * | double     | 8 bytes   |
 * | long       | 8 bytes   |
 * | int        | 4 bytes   |
 * | float      | 4 bytes   |
 * | boolean    | 1 bit     |
 * |char        | 2 bytes   |

 * string is not a primitive data type
 */

public class varibs {
    public static void main(String[] args) {
        // Variables
        int myNum = 55; // Integer (whole number)
        boolean myBool = true; // Boolean
        String myText = "Hello"; // String

        System.out.println(myNum);
        System.out.println(myBool);
        System.out.println(myText);

        // It is mutable by default
        myNum = 100;
        System.out.println("\n" + myNum);

        // Theres also unicode
        char hindi = '\u0905';
        System.out.println("\nAlso Unicode " + hindi);

        // Double and Float can be used for bigger decimals as always
        double myDouble = myNum + 9.99384729235d;
        float myFloat = myNum + 9.3498394299f;
        System.out.println("\n" + myDouble);
        System.out.println(myFloat);
    }
}
