package RevisionCoreJavaLab;

import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Before Swap using temp..........");
		System.out.println("First Number: ");
		int n1=sc.nextInt();
		System.out.println("Second Number: ");
		int n2=sc.nextInt();
		int temp;
		temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("After Swap using temp.............");
		System.out.println("First Number: "+n1);
		System.out.println("Second Number: "+n2);
		System.out.println("\nAfter Swap Without using temp..........");
		n1=n1-n2;
		n2=n1+n2;
		n1=n2-n1;
		System.out.println("Number 1: "+n1);
		System.out.println("number 2: "+n2);
		
	}

}
