package implementation;

import java.util.*;
/**
 * Created by Administrator on 2017/9/6.
 */
public class BetweenTwoSets {
    static int getTotalX(int[] a, int[] b) {
        // Complete this function
        int aLength = a.length;
        int bLength = b.length;
        if (aLength == 0 || bLength == 0) {
            return 0;
        }
        int aMax = a[0];
        int bMin = b[0];
        int counter = 0;
        for (int i = 1; i < aLength; i++) {
            if (a[i] > aMax) {
                aMax = a[i];
            }
        }
        for (int i = 1; i < bLength; i++) {
            if (b[i] < bMin) {
                bMin = b[i];
            }
        }
        for (int i = aMax; i <= bMin; i++) {
            boolean flag = true;
            for (int f1 = 0; f1 < aLength; f1++) {
                if (i % a[f1] != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == false) {
                continue;
            }
            for (int f2 = 0; f2 < bLength; f2++) {
                if (b[f2] % i != 0) {
                    flag = false;
                    continue;
                }
            }
            if (flag == true) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}
