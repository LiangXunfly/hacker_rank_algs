package implementation;

import java.util.*;
/**
 * Created by Administrator on 2017/9/27.
 */
public class SherlockandSquares {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int caseNumber = in.nextInt();
        for (int i = 0; i < caseNumber; i++) {
            int start = in.nextInt();
            int end = in.nextInt();
            int first = (int)Math.ceil(Math.sqrt(start));
            int last = (int)Math.floor(Math.sqrt(end));
            System.out.println(last - first + 1);
        }
    }
}
