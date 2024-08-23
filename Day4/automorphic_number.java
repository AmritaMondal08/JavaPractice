package Day4;

import java.util.Scanner;
public class automorphic_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int square=num*num;
        System.out.println("Square of the number is: "+square);
        if(square%10==num%10){
            System.out.println(num+" is a automorphic number.");
        }
        else{
            System.out.println(num+" is not a automorphic number.");
        }
        sc.close();
    }
}
