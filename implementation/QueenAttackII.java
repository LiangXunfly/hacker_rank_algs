package implementation;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/28.
 */
public class QueenAttackII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int number = in.nextInt();
        int rQueen = in.nextInt();
        int cQueen = in.nextInt();

        //初始化map
        HashMap<String, Integer> result = new HashMap<>();
        result.put("left", cQueen - 1);
        result.put("right", size - cQueen);
        result.put("up", size - rQueen);
        result.put("down", rQueen - 1);
        result.put("leftUp", Math.min(size - rQueen, cQueen - 1));
        result.put("rightUp", Math.min(size - rQueen, size - cQueen));
        result.put("leftDown", Math.min(rQueen - 1, cQueen - 1));
        result.put("rightDown", Math.min(rQueen - 1, size - cQueen));

        for (int a0 = 0; a0 < number; a0++) {
            int rObstacle = in.nextInt();
            int cObstacle = in.nextInt();

            // 处理正上方的障碍物
            if (rObstacle > rQueen && cObstacle == cQueen) {
                int upTemp = rObstacle - rQueen - 1;
                if (upTemp < result.get("up")) {
                    result.put("up", upTemp);
                }
            }
            //处理正下方的障碍物
            else if (rObstacle < rQueen && cObstacle == cQueen) {
                int downTemp = rQueen - rObstacle - 1;
                if (downTemp < result.get("down")) {
                    result.put("down", downTemp);
                }
            }
            //处理正左方的障碍物
            else if (rObstacle == rQueen && cQueen > cObstacle) {
                int leftTemp = cQueen - cObstacle - 1;
                if (leftTemp < result.get("left")) {
                    result.put("left", leftTemp);
                }
            }
            //处理正右方的障碍物
            else if (rObstacle == rQueen && cObstacle > cQueen) {
                int rightTemp = cObstacle - cQueen - 1;
                if (rightTemp < result.get("right")) {
                    result.put("right", rightTemp);
                }
            }
            else {
                int cSub = cObstacle - cQueen;
                int rSub = rObstacle - rQueen;
                //处理左上方以及右下方的障碍物
                if (rSub % cSub == 0 && rSub / cSub == -1) {
                    if (rSub > 0) {
                        int temp = rSub - 1;
                        if (temp < result.get("leftUp")) {
                            result.put("leftUp", temp);
                        }
                    } else {
                        int temp = Math.abs(rSub) - 1;
                        if (temp < result.get("rightDown")) {
                            result.put("rightDown", temp);
                        }
                    }
                }

                //处理右上方以及左下方的障碍物
                if (rSub % cSub == 0 && rSub / cSub == 1) {
                    if (rSub > 0) {
                        int temp = rSub - 1;
                        if (temp < result.get("rightUp")) {
                            result.put("rightUp", temp);
                        }
                    } else {
                        int temp = Math.abs(rSub) - 1;
                        if (temp < result.get("leftDown")) {
                            result.put("leftDown", temp);
                        }
                    }
                }
            }
        }
        // 统计各个方向的结果
        int total = 0;
        for (String key: result.keySet()) {
            total += result.get(key);
        }
        System.out.println(total);
    }
}
