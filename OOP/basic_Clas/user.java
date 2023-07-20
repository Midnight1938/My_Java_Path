package OOP.basic_Clas;

import java.time.LocalDate;

public class user {
    public String name;
    public int age;
    public LocalDate dob;
    
    /*
    * A constructor!
    public user(String name, int age, LocalDate dob) {
        this.name = name;
        this.age = age;
        this.dob = dob;
    }
    */
    
    public String toString() {
    return String.format("Name: %s\nAge: %d\nEmail: %s\n", name, age, dob.toString());
    }

}
