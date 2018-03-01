package implementation;

import java.util.*;
/**
 * Created by Administrator on 2017/9/8.
 */
public class MigratoryBirds {
    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        HashMap<Integer, Integer> types = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            if (types.containsKey(ar[i])) {
                types.put(ar[i], types.get(ar[i]) + 1);
            }
            else {
                types.put(ar[i], 1);
            }
        }
        int maxCounter = 0;
        int minType = 0;
        for (Map.Entry<Integer, Integer> pair : types.entrySet()){
            if (pair.getValue() > maxCounter) {
                minType = pair.getKey();
                maxCounter = pair.getValue();
            }
            else if (pair.getValue() == maxCounter) {
                if (minType > pair.getKey()) {
                    minType = pair.getKey();
                }
            }
        }
        return minType;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
