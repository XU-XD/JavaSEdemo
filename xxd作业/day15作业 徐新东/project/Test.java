package project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * projectName:SETest
 * author:xuxindong
 * time:2022/3/2 14:59
 * description:
 */
public class Test {
    private ArrayList<Student> list=new ArrayList();
    private Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        Test test=new Test();
        test.View();
    }
    private void View(){
        boolean x=true;
        while (x){
            System.out.println(" *****欢迎来到学生管理系统*****");
            System.out.println("请录入您要进行的操作：");
            System.out.println(" 1、添加学生信息");
            System.out.println(" 2、删除学生信息");
            System.out.println(" 3、修改学生信息");
            System.out.println(" 4、查看学生信息");
            System.out.println("5、退出当前系统");
            int i = s.nextInt();
            switch (i){
                case 1: Add();break;
                case 2:Delete();break;
                case 3:Seet();break;
                case 4: Look();break;
                case 5: x=false;break;
            }
        }
    }

    private void Look() {
        System.out.println("-----------查看-------------");
        System.out.println("学号\t\t姓名\t\t年龄\t\t地址");
        if(list.size()!=0){
            for (Student student : list) {
                System.out.println(student.getSid()+"\t\t"+student.getName()+"\t\t"+student.getAge()+"\t\t"+student.getAddress());
            }
            System.out.println();
            System.out.println("-----------已显示-------------");
        }else {
            System.out.println("空的");
        }
    }
    private void Delete() {
        System.out.println("-----------删除-------------");
        System.out.println("输入学号");
        while (true){
            String next = s.next();
            for (Student student : list) {
                if(next.equals(student.getSid())){
                    list.remove(student);
                    System.out.println("-----------删除成功-------------");
                    return;
                }
            }
            System.out.println("查无此人，重新输入");
        }
    }
    private void Add() {
        System.out.println("-----------添加-------------");
        Student s1=new Student();
        System.out.println("学号");
        while (true){
            int c=0;
            String next = s.next();
            for (Student student : list) {
                if(next.equals(student.getSid())){
                    System.out.println("重复，重新输入");
                    c++;
                }
            }
            if(c==0){
                s1.setSid(next);
                break;
            }
        }
        System.out.println("姓名");
        s1.setName(s.next());
        System.out.println("年龄");
        s1.setAge(s.next());
        System.out.println("地址");
        s1.setAddress(s.next());
        list.add(s1);
        System.out.println("-----------添加成功-------------");
        System.out.println();
    }
    private void Seet() {
        System.out.println("-----------修改-------------");
        System.out.println("修改的学号");
        while (true){
            String next = s.next();
            for (Student student : list) {
                if(next.equals(student.getSid())){
                    System.out.println("姓名");
                    student.setName(s.next());
                    System.out.println("年龄");
                    student.setAge(s.next());
                    System.out.println("地址");
                    student.setAddress(s.next());
                    System.out.println("修改成功");
                    return;
                }
            }
            System.out.println("不存在，重新输入");
        }
    }
}