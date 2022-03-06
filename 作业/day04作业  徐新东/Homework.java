import org.junit.Test;

import java.util.Scanner;

/**
 * projectName:SETest
 * author:xuxindong
 * time:2022/2/15 16:49
 * description:
 */
public class Homework {
    @Test
    public void A() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i >= 0 || i <= 127) {
            if (i >= 48 && i <= 57) {
                System.out.println("输入的是"+i+",他是一个数字字符");
            } else if (i >= 65 && i <= 90) {
                System.out.println("输入的是"+i+",他是一个大写英文字符");
            } else if (i >= 97 && i <= 122) {
                System.out.println("输入的是"+i+",他是一个小写英文字符");
            }else {
                System.out.println("输入的是"+i+",他是一个特殊符号字符");
            }
        } else {
            System.out.println("错误");
        }
    }

    @Test
    public void B(){
    double i;
    int count=0;
//    while (i<=8848.000){
//        i=i*2;
//        count++;
//    }
        for ( i = 0.001; i <= 8848.000; i=i*2) {
            count++;
        }
        System.out.println("需要折叠"+count+"次");
    }
}