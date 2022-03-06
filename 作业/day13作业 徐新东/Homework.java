package home;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * projectName:SETest
 * author:xuxindong
 * time:2022/2/28 16:55
 * description:
 */


public class Homework {
//    2、秒杀活动：
//    某品牌商品推出一元秒杀活动：
//    秒杀时间为：2021年11月11日 00：00：00
//    秒杀结束时间为：2021年11月11日 00：10：00
//    两位顾客参与秒杀时间分别为：
//    小红：2021年11月11日 00：03：47
//    小明：2021年11月11日 00：10：11
//    请使用代码验证这两位顾客是否参加上了秒杀活动。
//
    @Test
    public void A(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入小红秒杀时间");
        String s = scanner.nextLine();
        System.out.println("输入小明秒杀时间");
        String s11 = scanner.nextLine();
        String str1="2021年11月11日 00：00：00";
        String str2="2021年11月11日 00：10：00";
        SimpleDateFormat s1=new SimpleDateFormat("yyyy年MM月dd日 HH：mm：ss");
        try {
            long time = s1.parse(str1).getTime();
            long time1 = s1.parse(str2).getTime();
            long time2 = s1.parse(s).getTime();
            long time3 = s1.parse(s11).getTime();
            if(time2>=time&&time2<=time1) System.out.println("小红参加了");else System.out.println("小红不行");
            if(time3>=time&&time3<=time1) System.out.println("小明参加了");else System.out.println("小明不行");
        } catch (ParseException e) {
            System.out.println("输入的格式不正确");
        }
    }
//    3、定义一个方法，方法可以接收一个字符串（表示姓名），和若干门学生成绩（int）。
//    方法功能为打印传入的姓名，和若干成绩的总和（总成绩）
//    比如：传入的数据为：张三，10，20，30，40
//    打印结果为：张三的总成绩为100分
    @Test
    public void B(){
        BB("111",10,20,20);
        BB("222",20,20);
    }
    public static void BB(String name,int...arg){
        int sum=0;
        for (int i:arg) {
            sum+=i;
        }
        System.out.println(name+"的总成绩为"+sum);
    }
}