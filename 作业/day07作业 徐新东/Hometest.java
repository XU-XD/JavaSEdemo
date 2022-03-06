package com.xxd.homework;

import java.util.Scanner;

/**
 * projectName:SETest
 * author:xuxindong
 * time:2022/2/18 16:43
 * description:
 */
//        需求一：
//        学生类Student
//        属性:语文成绩chinese，数学成绩math，英语成绩english
//        行为:求总成绩的方法getSum()
//        (调用该方法可以返回总成绩的和)
//
//        需求二：
//        长方形类
//        属性：长方形的长和宽
//        行为：求取长方形的周长和面积
//        （调用方法可以返回周长和面积）
public class Hometest {
    public static void main(String[] args) {
        Student student = new Student();
        Chang chang = new Chang();

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入语文成绩");
        student.setChinese(scanner.nextDouble());
        System.out.println("输入英语成绩");
        student.setEnglish(scanner.nextDouble());
        System.out.println("输入数学成绩");
        student.setMath(scanner.nextDouble());
        System.out.println("成绩总共和为："+student.getSum());


        System.out.println("输入长");
        chang.setLong1(scanner.nextDouble());
        System.out.println("输入宽");
        chang.setWidth(scanner.nextDouble());
        System.out.println("面积："+chang.ssLong()+"\t  周长："+chang.sumLong());

    }

}