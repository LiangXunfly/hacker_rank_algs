package implementation;

import java.util.*;
/**
 * Created by Administrator on 2017/9/26.
 */
public class UtopianTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            if (n == 0) {
                System.out.println(1);
            }
            else {
                int year = n / 2;
                int result = 0;
                result = ((int)Math.pow(2, year) - 1) * 2 + 1;
                if (n % 2 == 1) {
                    result *= 2;
                }
                System.out.println(result);
            }
        }
    }
}
