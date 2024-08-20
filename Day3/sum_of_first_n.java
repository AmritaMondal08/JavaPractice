package Day3;

import java.util.Scanner;

public class sum_of_first_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of first n natural number: ");
        int a=sc.nextInt();
        int sum=0;
        for(int i=1;i<=a;i++){
            sum += i;
        }
        System.out.println("Sum of the number is: "+sum);
        sc.close();
    }
}
