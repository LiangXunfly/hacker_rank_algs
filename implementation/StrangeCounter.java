package implementation;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/6.
 */
public class StrangeCounter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double seconds = in.nextDouble();
        double result = 0;
        int time = 1;
        while (seconds > 3 * (Math.pow(2, time) - 1)) {
            time++;
        }
        if (time == 1) {
            result = 3 - seconds + 1;
        }
        else {
            double index = seconds - (3 * (Math.pow(2, time - 1) - 1));
            result = 3 * Math.pow(2, time - 1) - index + 1;
        }
        System.out.println(new BigDecimal(result).toBigInteger());
    }
}
