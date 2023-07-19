package Basics.Conditions;

public class loops {
    public static void main(String[] args) {

        // forLoop();
        // Nested for multiplication table
        for (int i = 1; i <= 3; i++) {
            System.out.printf("Multiplication table of %d\n", i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }
    }

    // Function to show for
    public static void forLoop() {
        // Simple multiplication table
        int num = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", num, i, num * i);
        }
    }

    // Function to show while
    public static void whileLoop() {
        int num = 3;
        // While loop
        int i = 1;
        while (i <= 10) {
            System.out.printf("%d * %d = %d\n", num, i, num * i);
            i++;
        }
        System.out.println();

        // Do while loop
        i = 1;
        num = 7;
        do {
            System.out.printf("%d * %d = %d\n", num, i, num * i);
            i++;
        } while (i <= 10);
    }
}
