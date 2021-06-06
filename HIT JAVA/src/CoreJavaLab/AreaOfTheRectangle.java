package CoreJavaLab;

import java.util.Scanner;

public class AreaOfTheRectangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length : ");
		double length=sc.nextDouble();
		System.out.println("Enter the Breadth : ");
		double breadth=sc.nextDouble();
		double area=length*breadth;
		System.out.println("Area of the rectangle : "+area);
	}

}
