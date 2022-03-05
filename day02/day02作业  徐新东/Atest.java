package com.xxd;

import org.junit.Test;

/**
 * projectName:day03
 * author:xuxindong
 * time:2022/2/12 11:18
 * description:
 */
public class Atest {

  /*
二 (基本类型的运算)一家商场在举行打折促销，所有商品都进行8 折优惠。
       比如商品的原价为：int price = 100;
       计算打折后的价格：int realPrice = price * 0.8；
	问：上面那段代码是否正确？为什么？

    错误
	realPrice为double型
    */
        @Test
        public void A() {
            int p = 100;
            double realPrice = p * 0.8;
            System.out.println(realPrice);
        }
   /*
三定义如下两个变量，如：
     int a = 10;
     int b = 20;
     使用字符串拼接在控制台打印指定结果（打印语句中不能出现10和20）：
     打印结果：a = 20,b = 20；
    */
        @Test
        public void B() {
            int a = 10;
            int b = 20;
            System.out.println("a=" + (a+a) + ",b=" + b);
        }
/*
四定义如下两个变量，如：
     int x = 10;
     int y = 20;
     使用字符串拼接，在控制台打印指定结果（打印语句中不能出现10和20）：
     打印结果： x是10，y是20，x+y是30；
 */
        @Test
        public void C () {
            int x = 10;
            int y = 20;

            System.out.println("x是" + x + "，y是" + y + "，x+y是" + (x+y));

        }

}