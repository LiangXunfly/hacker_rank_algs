package implementation;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by Administrator on 2017/11/17.
 */
public class BeautifulTriplets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = 0;
        int numbers = in.nextInt();
        int[][] container = new int[numbers][2];
        int step = in.nextInt();
        for (int i = 0; i < numbers; i++) {
            container[i][0] = in.nextInt();
            container[i][1] = 0;
        }
        for (int i = 0; i < numbers - 2; i++) {
            if (container[i][1] == 1) {
                continue;
            }
            ArrayList<Integer> list = new ArrayList<>();
            list.add(container[i][0]);
            int counter = 0;
            for (int j = i + 1; j < numbers; j++) {
                if (container[j][0] > container[i][0] + step * (counter + 1)) {
                    break;
                }
                else if (container[j][0] - container[i][0] == step * (counter + 1)) {
                    counter++;
                    list.add(container[j][0]);
                    container[j][1] = 1;
                }
                else {
                    continue;
                }
            }
            int length = list.size();
            if (length >= 3) {
                result += length - 2;
            }
        }
        System.out.println(result);
    }
}
