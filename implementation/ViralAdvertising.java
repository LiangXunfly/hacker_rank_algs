package implementation;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/26.
 */
public class ViralAdvertising {
    public static int solution(int days) {
        int dayNumber = 2;
        int result = 2;
        for (int i = 2; i <= days; i++) {
            dayNumber = (dayNumber * 3) / 2;
            result += dayNumber;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int days = in.nextInt();
        System.out.println(solution(days));
    }
}
