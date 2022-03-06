package home;

import org.junit.Test;

import java.util.*;

/**
 * projectName:SETest
 * author:xuxindong
 * time:2022/3/1 16:57
 * description:
 */
public class Demo {
//	(2)按照代码提示自定义find方法，统计集合中指定元素出现的次数
//    如"a" 3,"b" 2,"c" 1
//
    @Test
    public void A() {
        List list = new ArrayList();
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("d");
        list.add("d");
        list.add("d");
        list.add("d");
        System.out.println(find(list, "a"));    // 3
        System.out.println(find(list, "b"));// 2
        System.out.println(find(list, "c"));    // 1
        System.out.println(find(list, "d"));// 5
        System.out.println(find(list, "xxx"));// 0
    }

    public static int find(List list, String x) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == x) {
                count++;
            }
        }
        return count;

    }

    //
//  2.分析以下需求，并用代码实现：
//  (1)定义List集合，存入多个字符串
//  (2)删除集合中包含0-9数字的字符串(只要字符串中包含0-9中的任意一个数字就需要删除此整个字符串)
//	(3)然后利用迭代器遍历集合元素并输出
   @Test
   public void B(){
	   List list = new ArrayList();
       Scanner scanner=new Scanner(System.in);
       for (int i=0;i<10;i++){
           list.add(scanner.nextLine());
       }
       for (int i = 0; i < list.size(); ) {
           String s=(String) list.get(i);
           char[] chars = s.toCharArray();
           for (char aChar : chars) {
               if(aChar>='0'&&aChar<='9'){
                   list.remove(i);
                   i--;
                   break;
               }
           }
           i++;
       }
       Iterator iterator = list.iterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }
   }


    //3、定义一个List集合，在集合中存储10个随机数，要求存储的随机数不能相同
//   存储之后遍历集合进行查看

    @Test
    public void C(){
        List list=new ArrayList();
        Random random=new Random();
        int i=0;
        while (i<10) {
            int i1 = random.nextInt(10);
            if (!(list.contains(i1))) {
                list.add(i1);
                i++;
            }else {
                i1=random.nextInt(10);
            }
        }
        System.out.println(list);

    }

}