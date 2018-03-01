package warmup;
import java.util.*;

/**
 * Created by Administrator on 2017/8/25.
 */
public class PlusMinus {
    public static void statistics(int n, int[] array) {
        int zeros = 0;
        int positives = 0;
        int negatives = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == 0) {
                zeros++;
            }
            else if (array[i] < 0) {
                negatives++;
            }
            else {
                positives++;
            }
        }
        System.out.println(String.format("%.6f", (float)positives/n));
        System.out.println(String.format("%.6f", (float)negatives/n));
        System.out.println(String.format("%.6f", (float)zeros/n));

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        statistics(n, arr);
    }
}