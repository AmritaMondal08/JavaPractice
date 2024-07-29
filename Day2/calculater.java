package Day2;
import java.util.Scanner;
public class calculater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter one number: ");
        float a=sc.nextFloat();
        System.out.println("Enter second number: ");
        float b=sc.nextFloat();
        float result=a+b;
        System.out.println(a+"+"+b+"="+result);
        float result1=a-b;
        System.out.println(a+"-"+b+"="+result1);
        float result2=a*b;
        System.out.println(a+"*"+b+"="+result2);
        float result3=0;
        if(b!=0){
            result3=a/b;
        }
        System.out.println(a+"/"+b+"="+result3);
        float result4=a%b;
        System.out.println(a+"mod"+b+"="+result4);
        sc.close();
    }
}
