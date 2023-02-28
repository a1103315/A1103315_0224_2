import java.util.*;

public class A1103315_0224_2{
    public static void main(String[] argv){
        Scanner input=new Scanner(System.in);

        System.out.print("請輸入攝氏溫度:");
        double celsius = input.nextDouble();

        double fahrenheit=(9.0/5)*celsius+32;

        System.out.println(celsius+"度攝氏溫度="+fahrenheit+"度華氏溫度");
    }
}