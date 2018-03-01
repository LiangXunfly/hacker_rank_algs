package implementation;

import java.util.*;
/**
 * Created by Administrator on 2017/9/1.
 */
public class AppleAndOrange {
    public static void getRightCount(int[] apple, int m, int[] orange, int n, int s, int t, int a, int b) {
        int apple_counter = 0;
        int orange_counter = 0;
        for (int i = 0; i < m; i++) {
            if (apple[i] + a >= s && apple[i] + a <= t) {
                apple_counter++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (orange[i] + b >= s && orange[i] + b <= t) {
                orange_counter++;
            }
        }
        System.out.println(apple_counter);
        System.out.println(orange_counter);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        getRightCount(apple, m, orange, n, s, t, a, b);
    }
}
