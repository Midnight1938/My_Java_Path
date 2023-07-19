package Basics.UserIn;

import java.util.Scanner;

/*
 * Apart from using an extra nextLine()
 * We can use the Integer.parseInt() method to parse a string to an int
 * That makes the overflow problem go away, and it makes the code cleaner
 ! We can usually use nextLine for everything, and parse it to the type we want
 */

public class parseinput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("How old? ");
        int age = Integer.parseInt(scan.nextLine());

        System.out.printf("%d is young, Im 900! How alive do you feel? ", age);
        String livid = scan.nextLine();

        System.out.printf("%s ... same\n", livid);

        float pi = Float.parseFloat("3.1415926535");
        System.out.printf("Heres Pi: %f", pi);

        scan.close(); // ! Dont forget!

    }
}
