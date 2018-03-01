package implementation;

import java.util.*;
/**
 * Created by Administrator on 2017/9/26.
 */
public class TheHurdleRace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        // your code goes here
        int result = 0;
        for (int i = 0; i < n; i++) {
            result = (height[i] - k > result) ? (height[i] - k) : result;
        }
        System.out.println(result);
    }
}
