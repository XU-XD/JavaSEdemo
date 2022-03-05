package test;

import java.util.ArrayList;
import java.util.Scanner;

public class StuManagement {
    private static final Scanner sc = new Scanner(System.in);
    private static final ArrayList<Stu> list = new ArrayList<>();
    public static void main(String[] args) {

        System.out.println("****欢迎进入xxx管理系统****");
        while(true){
            System.out.println("请跟您的需求，录入对应的序号：");
            System.out.println("1、添加学生信息：");
            System.out.println("2、删除学生信息：");
            System.out.println("3、修改学生信息：");
            System.out.println("4、查看学生信息：");
            System.out.println("5、退出系统学生信息：");
            String num = sc.nextLine();
            switch (num){
                case "1":
                    addStu();
                    break;
                case "2":
                    delStu();
                    break;
                case "3":
                    alterStu();
                    break;
                case "4":
                    checkStu();
                    break;
                case "5":
                    System.out.println("欢迎您的下次使用，退出成功！");
                    System.exit(0);
            }
        }
    }
    private static void alterStu() {
        System.out.println("请录入您要修改的学生学号：");
        while(true){
            String sid = sc.nextLine();
            for(Stu s:list){
                String id = s.getId();
                if(sid.equals(id)){
                    System.out.println("您的原信息为：");
                    System.out.println(s.getId() + "      "+s.getName()+"      "+s.getAge()+"      "+s.getAddress());
                    System.out.println("请录入您要修改的姓名：");
                    String sname = sc.nextLine();
                    System.out.println("请录入您要修改的年龄：");
                    String sage = sc.nextLine();
                    System.out.println("请录入您要修改的地址：");
                    String saddress = sc.nextLine();
                    s.setName(sname);
                    s.setAge(sage);
                    s.setAddress(saddress);
                    System.out.println("该学生的信息已经修改成功！");
                    return;
                }
            }
            System.out.println("该学校没有这个人，请重新录入！");
        }
    }
    private static void delStu() {
        System.out.println("请录入您要删除的学生学号：");
        while(true){
            String sid = sc.nextLine();
            for(Stu s:list){
                String id = s.getId();
                if(sid.equals(id)){
                    list.remove(s);
                    System.out.println("该学生已经开除！！！");
                    return;
                }
            }
            System.out.println("该学校没有这个人，请重新录入！");
        }
    }
    private static void checkStu() {
        if(!list.isEmpty()){
            System.out.println("学生信息如下：");
            System.out.println("学号      姓名      年龄      地址");
            for(Stu s:list){
                System.out.println(s.getId() + "      "+s.getName()+"      "+s.getAge()+"      "+s.getAddress());
            }
        }else{
            System.out.println("该学校没人，请赶紧招生吧！！！");
        }
    }
    private static void addStu() {
        System.out.println("欢迎进入添加功能：");
        System.out.println("请录入学生的学号：");
        String sid = null;
        while(true){
            int count = 0;
            sid = sc.nextLine();
            //录入学号之后，应该先判断学校中有没有该学号的存在，如果该学号已经有，重新录，如果没有可以存入
            //将sid和集合中已有的序号比较，如果有一样的重新录，如果没有一样的，就可以存入
            for(Stu s:list){
                String id = s.getId();
                if(sid.equals(id)){
                    System.out.println("该学号已存在，请重新录入");
                    count++;
                }
            }
            if(count == 0){
                break;
            }
        }
        System.out.println("请录入学生的姓名：");
        String sname = sc.nextLine();
        System.out.println("请录入学生的年龄：");
        String sage = sc.nextLine();
        System.out.println("请录入学生地址：");
        String saddress = sc.nextLine();
        Stu s = new Stu(sid,sname,sage,saddress);

        list.add(s);
        System.out.println("学生信息添加成功！！！");
    }
}
