package warmup;

/**
 * Created by Administrator on 2017/8/27.
 */
import java.util.*;
public class TimeConversion {
    static String timeConversion(String s) {
        // Complete this function
        String conversion = s.substring(s.length() - 2);
        String hour = s.substring(0, 2);
        String MS = s.substring(2, 8);
        if (conversion.equals("PM")) {
            if (Integer.parseInt(hour) != 12) {
                hour = String.valueOf(Integer.parseInt(hour) + 12);
            }
        }
        if (conversion.equals("AM")) {
            if (Integer.parseInt(hour) == 12) {
                hour = "00";
            }
        }
        return hour + MS;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
