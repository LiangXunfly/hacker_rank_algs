package implementation;

import java.util.*;
/**
 * Created by Administrator on 2017/9/27.
 */
public class CuttheSticks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int arr_i=0; arr_i < n; arr_i++){
            int key = in.nextInt();
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            }
            else {
                map.put(key, 1);
            }
        }
        int result = n;
        while (result != 0) {
            System.out.println(result);
            int key = map.firstKey();
            result -= map.get(key);
            map.remove(key);
        }
    }
}
