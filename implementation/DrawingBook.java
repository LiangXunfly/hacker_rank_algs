package implementation;

import java.util.*;
/**
 * Created by Administrator on 2017/9/13.
 */
public class DrawingBook {
    static int solve(int n, int p){
        // Complete this function
        int fromLeftToRight = p / 2;

        // 当倒着数时按书最后一页有内容来要方便点
        int fromRightToLeft = (n / 2 * 2 + 1 - p) / 2;
        if (fromLeftToRight > fromRightToLeft) {
            return fromRightToLeft;
        }
        else {
            return fromLeftToRight;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
