package home;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * projectName:SETest
 * author:xuxindong
 * time:2022/3/7 16:40
 * description:
 */
//1、随意获取一个文件的路径，将该文件中的每行信息，反转拷贝到另外一个文件中
//        注意：反转：按行来反转
//        第一行成为最后一行，最后一行成为第一行
//        第二行成为倒数第二行，倒数第二行成为第二行
//        ......

public class Demo01 {
    public static void main(String[] args)throws IOException {
        BufferedReader bfr=new BufferedReader(new FileReader("day18/a.txt"));
        BufferedWriter bfw= new BufferedWriter(new FileWriter("day18/b.txt"));
        ArrayList<String> strings = new ArrayList<>();
        String x;
        while ((x=bfr.readLine())!=null){
            strings.add(x);
        }
        Collections.reverse(strings);
        for (String string : strings) {
            bfw.write(string);
            bfw.newLine();
        }

        bfw.close();
        bfr.close();

    }
}