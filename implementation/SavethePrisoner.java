package implementation;

import java.util.*;
/**
 * Created by Administrator on 2017/9/26.
 */
public class SavethePrisoner {
    static int saveThePrisoner(int n, int m, int s){
        // Complete this function
        int result = (m % n + s - 1) % n;
        if (result == 0) {
            return n;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt();
            int result = saveThePrisoner(n, m, s);
            System.out.println(result);
        }
    }
}
