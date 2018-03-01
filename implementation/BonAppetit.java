package implementation;

import java.util.*;
/**
 * Created by Administrator on 2017/9/13.
 */
public class BonAppetit {
    static int bonAppetit(int n, int k, int b, int[] ar) {
        // Complete this function
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += ar[i];
        }
        total -= ar[k];
        int annPortion = total / 2;
        if (b == annPortion) {
            System.out.println("Bon Appetit");
            return 0;
        }
        return b - annPortion;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        int result = bonAppetit(n, k, b, ar);
        if (result != 0) {
            System.out.println(result);
        }
    }
}
