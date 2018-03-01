package implementation.nac;

import java.util.*;
/**
 * Created by Administrator on 2017/9/15.
 */
public class ClimbingTheLeaderboard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        HashSet<Integer> set = new HashSet<>();
        for(int scores_i=0; scores_i < n; scores_i++){
            int score = in.nextInt();
            if (!set.contains(score)) {
                set.add(score);
            }
        }
        int m = in.nextInt();
        for(int alice_i=0; alice_i < m; alice_i++){
            int scoreLevel = in.nextInt();
            int rank = 1;
            for (Integer score : set) {
                if (score > scoreLevel) {
                    rank++;
                }
            }
            System.out.println(rank);
        }
    }
}
