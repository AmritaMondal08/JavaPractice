import java.util.Scanner;

public class palindrome {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		int rev=0;
		int temp=number;
		while(number>0) {
			rev=rev*10+(number%10);
			number=number/10;
		}
		if(temp==rev) {
			System.out.println("It is a palindrome number");
		}
		else {
			System.out.println("It is not a palindrome number");
		}
		sc.close();
		}
}