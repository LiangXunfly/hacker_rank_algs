package implementation;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/12/19.
 */
public class LisasWorkbook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int chapters = in.nextInt();
        int[] problems = new int[chapters];
        int size = in.nextInt();
        for (int i = 0; i < chapters; i++) {
            problems[i] = in.nextInt();
        }
        int current_page = 1;
        int result = 0;
        for (int current_chapter = 0; current_chapter < chapters; current_chapter++) {
            for (int current_problem = 1; current_problem <= problems[current_chapter];) {
                if (current_problem <= current_page && current_problem + size > current_page && problems[current_chapter] >= current_page) {
                    result++;
                }
                current_page++;
                current_problem += size;
            }
        }
        System.out.println(result);
    }
}
