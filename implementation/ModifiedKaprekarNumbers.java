package implementation;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/11/14.
 */
public class ModifiedKaprekarNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long smallNumber = in.nextLong();
        long biggerNumber = in.nextLong();
        int counter = 0;
        for (long i = smallNumber; i <= biggerNumber; i++) {
            if (isKaprekarNumber(i)) {
                counter++;
                System.out.print(i);
                System.out.print(" ");
            }
        }
        if (counter == 0) {
            System.out.println("INVALID RANGE");
        }
    }

    public static boolean isKaprekarNumber(long number) {
        long square = number * number;
        String squareString = String.valueOf(square);
        int squareLength = squareString.length();
        int numberLength = String.valueOf(number).length();
        if (squareLength == 1) {
            if (square == number) {
                return true;
            }
            return false;
        }
        String part = squareString.substring(0, numberLength);
        int partNumber = Integer.valueOf(part);
        String remain = squareString.substring(numberLength);
        int remainNumber = Integer.valueOf(remain);
        if (remainNumber == 0) {
            return false;
        }
        if (partNumber + remainNumber == number) {
            return true;
        }
        if (squareLength % 2 == 1) {
            part = squareString.substring(0, numberLength - 1);
            partNumber = Integer.valueOf(part);
            remain = squareString.substring(numberLength - 1);
            remainNumber = Integer.valueOf(remain);
            if (remainNumber == 0) {
                return false;
            }
            if (partNumber + remainNumber == number) {
                return true;
            }
        }
        return false;
    }
}

