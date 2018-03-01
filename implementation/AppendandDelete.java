package implementation;

import java.util.*;
/**
 * Created by Administrator on 2017/9/27.
 */
public class AppendandDelete {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        if (k >= s.length() + t.length()) {
            System.out.println("Yes");
            return;
        }
        int sLength = s.length();
        int tLength = t.length();
        int minLenght = (sLength >= tLength) ? tLength : sLength;
        int sameLenght = 0;
        for (int i = 0; i < minLenght; i++) {
            if (s.charAt(i) == t.charAt(i)) {
                sameLenght++;
            }
            else {
                break;
            }
        }
        int minTimes = tLength - sameLenght + (sLength - sameLenght);
        if (k >= minTimes && (k - minTimes) % 2 == 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
