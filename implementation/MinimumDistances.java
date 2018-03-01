package implementation;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/12/1.
 */
public class MinimumDistances {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[] array = new int[number];
        for(int i = 0; i < number; i++) {
            array[i] = in.nextInt();
        }
        int step = 1;
        boolean result = false;
        for (; step < number; step++) {
            for (int i = 0; i < number - step; i++) {
                if (array[i] == array[i + step]) {
                    result = true;
                    break;
                }
            }
            if (result == true) {
                break;
            }
        }
        if (step == number) {
            System.out.println(-1);
        }
        else {
            System.out.println(step);
        }
    }
}
