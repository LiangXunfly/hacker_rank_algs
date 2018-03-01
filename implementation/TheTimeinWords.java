package implementation;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/12/15.
 */
public class TheTimeinWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] hourArray = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven"};
        String[] minuteArray = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen",
                            "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty one", "twenty two",
                            "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine"};
        int hour = in.nextInt();
        int minutes = in.nextInt();
        if (minutes == 0) {
            System.out.println(hourArray[hour] + " o' clock");
        }
        else if (minutes == 1) {
            System.out.println("one minute past " + hourArray[hour]);
        }
        else if (minutes < 20 && minutes != 15) {
            System.out.println(minuteArray[minutes - 1] + " minutes past " + hourArray[hour]);
        }
        else if (minutes == 15) {
            System.out.println("quarter past " + hourArray[hour]);
        }
        else if (minutes < 30 && minutes != 30) {
            System.out.println(minuteArray[minutes - 1] + " minutes past " + hourArray[hour]);
    }
        else if (minutes == 30) {
            System.out.println("half past " + hourArray[hour]);
        }
        else if (minutes == 45) {
            System.out.println("quarter to " + hourArray[(hour + 1) % 12]);
        }
        else if (minutes == 59) {
            System.out.println("one minute to " + hourArray[(hour + 1) % 12]);
        }
        else {
            System.out.println(minuteArray[60 - minutes - 1] + " minutes to " + hourArray[(hour + 1) % 12]);
        }
    }
}
