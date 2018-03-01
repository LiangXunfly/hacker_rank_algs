package implementation;

import java.util.*;
/**
 * Created by Administrator on 2017/9/28.
 */
public class JumpingOnTheClouds2 {
    public static int solve(int n, int[] array) {
        int index = 0;
        int result = 0;
        while (index != n - 1) {
            if (index != n- 2 && array[index+2] == 0) {
                index++;
            }
            result++;
            index++;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        System.out.println(solve(n, c));
    }
}
