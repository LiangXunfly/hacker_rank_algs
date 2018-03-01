package implementation;

import java.util.Scanner;
/**
 * Created by Administrator on 2017/12/17.
 */
public class ChocolateFeast {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int money = in.nextInt();
            int price = in.nextInt();
            int step = in.nextInt();
            int number = money / price;
            int result = number;
            while (number >= step) {
                result++;
                number = number - step + 1;
            }
            System.out.println(result);
        }
    }
}
