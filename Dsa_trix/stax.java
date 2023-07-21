package Dsa_trix;

import java.util.Stack;

public class stax {
    public static void main(String[] args) {
        System.out.println("Stacks");

        // Stacks are a type of data structure that follows the LIFO (Last In First Out)
        Stack<String> gamez = new Stack<String>();
        chk_empty(gamez, true);
        chk_amt(gamez);
        System.out.println("Added some games\n");
        gamez.push("Tintin: The secret of the unicorn");
        gamez.push("Mark of the Ninja");
        gamez.push("Far Cry 3");
        gamez.push("Warframe");
        gamez.push("Dishonored");
        gamez.push("Inspector Waffles");
        chk_amt(gamez);
        System.out.println("Top most game is: " + gamez.peek());
    }

    public static boolean chk_empty(Stack<String> shelf, boolean outer) {
        boolean isEmpty = shelf.empty();

        if (outer) {
            return !isEmpty;
        } else {
            if (isEmpty) {
                System.out.println("Shelf is empty");
            } else {
                System.out.println("Shelf isn't empty");
            }
            return !isEmpty;
        }
    }

    public static void chk_amt(Stack<String> shelf) {
        if (chk_empty(shelf, false)) {
            System.out.println("The amount of games in the shelf is: " + shelf.size());
        } else {
            System.out.println("There are none man");
        }
    }
}
