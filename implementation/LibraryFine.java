package implementation;

import java.util.*;
/**
 * Created by Administrator on 2017/9/27.
 */
public class LibraryFine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();
        int fee = 0;
        if (y1 == y2 && m1 == m2 && d1 > d2) {
            fee = (d1 - d2) * 15;
        }
        if (y1 == y2 && m1 > m2) {
            fee = 500 * (m1 - m2);
        }
        if (y1 > y2) {
            fee = 10000;
        }
        System.out.println(fee);
    }
}
