package Day5;

import java.util.Scanner;

public class friendly_pair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number: ");
        int num1= sc.nextInt();
        int num2=sc.nextInt();
        int sum1=GetDivisorsSum(num1);
        int sum2=GetDivisorsSum(num2);
        if(sum1/num1==sum2/num2){
            System.out.println(num1+" & "+num2+" are friendly pairs.");
        }
        else{
            System.out.println(num1+" & "+num2+" are not friendly pairs.");
        }
    }
    static int GetDivisorsSum(int num){
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        return sum;
    }
}
