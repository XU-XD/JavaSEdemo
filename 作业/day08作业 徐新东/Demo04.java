package com.xxd.tsst;

/**
 * projectName:SETest
 * author:xuxindong
 * time:2022/2/21 17:01
 * description:
 */
//   （1）定义一个名为Vehicles（交通工具）的父类，该类中应包含String类型的成员属性brand（商标）
//           和color（颜色），属性私有化。还应包含成员方法run（行驶，在控制台显示“我已经开动了”）和show
//           （显示信息，在控制台对象属性显示商标和颜色），并编写构造方法用于给当前类的属性赋值。
//
//           （2）编写Car（小汽车）类继承于Vehicles类， 子类新增int型成员属性seats（座位），属性私有化。
//           还应重写父类的show方法（在控制台显示小汽车的属性），并编写构造方法给当前类的属性赋值。
public class Demo04 {
    public static void main(String[] args) {
Vehicles v=new Vehicles("福特 ","白色");
Car1 c=new Car1("法拉利","黑色",2);
Car1 b=new Car1("法","黑",33);
v.run();
v.show();

c.run();
c.show();
b.show();
    }
}
class Vehicles{
    private String brand;
    private String color;

    public Vehicles() {
    }

    public Vehicles(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public void run(){
        System.out.println("我已经开动了");
    }
    public void show(){
        System.out.println("商标"+getBrand()+"..。颜色"+getColor());
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
class Car1 extends Vehicles{
    private int seats;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Car1() {
    }

    public Car1(int seats) {
        this.seats = seats;
    }

    public Car1(String brand, String color, int seats) {
        super(brand, color);
        this.seats = seats;
    }

    public void show(){
        System.out.println("座位"+getSeats()+"...商标"+getBrand()+"...颜色"+getColor());
    }
}