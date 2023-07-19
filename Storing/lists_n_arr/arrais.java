package Storing.lists_n_arr;

import java.util.Arrays; // This is the library for arrays
                         // It has a lot of useful functions

public class arrais {
    public static void main(String[] args) {
        char vowels[] = new char[5];
        vowels[0] = 'a';
        vowels[1] = 'u';
        vowels[2] = 'e';
        vowels[3] = 'o';
        vowels[4] = 'i';

        System.out.println(vowels[3]);
        System.out.println(Arrays.toString(vowels));

        char bttr_vowels[] = { 'a', 'e', 'i', 'o', 'u' };
        // unicode hindi uu
        bttr_vowels[3] = '\u0909';
        for (int i = 0; i < bttr_vowels.length; i++) {
            System.out.printf("%c ", bttr_vowels[i]);
        }
        System.out.println();

        // We can also sort arrays
        Arrays.sort(bttr_vowels); // This does change original array
        System.out.println(Arrays.toString(bttr_vowels));

        // The sorting does not include the ending index number
        Arrays.sort(vowels, 1, 4);
        System.out.println(Arrays.toString(vowels));

        // * We can also do key searches
        char key = 'i';
        System.out.println(Arrays.binarySearch(bttr_vowels, key));
        // Theres also a range search
        System.out.println(Arrays.binarySearch(bttr_vowels, 1, 4, key));
        // ! It will be -ve if not found

        // We can fill arrays
        Arrays.fill(bttr_vowels, 'a');
        System.out.println(Arrays.toString(bttr_vowels));

        // * We can also copy arrays, obviously ranges can be used
        char copy_vowels[] = bttr_vowels;
        System.out.println(Arrays.toString(copy_vowels));
        // Like in python, using = will just make a reference to the same array
        // So we use copyOf to make a new array
        char[] copy_vow = Arrays.copyOf(bttr_vowels, 10);// A length can be specified
        System.out.println(Arrays.toString(copy_vow));
        // Theres a clone function too, for copying
        char[] clone_vowl = bttr_vowels.clone(); // Difference is that it is a new object
        System.out.println(Arrays.toString(clone_vowl));

        // There is a method to copy ranges too
        char[] copy_range = Arrays.copyOfRange(bttr_vowels, 1, 4);
        System.out.println(Arrays.toString(copy_range));

        // We can also compare arrays, a normal == will not work
        System.out.println(Arrays.equals(bttr_vowels, clone_vowl));

    }
}
