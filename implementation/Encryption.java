package implementation;

import java.util.Scanner;
/**
 * Created by Administrator on 2017/11/9.
 */
public class Encryption {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int lenght = s.length();
        double factor = Math.sqrt(lenght);
        int rows = (int)factor;
        int columns = 0;
        if (factor == (int)factor) {
            columns = (int)factor;
        }
        else if (rows * (rows + 1) >= lenght) {
            columns = rows + 1;
        }
        else {
            rows++;
            columns = rows;
        }
        char[][] array = new char[rows][columns];
        int row = 0;
        int column = 0;
        for (int i = 0; i < lenght; i++) {
            array[row][column] = s.charAt(i);
            if (column == columns - 1) {
                row++;
                column = 0;
            }
            else {
                column++;
            }
        }
        int lastLineContains = lenght % columns;
        if (lastLineContains == 0) {
            lastLineContains = columns;
        }
        for (int i = 0; i < columns; i++) {
            String result = "";
            for (int j = 0; j < rows; j++) {
                if (j < rows - 1) {
                    result += array[j][i];
                }
                else if (i < lastLineContains) {
                    result += array[j][i];
                }
            }
            System.out.print(result);
            if (i < columns - 1) {
                System.out.print(" ");
            }
        }
    }
}
