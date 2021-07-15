package RevisionCoreJavaLab;

import java.util.Scanner;

public class QuoAndRem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the FirstNumber: ");
		int num1=sc.nextInt();
		System.out.println("Enter the SecondNumber: ");
		int num2=sc.nextInt();
		int Quotient=num1/num2;
		System.out.println("Quotient of two Number is: "+Quotient);
		int Remainder=num1%num2;
		System.out.println("Remainder of two Number is: "+Remainder);
	}

}
