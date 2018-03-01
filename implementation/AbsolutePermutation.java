package implementation;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/20.
 */
public class AbsolutePermutation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for (int i = 1; i <= cases; i++) {
            boolean result = true;
            int n = in.nextInt();
            int k = in.nextInt();
            int[] array = new int[n];
            int[] exists = new int[n];
            for (int i_exists = 0; i_exists < n; i_exists++) {
                exists[i_exists] = 0;
            }
            for (int j = 1; j <= n; j++) {
                if (k + j > n && -k + j < 1) {
                    result = false;
                    break;
                }
                else if (-k + j > 0 && exists[-k + j - 1] == 0) {
                    array[j - 1] = (-k + j);
                    exists[-k + j - 1] = 1;
                }
                else if (k + j <= n && exists[k + j - 1] == 0){
                    array[j - 1] = (k + j);
                    exists[k + j - 1] = 1;
                }
                else {
                    result = false;
                    break;
                }
            }
            if (result == false) {

                System.out.println(-1);
            }
            else {
                for (int element : array) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        }
    }
}
