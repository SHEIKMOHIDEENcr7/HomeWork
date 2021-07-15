package RevisionCoreJavaLab;

import java.util.Scanner;

public class MultiplyTwoNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number 1: ");
		int n1=sc.nextInt();
		System.out.print("Enter the Number 2: ");
		int n2=sc.nextInt();
		int multi=n1*n2;
		System.out.println("The multiply of two Number is: "+multi);
	}

}
