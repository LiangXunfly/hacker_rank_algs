package implementation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/28.
 */
public class EqualizeTheArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < number; i++) {
            int key = in.nextInt();
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            }
            else {
                map.put(key, 1);
            }
        }
        int maxNumber = Collections.max(map.values());
        System.out.println(number - maxNumber);
    }
}
