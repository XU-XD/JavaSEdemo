package project;

import java.util.Objects;

/**
 * projectName:SETest
 * author:xuxindong
 * time:2022/3/2 14:57
 * description:
 */
//1、定义学生类，包含以下成员变量
//        学生类：
//        Student成员变量：属性私有化，提供公共的访问方式
//        学号：sid String
//        姓名：name String
//        年龄：age String
//        地址：address String
//        构造方法：
//        空参构造
//        有参构造
public class Student {
    private String sid;
    private String name;
    private String age;
    private String address;

    public Student(String sid, String name, String age, String address) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Student() {
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(sid, student.sid) && Objects.equals(name, student.name) && Objects.equals(age, student.age) && Objects.equals(address, student.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, name, age, address);
    }
}