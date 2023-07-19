package Storing.lists_n_arr;

import java.util.ArrayList;
import java.util.Comparator;

/*
 * We can use ArrayLists to store data
 * They are like vectors in C++
 * All list methods work with ArrayLists

 * Wrapper classes are used to convert primitive types to objects
    * Like int to Integer
 */

public class wrappers {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        System.out.println(nums.toString());
        System.out.println(nums.get(2));
        
        // Replace value by index
        /* 
         ? We need to convert it to Integer 
         ? because it is a primitive type
         Not needed in newer versions of Java
        */
         nums.set(2, Integer.valueOf(10)); 
        System.out.println(nums.toString());

        // Sorting the array
        nums.sort(Comparator.naturalOrder()); // reverseOrder() for descending
        System.out.println(nums.toString());
        System.out.println();

        // Size, isEmpty, contains
        System.out.println(nums.size());
        System.out.println(nums.isEmpty());
        System.out.println(nums.contains(10));
        System.out.println(nums.contains(9));
        System.out.println();

        // forEach is a method of Iterable interface
        // It takes a lambda expression
        nums.forEach(num -> {
            nums.set(nums.indexOf(num), num*2); // set new value by index
            System.out.printf("%d ", num*2);
        });

        System.out.println("\nNew array: " + nums.toString());

        System.out.println();
        System.out.println();
        // delete by index
        nums.remove(2);
        System.out.println(nums.toString());
        // delete by value
        nums.remove(Integer.valueOf(4));
        System.out.println(nums.toString());

        // We can also delete it all
        nums.clear();
        System.out.println(nums.isEmpty());
    }
}
