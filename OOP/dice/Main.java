package OOP.dice;

public class Main {
    public static void main(String[] args) {
        dice d1 = new dice();
        dice d2 = new dice();

        System.out.println("Rolling more dice...");
        d1.roll();
        d2.roll();
    }
}
