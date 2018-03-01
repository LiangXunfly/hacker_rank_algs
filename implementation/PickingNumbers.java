package implementation;

import java.util.*;
/**
 * Created by Administrator on 2017/9/14.
 */
public class PickingNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int a_i=0; a_i < n; a_i++){
            int number = in.nextInt();
            if (map.containsKey(number)) {
                map.put(number, map.get(number) + 1);
            }
            else {
                map.put(number, 1);
            }
        }
        int result = 0;
        int i = 0;
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (i == 0) {
                result = pair.getValue();
                i++;
            }
            if (map.get(pair.getKey() + 1) != null && map.get(pair.getKey() + 1) + pair.getValue() > result) {
                result = map.get(pair.getKey() + 1) + pair.getValue();
            }
            if (pair.getValue() > result) {
                result = pair.getValue();
            }
        }
        System.out.println(result);
    }
}
