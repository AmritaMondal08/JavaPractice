package Day4;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //For positive power
        System.out.println("Enter the base:");
        int b=sc.nextInt();
        System.out.println("Enter the power:");
        int p=sc.nextInt();
        int result=1;
        for(int i=0;i<p;i++){
            result *= b;
        }
        System.out.println("Result is: "+result);
        sc.close();
    }
}
