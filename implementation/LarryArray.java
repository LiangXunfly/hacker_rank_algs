package implementation;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/2/2.
 */
public class LarryArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for (int i = 0; i < cases; i++) {
            int length = in.nextInt();
            int[] array = new int[length];
            for (int j = 0; j < length; j++) {
                array[j] = in.nextInt();
            }
        }
    }
}
