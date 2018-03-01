package warmup;
import java.util.*;

/**
 * Created by LiangXunfly on 2017/8/25.
 */
public class Staircase {
    public static void solution(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        solution(n);
    }
}
