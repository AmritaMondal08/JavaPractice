package Day3;

import java.util.Scanner;

public class greatestnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three number:\n");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int temp,result;
        temp=num1>num2 ? num1:num2;
        result=temp>num3 ? temp:num3;
        System.out.println(result+" is the greatest number");
        sc.close();
    }
}
