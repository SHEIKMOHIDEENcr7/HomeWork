package CoreJavaLab;

import java.util.Scanner;

public class AreaOfTheCircle {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Radius is : ");
		double radius=sc.nextFloat();
		//area-pi*r*r;
		double area=Math.PI*(radius*radius);
		System.out.println("Area of the circle is : "+area);
		//circumference-2*pi*r;
		double circumference=Math.PI*2*radius;
		System.out.println("Circumference of the circle is : "+circumference);
	}

}
																													