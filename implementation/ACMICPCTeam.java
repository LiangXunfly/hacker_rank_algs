package implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * Created by Administrator on 2017/11/6.
 */
public class ACMICPCTeam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String topic[] = new String[n];
        for(int topic_i=0; topic_i < n; topic_i++){
            topic[topic_i] = in.next();
        }
        ArrayList<Integer> list = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int topics = 0;
                for (int k = 0; k < m; k++) {
                    if (topic[i].charAt(k) == '1' || topic[j].charAt(k) == '1') {
                        topics++;
                    }
                }
                if (topics > max) {
                    max = topics;
                }
                list.add(topics);
            }
        }
        int max_times = Collections.frequency(list, max);
        System.out.println(max);
        System.out.println(max_times);
    }
}
