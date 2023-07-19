package Storing.lists_n_arr;

public class array_for {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5 };
        for (int num : nums) { // short for for(int i = 0; i < nums.length; i++)
            System.out.printf("%d ", num);
        }
    }
}
