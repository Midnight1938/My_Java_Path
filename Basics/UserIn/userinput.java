package Basics.UserIn;

import java.util.Scanner;

/*
 * We need the Scanner module to be able to take inputs
 * It does need closing, unlike most languages
 ! Scanner needs type in scanning, cant scan int with nextLine
    There are nextFloat, Double etc
 */

public class userinput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Whats your name? ");
        String name = scan.nextLine();

        System.out.printf("Oh hi %s! How old? ", name);
        int age = scan.nextInt();

        /*
         * But we dont have a way to have definite input yet!
         * Because its looking for an Enter to take the input buffer
         */
        // ! scan.nextLine(); // Will clear the buffer for nect

        System.out.printf("%d is young, Im 900! How alive do you feel? ", age);
        String livid = scan.nextLine();

        System.out.printf("%s ... same\n", livid);

        scan.close();

    }
}
