package implementation.nac;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/12/27.
 */
public class FairRations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int subjects = in.nextInt();
        int[] loaves = new int[subjects];
        for (int i = 0; i < subjects; i++) {
            loaves[i] = in.nextInt();
        }
    }
}
