package CoreJavaLab;

import java.util.Scanner;

public class AreaOfSquare {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side : ");
		double side=sc.nextDouble();
		double area=side*side;
		System.out.println("Area of the square is : "+area);
	}

}
