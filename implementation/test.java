package implementation;

import java.util.*;
import java.util.zip.CheckedInputStream;

/**
 * Created by Administrator on 2017/9/14.
 */
public class test {
    public static void main(String[] args) {
        String test = "ab";
        char result = test.charAt(0);
        if (result == 'a') {
            System.out.println("get");
        }
        System.out.println(1 / 3 == 0.3333333333333333);

        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println(map.get(3));

        System.out.println("---------jiashi-----------");
        System.out.println(8.09 * 2.32 + 5.58 * 0.30 - 5.08 * 0.33 - 5.02 * 1.76 - 5.00 * 1.70 + 4.7 * 1.3 + 4.65 * 1.84 + 4.63 * 3.32 + 3.12 * 0.93 - 3.1 * 0.46);


        String reverse = new StringBuffer(String.valueOf(120)).reverse().toString();
        System.out.println(Integer.valueOf(reverse));

        System.out.println("------------------------float整型化之后的比较-----------------");
        System.out.println(Math.round(3.2));


        System.out.println("-----------------------------Collection get min value-----------------");
        List<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        System.out.println(Collections.min(list));

        System.out.println("------------------------map remove---------------------");
        HashMap<Integer, Integer> hashmap = new HashMap();
        hashmap.put(1, 2);
        System.out.println(hashmap.size());
        hashmap.remove(1);
        System.out.println(hashmap.size());


        System.out.println("---------------------TreeMap---------------------------");
        TreeMap<Integer, Integer> treemap = new TreeMap<>();
        treemap.put(4, 2);
        treemap.put(3, 3);
        treemap.put(2, 2);
        treemap.put(5, 5);
        System.out.println(treemap.firstKey());

        System.out.println("---------------------String.replace------------------------");
        String s = "abc";
        System.out.println(s.replace("a", ""));
        System.out.println(s);


        System.out.println("--------------------substring----------------------------");
        System.out.println("abc".substring(0, 1));
        System.out.println("bcbccacaacbbacabcabccacbccbababbbbabcccbbcbcaccababccbcbcaabbbaabbcaabbbbbbabcbcbbcaccbccaabacbbacbc".length());


        float num = 2433618 + 982701 + 973647 + 558705 + 531987 + 419739 + 406254 + 377818 + 375311 + 291818 + 265719 + 264011;
        System.out.println(num);


        System.out.println("--------------------list remove-------------------");
        List<Character> charList = new ArrayList<Character>();
        charList.add('a');
        charList.add('b');
        charList.remove(Character.valueOf('b'));
        Collections.sort(charList);
        System.out.println(charList);


        System.out.println("1".substring(0, 0));
    }
}
