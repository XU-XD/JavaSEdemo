package demo;

/**
 * projectName:SETest
 * author:xuxindong
 * time:2022/2/25 16:53
 * description:
 */
/*
1、String、StringBuffer和StringBuilder的区别是什么？
（1）定义方式不同：
     String类型可以通过字符串常量来定义，也可以通过new创建一个对象
     StringBuilder和StringBuffer类型只能通过new来创建对象
（2）底层数组的定义不同：
      String类型底层是通过私有final的数组来定义。不可变（没有公共该值方式）
      StringBuilder和StringBuffer类型底层是默认数组来存储。可变（有修改的方法）
（3）拼接使用效率不同：
     Srting类型拼接效率低
     StringBuilder拼接效率高
（4）出现的版本不同：
        StringBuilder JDK1.5版本
        StringBuffer  JDK1.0版本
（5）线程安全性不同：
    StringBulider是线程不安全
    StringBuffer是线程安全
（6）效率问题：
    使用StringBulider效率高
    使用StringBuffer效率低
2、什么是装箱和拆箱？
     举例如何实现装箱和拆箱？
    1、装箱：将基本数据类型包装为引用数据类型的对象
    Integer integer=new Integer(100);
    2、拆箱：将引用数据类型的对象转为基本类型的数据
    int i = integer.intValue();
3、什么是自动装箱和自动拆箱？
      举例写出自动装箱和自动拆箱的代码。
    1、自动装箱：直接使用引用数据类型的变量，接收基本数据类型的元素
    Integer integer=100;
    2、自动拆箱：直接使用基本数据类型的变量，接收引用数据类型的对象直接使用引用数据类型的对象进行数据的运算
    int i=integer;
 */
public class Demo04 {
    public static void main(String[] args) {
//        定义一个字符串为：a123b23c33d44,将当前字符串通过替换的方法，转换为a-b-c-d-
        String s="a123b23c33d44";
        String s1 = s.replaceAll("[0-9]+", "-");
        System.out.println(s1);


    }
}