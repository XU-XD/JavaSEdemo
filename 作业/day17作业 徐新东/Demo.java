package home;

import org.junit.Test;

import java.io.File;
import java.util.*;

/**
 * projectName:SETest
 * author:xuxindong
 * time:2022/3/4 17:01
 * description:
 */
public class Demo {
  //1、分析以下需求，并用代码实现：
  //        (1)统计每个单词出现的次数
//        (2)有如下字符串"If you want to change your fate I think you must come to the ujiuye to learn java"(用空格间隔)
//        (3)打印格式：
//        to=3
//        think=1
//        you=2
//
    @Test
    public void A(){
        String[] s = "If you want to change your fate I think you must come to the ujiuye to learn java".split(" ");
        LinkedHashMap<String, Integer> sl = new LinkedHashMap<>();
        for (String s1 : s) {
           sl.put(s1,sl.containsKey(s1)?sl.get(s1)+1:1);
        }
        for (Map.Entry<String, Integer> se : sl.entrySet()) {
            System.out.println(se.getKey()+"="+se.getValue());
        }
    }
    //        2、（1）获取10个1---20之间的随机数存储在List集合中，要求随机数不能重复
//        （2）让随机数的小值在集合的第一个位置，随机数的最大值在集合的最后一个位置；
//        让其余的八个随机数按照从大到小的顺序进行排列
    @Test
    public void B() {
        Random r=new Random();
        ArrayList<Integer> integers = new ArrayList<>();
        while (integers.size()<10){
            int i = r.nextInt(20)+1;
            if(!integers.contains(i)){
                integers.add(i);
            }else {
                i = r.nextInt(20)+1;
            }
        }
        Collections.sort(integers);
        Collections.reverse(integers);
        Collections.swap(integers,0,integers.size()-1);
        System.out.println(integers);
    }
//      3. 键盘录入一个字符串，表示一个文件夹路径，如果不是文件夹路径则提示重新录入
////       如果是文件夹路径则打印当前这一级路径下，所有的大于20M的后缀名是.wmv的文件的绝对路径（文件大小，和后缀名可以随意指定）
////      （不需要使用递归，只打印当前层下的文件即可）
    @Test
    public void C(){
        Scanner sc=new Scanner(System.in);
        System.out.println("输入路径");
        File file = new File(sc.nextLine());
       while (true){
           if(file.isDirectory()){
               for (File listFile : file.listFiles()) {
                   String s = listFile.toString();
                   if(s.endsWith(".avi")&&(listFile.length()<20971520)){
                       System.out.println(listFile.getAbsolutePath());
                   }
               }
                break;
           }else {
               System.out.println("输入错误，重新输入路径");
               file = new File(sc.nextLine());
           }
       }
    }
    //        4. 键盘录入一个文件夹路径，获取该文件夹下所有文件的字节数总和（使用递归）
    @Test
    public void D(){
        Scanner s=new Scanner(System.in);
        String s1 = s.nextLine();
        File file = new File(s1);
        if(file.isDirectory()){
            System.out.println(getfile(file));
        }else {
            System.out.println("输入路径有错误");
        }
    }
    public static long getfile(File file){
        long x=0;
        if(file.isDirectory()){
            for (File listFile : file.listFiles()) {
                x+=getfile(listFile);
            }
        }else {
            x+=file.length();
        }
        return x;
    }


}