package com.xxd.homework;

/**
 * projectName:SETest
 * author:xuxindong
 * time:2022/2/18 16:43
 * description:
 */
public class Student {
    //语文成绩chinese，数学成绩math，英语成绩english
    private double Chinese;
    private double math;
    private double English;

    public Student() {
    }

    public Student(double chinese, double math, double english) {
        Chinese = chinese;
        this.math = math;
        English = english;
    }

    public double getEnglish() {
        return English;
    }

    public void setEnglish(double english) {
        if(english>100.00||english<0.00){
            System.out.println("错误成绩");
            return;
        }
        English = english;
    }

    public double getChinese() {
        return Chinese;
    }

    public void setChinese(double chinese) {
        if(chinese>100.00||chinese<0.00){
            System.out.println("错误成绩");
            return;
        }
        Chinese = chinese;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        if(math>100.00||math<0.00){
            System.out.println("错误成绩");
            return;
        }
        this.math = math;
    }

    //求总成绩的方法getSum()
    public double getSum(){
        return Chinese+math+English;
    }
}