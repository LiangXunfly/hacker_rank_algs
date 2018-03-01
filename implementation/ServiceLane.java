package implementation;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/12/19.
 */
public class ServiceLane {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int cases = in.nextInt();
        int[] values = new int[number];
        for (int i = 0; i < number; i++) {
            values[i] = in.nextInt();
        }
        for (int i = 0; i < cases; i++) {
            int start = in.nextInt();
            int end = in.nextInt();
            int result = end;
            for (int j = start; j <= end; j++) {
                if (values[j] < result) {
                    result = values[j];
                }
            }
            System.out.println(result);
        }
    }
}
