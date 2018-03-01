package implementation.nac;

import java.util.*;
/**
 * Created by Administrator on 2017/9/14.
 */
public class FormingAMagicSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] s = new int[3][3];
        for(int s_i=0; s_i < 3; s_i++){
            for(int s_j=0; s_j < 3; s_j++){
                s[s_i][s_j] = in.nextInt();
            }
        }
        //  Print the minimum cost of converting 's' into a magic square
        int result = Math.abs(s[1][1] - 5);
        System.out.println(result);
    }
}
