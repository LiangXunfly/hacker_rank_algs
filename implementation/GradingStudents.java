package implementation;

import java.util.*;

/**
 * Created by Administrator on 2017/9/1.
 */
public class GradingStudents {
    static int[] solve(int[] grades){
        // Complete this function
        int lenght = grades.length;
        for (int i = 0; i < lenght; i++) {
            if (grades[i] >= 38) {
                int difference = 5 - (grades[i] % 5);
                if (difference < 3) {
                    grades[i] = grades[i] + difference;
                }
            }
        }
        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


    }
}
