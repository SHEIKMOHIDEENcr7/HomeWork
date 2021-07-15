package RevisionCoreJavaLab;

import java.util.Scanner;

public class NestedSwitchCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Marks Even Tens like(20,40,60,80,100):");
		int n=sc.nextInt();
		switch(n) {
		case 20:{
			
		    switch(n) {
			case 20:{
			System.out.println("Mark is Twenty");
			System.out.println("Very Poor");
			break;
			}
		    }
		    break;
			
		}
		case 40:{
			switch(n) {
			case 40:{
			System.out.println("Mark is Fourty");
			System.out.println("Poor");
			break;
			}
			}
			break;
		}
		case 60:{
			switch(n) {
			case 60:{
			System.out.println("Mark is Sixty");
			System.out.println("Average");
			break;
			}
			}
			break;
		}
		case 80:{
			switch(n) {
			case 80:
			System.out.println("Mark is Eighty");
			System.out.println("Good");
			break;
			}
			break;
		}
		case 100:{
			switch(n) {
			case 100:{
			System.out.println("Mark is Hundred");
			System.out.println("Excellent");
			break;
			}
			}
			break;
		}
       default:{
			System.out.println("Your marks is not Listed");
		}
		}
		
		
	}

}
