package Basics.char_n_str;

/*
 * Strings comtain functions that can help in parsing data
 */

public class parsing {
    public static void main(String[] args) {
        String name = "OpenSuse Tumbleweed";

        System.out.println(name.length()); // Basic Length
        System.out.println(name.isEmpty());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(name.replace("Tumbleweed", "Leap"));
        System.out.println(name); // Doesnt change the original

        System.out.println(name.contains("Suse"));
        System.out.println("");

        // There are ways to compare objects
        String objStr1 = new String("zxcv");
        String objStr2 = new String("zxcv");

        System.out.println(objStr1.equals(objStr2));
        objStr2 = "ZXCV";
        System.out.println(objStr1.equalsIgnoreCase(objStr2));

    }

}
