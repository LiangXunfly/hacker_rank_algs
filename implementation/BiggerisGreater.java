package implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * Created by Administrator on 2017/11/12.
 */
public class BiggerisGreater {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for (int i = 0; i < cases; i++) {
            String str = in.next();
            if (!isValid(str)) {
                System.out.println("no answer");
                continue;
            }
            int length = str.length();
            // 如果字符串整体是有效的话那最终的结果
            String result = "";
            for (int j = 0; j < length - 1; j++) {
                if (isValid(str.substring(j + 1))) {
                    result += str.charAt(j);
                    continue;
                } else {
                    String subStr = str.substring(j + 1);
                    int subLenght = subStr.length();
                    char nextChar = minGreater(str.charAt(j), subStr);
                    result += nextChar;
                    ArrayList<Character> list = new ArrayList<>();
                    list.add(str.charAt(j));
                    for (int k = 0; k < subLenght; k++) {
                        list.add(subStr.charAt(k));
                    }

                    //list.remove(nextChar);
                    //List.remove(int) method removes the element at the specified position from the list, so error

                    list.remove(Character.valueOf(nextChar));
                    Collections.sort(list);
                    int size = list.size();
                    for (int listI = 0; listI < size; listI++) {
                        result += list.get(listI);
                    }
                    break;
                    //必须要break  当子字符串无解时已经结果已经出来了
                }
            }
            System.out.println(result);
        }
    }

    // 判断字符串是否能组合出一个比它更大的字符串
    public static boolean isValid(String str) {
        int length = str.length();
        if (length == 1) {
            return false;
        }
        boolean result = false;
        for (int i = 0; i < length - 1; i++) {
            if (str.charAt(i) < str.charAt(i + 1)) {
                result = true;
            }
        }
        return result;
    }

    // 获取大于某个字符的字符集中的最小那个
    public static char minGreater(char compare, String target) {
        char result = 0;
        int counter = 0;
        int length = target.length();
        for (int i = 0; i < length; i++) {
            if (target.charAt(i) > compare) {
                if (counter == 0) {
                    result = target.charAt(i);
                    counter++;
                }
                else if (target.charAt(i) < result) {
                    result = target.charAt(i);
                }
            }
        }
        return result;
    }
}
