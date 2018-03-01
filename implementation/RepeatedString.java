package implementation;

import java.util.*;
/**
 * Created by Administrator on 2017/9/28.
 */
public class RepeatedString {
    public static long solve(String s, long n) {
        int sLenght = s.length();
        int oneLenght = sLenght - s.replace("a", "").length();
        long result = 0;
        if (n >= sLenght) {
            long times = n / sLenght;
            result = oneLenght * times;
        }
        int remain = (int)(n % sLenght);
        if (remain == 0) {
            return result;
        }
        String subString = s.substring(0, remain);
        int remainLenght = subString.length() - subString.replace("a", "").length();
        result += remainLenght;
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        System.out.println(solve(s, n));
    }
}
