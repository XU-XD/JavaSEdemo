package homework;

import org.junit.Test;

import java.util.Locale;
import java.util.Scanner;

/**
 * projectName:SETest
 * author:xuxindong
 * time:2022/2/24 16:59
 * description:
 */
public class Demo {
    /*
    1、分析以下需求，并用代码实现：
	(1)定义数字字符串数组{"010","3223","666","7890987","123123"}
	(2)判断该数字字符串数组中的数字字符串是否是对称(第一个数字和最后一个数字相等，第二个数字和倒数第二个数字是相等的，依次类推)的，并逐个输出
	(3)如：010 是对称的，3223 是对称的，123123 不是对称的
	(4)最终打印该数组中对称字符串的个数

	提示：循环获取字符串的每一个字符，依次比较第一个和最后一个，第二个和倒数第二个。。。

     */
    @Test
    public void A(){
        String[] arr={"010","3223","666","7890987","311223"};
        int count=0;
        for (String i:arr) {
            StringBuilder stringBuilder = new StringBuilder(i);
            StringBuilder reverse = stringBuilder.reverse();
            if(i.equals(reverse.toString())){
                System.out.println(i+"对称");
                count++;
            }else {
                System.out.println(i+"不对称");
            }
        }
        System.out.println("对称的数为"+count);
    }
/*
定义一个方法，功能如下：给定一个数组，将当前数组中的内容，通过拼接转换为一个字符串
	例如：数组为int[] arr = {1, 2, 3}； 获取的字符串结果为：[1, 2, 3]
 */
    @Test
    public void B(){
        int[] arr = {1,2,3,4,5,6,7};
        BB(arr);

    }
    public static void BB(int[] a){
        String s="[";
        for (int i = 0; i <a.length ; i++) {
            if(i<a.length-1) s+=a[i]+",";
            else s+=a[i]+"]";
        }
        System.out.println(s);
    }
    /*
    键盘录入一个字符串使用变量存储，将该字符串的首字母转为大写，其他字母转为小写，最终打印结果
     例如：录入数据为：i Love Java  转换之后为：I love java
     */
    @Test
    public void C(){
        Scanner s=new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s1.toLowerCase(Locale.ROOT);
        String substring = s2.substring(0, 1).toUpperCase(Locale.ROOT)+s2.substring(1);
        System.out.println(substring);

    }
}