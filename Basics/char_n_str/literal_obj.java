package Basics.char_n_str;

/*
 * There are 2 ways to make strings
 * 1. String literal
 *  - String literals are created by using double quotes
 * 2. String object
 *  - String objects are created by using the keyword new
 * 
 * String Pool 
 *  - String Pool is nothing but a storage area in Java heap where string literals stores. 
 *    It is also known as String Intern Pool or String Constant Pool.
 */

public class literal_obj {
    public static void main(String[] args) {
        String txt = "This is Java";
        System.out.println(txt);

        String txt2 = new String("This is \"Java\"");
        System.out.println(txt2);


        String literal1 = "zxcv";
        String literal2 = "zxcv";
        String objStr1 = new String("zxcv");
        String objStr2 = new String("zxcv");

        System.out.println(literal1 == literal2);
        System.out.println(objStr1 == objStr2); // False cuz 2 objects
        
        

    }
}
