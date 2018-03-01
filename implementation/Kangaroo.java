package implementation;

import java.util.*;
/**
 * Created by Administrator on 2017/9/5.
 */
public class Kangaroo {
    static String kangaroo(int x1, int v1, int x2, int v2) {
        // Complete this function
        String result;
        if ((x2 > x1 && v2 > v1) || (x1 > x2 && v1 > v2)) {
            result = "NO";
        }
        else if(v1 == v2 && x1 != x2) {
            result = "NO";
        }
        else if (v1 != v2 && x1 == x2) {
            result = "NO";
        }
        else if (v1 == v2 && x1 == x2){
            result = "YES";
        }
        else if (Math.abs(x1 - x2) % Math.abs(v1 - v2) == 0) {
            result = "YES";
        }
        else {
            result = "NO";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);

    }
}
