package RevisionCoreJavaLab;

import java.util.Scanner;

public class WhileLoopDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		while(num<=10) {
//			System.out.println(num+" ");
			sum=sum+num;
			System.out.println("Sum of "+num);
			num++;
			
		}
		System.out.println("After the Sum: "+sum);
	}

}
