package Day5;

import java.util.Scanner;

public class swapping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Using third variable
        System.out.println("Enter first number:");
        int num1=sc.nextInt();
        System.out.println("Enter second number:");
        int num2= sc.nextInt();
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After swapping the numbers are: "+num1+" & "+num2);
    }
}
