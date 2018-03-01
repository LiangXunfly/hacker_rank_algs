package implementation;

import java.util.*;
/**
 * Created by Administrator on 2017/9/13.
 */
public class SockMerchant {
    static int sockMerchant(int n, int[] ar) {
        // Complete this function
        HashMap<Integer, Integer> socks = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            if (socks.containsKey(ar[i])) {
                socks.put(ar[i], socks.get(ar[i]) + 1);
            }
            else {
                socks.put(ar[i], 1);
            }
        }
        int result = 0;
        for (Map.Entry<Integer, Integer> pair : socks.entrySet()) {
            result += pair.getValue() / 2;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
