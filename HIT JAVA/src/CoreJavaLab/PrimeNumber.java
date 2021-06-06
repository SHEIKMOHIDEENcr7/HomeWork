package CoreJavaLab;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int count=0;
		if(n>1) {
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
				System.out.println(i+" ");
				
			}
		}
		if(count==2) {
			System.out.println("Its is a Prime number");
		}
		else {
			System.out.println("Its is not a prime number");
		}
		}else {
			System.out.println("Its is not a prime number");
		}
		
	}

}
