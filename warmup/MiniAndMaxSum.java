package warmup;

import java.util.*;
/**
 * Created by Administrator on 2017/8/25.
 */
public class MiniAndMaxSum {
    public static void solution(int[] array) {
        int min = array[0];
        int max = array[0];
        long minSum = 0;
        long maxSum = 0;
        for (int i = 1; i < 5; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        if (min == max) {
            System.out.print(min * 4);
            System.out.print(" ");
            System.out.print(max * 4);
        }
        else {
            for (int i = 0; i < 5; i++) {
                if (array[i] == min) {
                    minSum += min;
                } else if (array[i] == max) {
                    maxSum += max;
                } else {
                    minSum += array[i];
                    maxSum += array[i];
                }
            }
            System.out.print(minSum);
            System.out.print(" ");
            System.out.print(maxSum);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        solution(arr);
    }
}
