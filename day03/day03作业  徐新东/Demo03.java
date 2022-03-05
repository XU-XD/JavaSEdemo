package com.xxd.demo;

import org.junit.Test;

import java.util.Scanner;

/**
 * projectName:SETest
 * author:xuxindong
 * time:2022/2/14 17:09
 * description:
 */
public class Demo03 {
    /*
    1、随意定义一个变量i = 3287;获取该数字中每位上的数字
		最终输出：个位是7， 十位是8，百位是2， 千位是3
*/
    @Test
    public void A(){
        int i = 3287;
        int gewei=i%10;
        int shiwei=(i/10)%10;
        int baiwei=(i/100)%10;
        int qianwei=i/1000;
        System.out.println("个位是"+gewei);
        System.out.println("十位是"+shiwei);
        System.out.println("百位是"+baiwei);
        System.out.println("千位是"+qianwei);
    }
    /*
2、给定i和j，int i = 10, j = 20; int z = (i++) *2+ (++j) *2+ (++i)%2 + (j++)/2;
		不要写代码，计算i、j、z的值
*/
    @Test
    public void B(){
        int i = 10, j = 20;
        int z = (i++) *2+ (++j) *2+ (++i)%2 + (j++)/2;
        //       10*2      21*2     12%2       21/2
        System.out.println("i="+i+"，j="+j+"，z="+z);
    }
    /*
3、定义一个int变量，使用三元运算符，输出这个变量是否可以被7整除
		例如，定义变量int a = 10;
		最终输出：变量值为10，该变量不能被7整除
*/
    @Test
    public void C(){
        Scanner scanner =new Scanner(System.in);
        int a = scanner.nextInt();
        String s = a % 7 == 0 ? "能" : "不能";
        System.out.println("变量值为"+a+"，该变量"+s+"被7整除");
    }
    /*
4、执行下列程序段后，m,x,y的值分别是？       选B
	int x = 2,y = 4;
	boolean m;
	m = ++x > y--;

	(B. false,3,3)

     */
}