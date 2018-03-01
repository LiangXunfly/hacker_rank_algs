package implementation;

import java.util.Scanner;
/**
 * Created by Administrator on 2017/11/9.
 */
public class TaumB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            long total = 0;
            if (x < y) {
                total = b * x;
                if (z < (y - x)) {
                    total += w * (x + z);
                }
                else {
                    total += w * y;
                }
            }
            else if (x == y) {
                total = (b + w) * x;
            }
            else {
                total = w * y;
                if (z < (x - y)) {
                    total += b * (y + z);
                }
                else {
                    total += b * x;
                }
            }
            System.out.println(total);
        }
    }
}
