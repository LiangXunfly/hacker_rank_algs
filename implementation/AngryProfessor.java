package implementation;

import java.util.*;
/**
 * Created by Administrator on 2017/9/26.
 */
public class AngryProfessor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            int intime = 0;
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
                if (a[a_i] <= 0) {
                    intime++;
                }
            }
            if (intime >= k) {
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
        }
    }
}
