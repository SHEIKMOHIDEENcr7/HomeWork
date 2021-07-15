package RevisionCoreJavaLab;

import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("The Length of the Rectangle is: ");
		double length=sc.nextDouble();
		System.out.println("The Breadth of the Rectangle is: ");
		double breadth=sc.nextDouble();
		double area=length*breadth;
		System.out.println("Area of the Rectangle is: "+area);
	}

}
