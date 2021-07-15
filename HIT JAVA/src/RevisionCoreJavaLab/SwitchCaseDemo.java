package RevisionCoreJavaLab;

import java.util.Scanner;

public class SwitchCaseDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Marks Even Tens like(20,40,60,80,100):");
		int n=sc.nextInt();
		switch(n) {
		case 20:{
			System.out.println("Mark is Twenty");
			break;
		}
		case 40:{
			System.out.println("Mark is Fourty");
			break;
		}
		case 60:{
			System.out.println("Mark is Sixty");
			break;
		}
		case 80:{
			System.out.println("Mark is Eighty");
			break;
		}
		case 100:{
			System.out.println("Mark is Hundred");
			break;
		}
		default:{
			System.out.println("Your mark is Not listed");
		}
		}
		
	}

}
