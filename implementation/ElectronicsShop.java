package implementation;

import java.util.*;
/**
 * Created by Administrator on 2017/9/14.
 */
public class ElectronicsShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int s){
        // Complete this function
        int result = 0;
        int keyboardsLenght = keyboards.length;
        int driversLenght = drives.length;
        for (int i = 0; i < keyboardsLenght; i++) {
            if (keyboards[i] > s) {
                continue;
            }
            for (int j = 0; j < driversLenght; j++) {
                int sum = keyboards[i] + drives[j];
                if (sum > result && sum <= s) {
                    result = sum;
                }
            }
        }
        if (result == 0) {
            return -1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextInt();
        }
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }
}
