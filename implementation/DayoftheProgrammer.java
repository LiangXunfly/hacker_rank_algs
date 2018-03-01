package implementation;

import java.util.*;
/**
 * Created by Administrator on 2017/9/13.
 */
public class DayoftheProgrammer {
    static String solve(int year){
        // Complete this function
        int day = 0;
        if (year <= 1917) {
            // 如果是闰年的话那就是8月份完了有244天,否则243天
            if (year % 4 == 0) {
                day = 256 - 244;
            }
            else {
                day = 256 - 243;
            }
            return day + "." + "09." + year;
        }
        else if (year == 1918) {
            if (year % 4 == 0 || (year % 100 != 0 && year % 4 == 0)) {
                day = 256 - 231;
            }
            else {
                day = 256 - 230;
            }
            return day + "." + "09." + year;
        }
        else {
            if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
                day = 256 - 244;
            }
            else {
                day = 256 - 243;
            }
            return day + "." + "09." + year;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
