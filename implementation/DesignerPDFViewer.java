package implementation;

import java.util.*;
/**
 * Created by Administrator on 2017/9/26.
 */
public class DesignerPDFViewer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int max_lenght = 0;
        for (int i = 0; i < word.length(); i++) {
            int height = h[(int)(word.charAt(i)) - 97];
            if (height > max_lenght) {
                max_lenght = height;
            }
        }
        System.out.println(max_lenght * word.length());
    }
}
