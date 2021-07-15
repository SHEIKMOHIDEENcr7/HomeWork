package RevisionCoreJavaLab;

import java.util.Scanner;

public class LargestOFThreeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number 1: ");
		int num1=sc.nextInt();
		System.out.println("Enter the Number 2: ");
		int num2=sc.nextInt();
		System.out.println("Enter the Number 3: ");
		int num3=sc.nextInt();
		if(num1>num2 &&num1>num3) {
			System.out.println("Number one is Largest of three Number: "+num1);
		}else if(num2>num1&&num2>num3) {
			System.out.println("Number two is Largest of three Number: "+num2);
		}else {
			System.out.println("Number three is Largest of three Number: "+num3);
		}
	}

}
