package Day4;

import java.util.Scanner;

public class armstrong_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //For 3 digit number
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(temp!=0){
            int rem=temp%10;
            sum += (rem*rem*rem);
            temp /=10;
        }
        if(n==sum){
            System.out.println(n+" is a armstrong number");
        }
        else{
            System.out.println(n+" is not a armstrong number");
        }
        sc.close();
    }
}
