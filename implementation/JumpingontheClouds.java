package implementation;

import java.util.*;
/**
 * Created by Administrator on 2017/9/27.
 */
public class JumpingontheClouds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int target = 0;
        int level = 100;
        do  {
            target = (target + k) % n;
            if (c[target] == 1) {
                level -= 2;
            }
            level -= 1;
        } while (target != 0);
        System.out.println(level);
    }
}
