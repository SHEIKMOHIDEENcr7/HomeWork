package CoreJavaLab2;

import java.util.Scanner;

//File Salary.java contains most of a program that takes as input an 
//employee's salary and a rating of the employee's performance and 
//computes the raise for the employee.As inthe pre-lab, an employee who is 
//rated excellent will receive a 6% raise, one rated good will receive a 4% 
//raise, and one rated
//poor will receive a 1.5% raise.Add the if... else... statements to program 
//Salary to make it run as described above.
public class Salary {
	public static void main(String[] args) {
//		double Empsalary=10000;
		double raise=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Employee Current Salary :");
		double Empsalary=sc.nextDouble();
		double newsalary;
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("[ EXCELLENT"+" OR "+"GOOD"+" OR "+"POOR ]");
		String rating=sc1.nextLine().toUpperCase();
		if(rating.contains("EXCELLENT")) {
			raise=raise+6.0/100;
			newsalary=Empsalary+raise;
			System.out.println("Employee Who has been rated to Excellent earns : "+newsalary);
		}else if(rating.contains("GOOD")) {
			raise=raise+4.0/100;
			newsalary=Empsalary+raise;
			System.out.println("Employee Who has been rated to Good earns : "+newsalary);

		}else if(rating.contains("POOR")) {
			raise=raise+1.5/100;
			newsalary=Empsalary+raise;
			System.out.println("Employee Who has been rated to poor earns : "+newsalary);

		}
		
		
	}

}
