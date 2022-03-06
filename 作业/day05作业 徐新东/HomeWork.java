import org.junit.Test;

/**
 * projectName:SETest
 * author:xuxindong
 * time:2022/2/16 17:19
 * description:
 */
public class HomeWork {
    //2、在控制台打印99乘法表，格式如下
    @Test
    public void A(){
for (int i =1;i<=9;i++){
    for (int j =1;j<=i;j++){
        System.out.print(i+"*"+j+"="+(i*j)+"  ");
    }
    System.out.println();
}
    }
    //3、定义一个方法，该方法的功能是：判断一个数字是不是质数（只能被1或者本身整除的数才是质数）
    //      在main中调用该方法，打印1-100之间的质数，并打印有多少个质数
    @Test
    public void B(){
        int count=0;
        System.out.println("100以内的质数：");
        for (int i =1;i<=100;i++){
            if(Zhishu(i)){
                System.out.print(i+"  ");
                count++;
                if(count%5==0){
                    System.out.println();
                }
            }
        }
        System.out.println("一共有："+count+"个");
    }

    public static boolean Zhishu(int a){
        boolean x=false;
        if(a==2){
            x=true;
        }else if(a==1||a<=0){
            x=false;
        }else {
        for(int i=2;i<a;i++){
            if(a%i!=0){
                x=true;
            }else {
                x=false;
                break;
            }
        }
        }
        return x;
    }
}