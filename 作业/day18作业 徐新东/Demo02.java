package home;

import java.io.*;
import java.util.TreeMap;

/**
 * projectName:SETest
 * author:xuxindong
 * time:2022/3/7 16:45
 * description:
 */
//2、随意录入一个文件的路径，判断该文件中每个字符出现多少次
//        将该文件中的每个字符和字符的个数关系，保存在一个新文件counts.txt中
//        举例：
//        有一个文件：a.txt    该文件中的内容为：abcdabcd你好？！你好
//        那么counts.txt中保存的信息为：
//        a字符有2个
//        b字符有2个
//        c字符有2个
//        .............
public class Demo02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new FileReader("day18/c.txt"));
        BufferedWriter bfw = new BufferedWriter(new FileWriter("day18/counts.txt"));
        TreeMap<Character, Integer> cm = new TreeMap<>();
        int x;
        while ((x = bfr.read()) != -1) {
            cm.put((char) x, cm.containsKey((char) x) ? cm.get((char) x) + 1 : 1);
        }
        for (Character character : cm.keySet()) {
            Integer integer = cm.get(character);
            bfw.write(character + "字符有" + integer + "个");
            bfw.newLine();
        }
        bfw.close();
        bfr.close();
    }
}