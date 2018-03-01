package implementation;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/12/31.
 */
public class ManasaAndStones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for (int i = 1; i <= cases; i++) {
            int stones = in.nextInt();
            int first = in.nextInt();
            int second = in.nextInt();
            if (first == second) {
                System.out.println((stones - 1) * first);
            }
            else {
                int min = Math.min(first, second);
                int max = Math.max(first, second);
                for (int j = stones - 1; j >= 0; j--) {
                    System.out.print(j * min + (stones - 1 - j) * max);
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
