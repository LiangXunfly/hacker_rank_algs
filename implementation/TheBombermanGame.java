package implementation;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/22.
 */
public class TheBombermanGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int R = in.nextInt();
        int C = in.nextInt();
        int time = in.nextInt();
        in.nextLine();
        int[][] grid = new int[R][C];
        if (time % 2 == 0) {
            display(grid, R, C);
            return;
        }
        for (int i = 0; i < R; i++) {
            String line = in.nextLine();
            for (int j = 0; j < C; j++) {
                if (line.charAt(j) == 'O') {
                    grid[i][j] = 0;
                }
                else {
                    grid[i][j] = -1;
                }
            }
        }
        if (time == 1) {
            display(grid, R, C);
            return;
        }
        else if (time == 2) {
            display(new int[R][C], R, C);
            return;
        }
        //处理>3的情况
        deal(grid, R, C);
        if ((time - 3) % 4 == 0) {
            display(grid, R, C);
        }
        //5, 9, 13......的状态和1是不一定一样的,如...O,.O.O
        else {
            deal(grid, R, C);
            display(grid, R, C);
        }
    }

    public static void display(int[][] array, int R, int C) {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (array[i][j] == -1) {
                    System.out.print(".");
                }
                else {
                    System.out.print("O");
                }
            }
            System.out.println();
        }
    }

    public static void deal(int[][] grid, int R, int C) {
        for (int j = 0; j < R; j++) {
            for (int k = 0; k < C; k++) {
                grid[j][k]++;
            }
        }
        for (int j = 0; j < R; j++) {
            for (int k = 0; k < C; k++) {
                if (grid[j][k] == 1) {
                    grid[j][k] = -1;
                    //上方
                    if (j > 0) {
                        if (grid[j - 1][k] != 1) {
                            grid[j - 1][k] = -1;
                        }
                    }
                    //下方
                    if (j < R - 1) {
                        if (grid[j + 1][k] != 1) {
                            grid[j + 1][k] = -1;
                        }
                    }
                    //左方
                    if (k > 0) {
                        if (grid[j][k - 1] != 1) {
                            grid[j][k - 1] = -1;
                        }
                    }
                    //右方
                    if (k < C - 1) {
                        if (grid[j][k + 1] != 1) {
                            grid[j][k + 1] = -1;
                        }
                    }
                }
            }
        }
    }
}
