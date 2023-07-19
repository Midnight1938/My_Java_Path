package OOP;

import java.time.LocalDate;

/*
 * Getters and setters are used to access private variables
 * They are used to implement encapsulation
 * Classes are like those in C++
 */

public class main {
    public static void main(String[] args) {
        user u1 = new user();
        u1.name = "Self";
        u1.age = 18;
        u1.dob = LocalDate.parse("2004-10-14");

        System.out.println(u1.toString());
    
        user u2 = new user();
        u2.name = "Other";
        u2.age = 18;
        u2.dob = LocalDate.parse("2000-12-26");

        System.out.println(u2.toString());
    }
}
