package OOP.dice;

import java.util.Random;

public class dice {

    Random rand;
    int num;
    dice() {
        System.out.println("Dice created!");
        rand = new Random();
        roll();
    }

    void roll() {
        num = rand.nextInt(6) + 1;
        System.out.println("You rolled a " + num);
    }
}
