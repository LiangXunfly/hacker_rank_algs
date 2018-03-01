package implementation;

import java.util.*;
/**
 * Created by Administrator on 2017/9/27.
 */
public class FindDigits {
    public static void solve(int number) {
        int result  = 0;
        int tempNumber = number;
        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            if (digit != 0 && number % digit == 0) {
                result++;
            }
            tempNumber /= 10;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            solve(n);
        }
    }
}
