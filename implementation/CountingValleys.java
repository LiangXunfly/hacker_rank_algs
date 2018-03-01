package implementation;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/13.
 */
public class CountingValleys {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String description = in.next();
        int[] steps = new int[n + 1];
        steps[0] = 0;
        for (int i = 0; i < n; i++) {
            if (description.charAt(i) == 'U') {
                steps[i + 1] = steps[i] + 1;
            }
            else {
                steps[i + 1] = steps[i] - 1;
            }
        }
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (steps[i] == 0 && steps[i - 1] < 0) {
                result++;
            }
        }
        System.out.println(result);
    }
}
