package implementation;

import java.util.*;
/**
 * Created by Administrator on 2017/9/26.
 */
public class BeautifulDaysattheMovies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        int factor = in.nextInt();
        int result = 0;
        for (int i = start; i <= end; i++) {
            String reverseString = new StringBuffer(String.valueOf(i)).reverse().toString();
            int reverseNumber = Integer.valueOf(reverseString);
            if (Math.abs(i - reverseNumber) % factor == 0) {
                result++;
            }
        }
        System.out.println(result);
    }
}
