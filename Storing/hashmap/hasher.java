package Storing.hashmap;

import java.util.HashMap;

/*
 * HashMaps are like dictionaries in Python
 */

public class hasher {
    public static void main(String[] args) {
        // The <string, integer> are the types of the key and value
        HashMap<String, Integer> scores = new HashMap<String, Integer>();
        scores.put("Alice", 10);
        scores.put("Dave", 40);
        scores.put("Bob", 20);
        scores.put("Charlie", 30);

        System.out.println(scores.toString());
        System.out.println(scores.get("Alice")); // Key is case sensitive
        System.out.println("Size of map: " + scores.size());
    

        // Replace value by key
        scores.replace("Alice", 100);
        // putIfAbsent() will only put the value if the key is not present
        scores.putIfAbsent("Eve", 50);

        System.out.println(scores.toString());
        // If we dont find the key, we can return a default value
        System.out.println(scores.getOrDefault("Frank", -1));


        // Iterating over the HashMap
        // We can use the keySet() method to get all the keys
        // Then we can use the get() method to get the value
        for (String key : scores.keySet()) {
            System.out.printf("%s: %d\n", key, scores.get(key));
        }

        // ArrayList methods work on HashMaps too
        scores.forEach((prsn, val) -> {
            System.out.printf("%s: %d\n", prsn, val);
        });
        System.out.println(scores.containsValue(100));
    }
}
