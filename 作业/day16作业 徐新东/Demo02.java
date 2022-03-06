package demo;

import org.junit.Test;

import java.util.*;

/**
 * projectName:SETest
 * author:xuxindong
 * time:2022/3/3 16:20
 * description:
 */
public class Demo02 {
//        1、键盘录入一个字符串，使用合适的集合存储该字符串的字符，存储之后，将字符遍历打印
//        要求：相同字符只打印一次，要求字符打印的顺序和录入的顺序一致
//
    @Test
    public void A(){
        Scanner sc=new Scanner(System.in);
        System.out.println("输入字符串");
        String s = sc.nextLine();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        System.out.println("遍历结果");
        for (Character character : set) {
            System.out.print(character+" ");
        }

    }
//        2、随机生成10个20-40之间的随机数，选择使用合适的集合进行存储
//        需要遍历集合得到每一个随机数。要求随机数不能重复
//
    @Test
    public void B(){
        Random random = new Random();
        HashSet<Integer> integers = new HashSet<>();
        while (integers.size()<10){
            integers.add(random.nextInt(11)+20);
        }
        System.out.println("遍历结果");
        for (Integer integer : integers) {
            System.out.print(integer+"  ");
        }
    }
//        3.分析以下需求，并用代码实现：
//        (1)定义一个学生类Student，包含属性：姓名(String name)、年龄(int age)
//        (2)定义Map集合，用Student对象作为集合的key
//        用String字符串(该字符串可以用来表示学生的住址)作为value
//       （3向集合Map中存储若干键值对
//        (4)利用两种遍历思路遍历Map集合中的内容
//        要求可以分别获取到对象中的name,age 及值value  进行打印
    @Test
public void C(){
        Map<student1,String> studentHashMap = new HashMap();
        studentHashMap.put(new student1("张",11),"翻斗花园");
        studentHashMap.put(new student1("赵",12),"翻斗帝国");
        studentHashMap.put(new student1("钱",13),"翻斗酒店");
        studentHashMap.put(new student1("孙",14),"翻斗农场");
        studentHashMap.put(new student1("李",15),"翻斗医院");
        //one
        //要求可以分别获取到对象中的name,age 及值value  进行打印
        for (student1 student : studentHashMap.keySet()) {
            String name = student.getName();
            int age = student.getAge();
            String s = studentHashMap.get(student);
            System.out.println(name+"..."+age+"..."+s);
        }
        System.out.println(".......................................................");
        //two
        Set<Map.Entry<student1, String>> entries = studentHashMap.entrySet();
        for (Map.Entry<student1, String> entry : entries) {
            String name = entry.getKey().getName();
            int age = entry.getKey().getAge();
            String value = entry.getValue();
            System.out.println(name+"..."+age+"..."+value);
        }
    }
    class student1{
        private String name;
        private int age;

        public student1() {
        }

        public student1(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

    }
}
