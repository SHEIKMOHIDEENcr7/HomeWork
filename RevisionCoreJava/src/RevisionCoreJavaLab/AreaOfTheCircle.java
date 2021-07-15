package RevisionCoreJavaLab;

import java.util.Scanner;

public class AreaOfTheCircle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Radius: ");
		double radius =sc.nextDouble();
		double area=Math.PI*(radius*radius);
		System.out.println("Area Of The Circle is: "+area);
		double circumference=2*Math.PI*radius;
		System.out.println("Circumference of Circle is:"+circumference);
		
	}

}
