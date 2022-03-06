package com.xxd.homework;

/**
 * projectName:SETest
 * author:xuxindong
 * time:2022/2/18 16:44
 * description:
 */
public class Chang {
    //        属性：长方形的长和宽
    private double long1;
    private double width;

    public Chang(double long1, double width) {
        this.long1 = long1;
        this.width = width;
    }

    public Chang() {
    }

    public double getLong1() {
        return long1;
    }

    public void setLong1(double long1) {
        if(long1<0.00){
            System.out.println("长度不合法");
            return;
        }
        this.long1 = long1;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<0.00){
            System.out.println("长度不合法");
            return;
        }
        this.width = width;
    }
    //        行为：求取长方形的周长和面积
    public  double sumLong(){
        return (long1+width)*2;
    }
    public  double ssLong(){
        return long1*width;
    }

}