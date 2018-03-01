package implementation;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/12/27.
 */
public class Hole {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = Integer.parseInt(in.nextLine());
        int[][] map = new int[size][size];
        for (int i = 0; i < size; i++) {
            String line = in.nextLine();
            for (int j = 0; j < size; j++) {
                map[i][j] = Character.getNumericValue(line.charAt(j));
            }
        }
        int[][] result = new int[size][size];
        if (size >= 3) {
            for (int i = 1; i < size - 1; i++) {
                for (int j = 1; j < size - 1; j++) {
                    int up = map[i - 1][j];
                    int down = map[i + 1][j];
                    int left = map[i][j - 1];
                    int right = map[i][j + 1];
                    if (map[i][j] > up && map[i][j] > down && map[i][j] > left && map[i][j] > right) {
                        result[i][j] = -1;
                    }
                }
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (result[i][j] == -1) {
                    System.out.print("X");
                }
                else {
                    System.out.print(map[i][j]);
                }
            }
            System.out.println();
        }
    }
}
