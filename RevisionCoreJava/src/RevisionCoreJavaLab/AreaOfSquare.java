package RevisionCoreJavaLab;

import java.util.Scanner;

public class AreaOfSquare {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Side of the Square: ");
		double side=sc.nextDouble();
		double area=side*side;
		System.out.println("Area of the Square is "+area);
		
	}

}
