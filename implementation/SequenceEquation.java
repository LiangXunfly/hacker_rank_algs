package implementation;

import java.util.*;
/**
 * Created by Administrator on 2017/9/27.
 */
public class SequenceEquation {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        LinkedList<Integer> sequence = new LinkedList<>();
        sequence.add(0, 0);
        for (int i = 1; i <= number; i++) {
            sequence.add(i, in.nextInt());
        }
        for (int i = 1; i <= number; i++) {
            int result = sequence.indexOf(sequence.indexOf(i));
            System.out.println(result);
        }
    }
}
