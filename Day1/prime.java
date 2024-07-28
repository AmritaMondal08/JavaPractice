package Day1;
import java.util.Scanner;

public class prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int flag=0;
        int m=n/2;
        if(n<=1){
            System.out.println("It is a prime number");
        }
        for(int i=2;i<=m;i++) {
            if (n % i == 0) {
                flag=1;
            }
            else {
                flag=0;
            }
        }
        if(flag==0){
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+" is not a prime number");
        }
        sc.close();
    }
}
