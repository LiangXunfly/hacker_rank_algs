package implementation;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/12/31.
 */
public class TheGridSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for (int i = 1; i <= cases; i++) {
            boolean result = false;
            //获取大地图和小地图
            int R = in.nextInt();
            int C = in.nextInt();
            String[] bigMap = new String[R];
            for (int bigMapIndex = 0; bigMapIndex < R; bigMapIndex++) {
                bigMap[bigMapIndex] = in.next();
            }
            int r = in.nextInt();
            int c = in.nextInt();
            String[] minMap = new String[r];
            for (int minMapIndex = 0; minMapIndex < r; minMapIndex++) {
                minMap[minMapIndex] = in.next();
            }
            //对两个地图进行比对
            for (int j = 0; j <= R - r; j++) {
                ArrayList<Integer> matches = new ArrayList<>();
                int match = bigMap[j].indexOf(minMap[0]);
                if (match == -1) {
                    continue;
                }
                else {
                    matches.add(match);
                    while (bigMap[j].substring(match + 1).indexOf(minMap[0]) != -1) {
                        matches.add(bigMap[j].substring(match + 1).indexOf(minMap[0]) + match + 1);
                        match += bigMap[j].substring(match + 1).indexOf(minMap[0]) + 1;
                    }
                    //对每一个能匹配上小地图第一行的所有位置进行往下继续匹配
                    for (int test : matches) {
                        int counter = 0;
                        int matchLine = j + 1;
                        for (int k = 1; k < r; k++) {
                            if (!bigMap[matchLine].substring(test, test + c).equals(minMap[k])) {
                                break;
                            }
                            counter++;
                            matchLine++;
                        }
                        if (counter == r - 1) {
                            result = true;
                            break;
                        }
                    }
                }
                if (result) {
                    break;
                }
            }
            if (result) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
