package CoreJavaLab;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n=sc.nextInt();
		boolean leap=false;
		if(n%4==0) {
			if(n%100==0) {
				if(n%400==0) {
					leap=true;
				}else {
					leap=false;
				}
				
			}else {
				leap=true;
			}
		}else {
			leap=false;
		}
		if(leap==true) {
			System.out.println("Its is a Leap year");
		}else {
			System.out.println("Its is not a Leap year");
		}
	}

}
