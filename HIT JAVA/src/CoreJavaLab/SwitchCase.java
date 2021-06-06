package CoreJavaLab;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("choose one operators from this :\n + ,- ,* ,/ ,% ");
		char c=sc.next().charAt(0);
		System.out.print("Enter the First Number : ");
		int n1=sc.nextInt();
		System.out.print("Enter the Second Number : ");
		int n2=sc.nextInt();
		switch(c) {
		case '+':
			System.out.println("The addition of two number is "+(n1+n2));
			break;
		case '-':
			System.out.println("The Subtraction of two number is "+(n1-n2));
			break;
		case '*':
			System.out.println("The multiplication of two number is "+(n1*n2));
			break;
		case '/':
			System.out.println("The Quotient of two number is "+(n1/n2));
			break;
		case '%':
		    System.out.println("The Remainder of two number is "+(n1%n2));
			break;	
		
		
		}
		
		
	}

}
