package implementation;

import java.util.*;
/**
 * Created by Administrator on 2017/9/14.
 */
public class CatsAndAMouse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            int distanceA = Math.abs(z - x);
            int distanceB = Math.abs(z - y);
            if (distanceA < distanceB) {
                System.out.println("Cat A");
            }
            else if (distanceA == distanceB) {
                System.out.println("Mouse C");
            }
            else {
                System.out.println("Cat B");
            }
        }
    }
}
