import org.junit.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * projectName:SETest
 * author:xuxindong
 * time:2022/2/17 16:34
 * description:
 */
public class DemoHuahuo {
//  练习1、
//  通过循环，键盘录入5名学生的数学成绩（int）
//  将录入的5个人的成绩存储到一个数组中，然后定义一个方法，求出5个学生的平均成绩
//          将平均成绩进行返回
@Test
public void A(){
  int[] arr=new int[5];
  Scanner scanner=new Scanner(System.in);
  for (int i = 0; i < arr.length; i++) {
      System.out.println("输入第"+(i+1)+"个成绩");
    arr[i]=scanner.nextInt();
  }
    System.out.println("成绩数组为："+Arrays.toString(arr));
  System.out.println("平均成绩为"+AA(arr));
}
  public static double AA(int[] a){
    int sum=0;
    for (int i: a) {sum+=i;}
    return sum/a.length;
  }
//  练习2：
//   （1）通过循环随机获取10个1-100之间的随机数，将随机数存储到数组arr中
//   （2）定义两个方法，都可以接收arr数组，方法功能分别为计算数组中有多少个偶数和多少个奇数
//   （3）调用这两个方法获取arr数组中的偶数和奇数的个数进行打印
//
  @Test
  public void B(){
    int[] arr=new int[10];
  Random random=new Random();
    for (int i = 0; i < arr.length; i++) {
      arr[i]=random.nextInt(100)+1;
    }
      System.out.println(Arrays.toString(arr));
    Jishu(arr);
    Oushu(arr);
  }
  public static void Oushu(int[] a){
  int count=0;
      for (int i:a) {
          if(i%2==0){
              count++;
          }
      }
      System.out.println("偶数有"+count+"个");
  }
  public static void Jishu(int[] a){
      int count=0;
      for (int i:a) {
          if(i%2!=0){
              count++;
          }
      }
      System.out.println("奇数有"+count+"个");
  }
//  练习3：
//  定义一个二维数组，二维数组的大小及每一个一位数组的大小使用键盘录入给定
//          使用循环给该二维数组中每个一维数组录入数据
//  数据录入完毕之后，求出该二维数组中所有数据的最大值。

    @Test
    public void C(){
    Random random=new Random();
    Scanner s=new Scanner(System.in);
        System.out.println("输入二维数组的大小：");
    int i=s.nextInt();
        System.out.println("输入一维数组的大小：");
    int j=s.nextInt();
    int[][] arr=new int[i][j];
        for (int k = 0; k < i; k++) {
            for (int l = 0; l <j; l++) {
                arr[k][l]=random.nextInt(100);
            }
        }
        int max=arr[0][0];
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                if(arr[k][l]>max){
                    max=arr[k][l];
                }
            }
        }
        System.out.println("数组为：");
        for (int k = 0; k < i; k++) {
            System.out.println(Arrays.toString(arr[k]));
        }
        System.out.println("最大值为"+max);
    }
}
