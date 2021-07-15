package RevisionCoreJavaLab;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number which you want to find odd or Even: ");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd Number");
		}
	}

}
