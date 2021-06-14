package CoreJavaLab2;

import java.util.Scanner;

public class AvgOfNumbers {
	public static void main(String[] args) {
		int x[]=new int[10];
		int count=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<x.length;i++) {
			System.out.println("Enter the value of array: "+"Index "+count);
			x[i]=sc.nextInt();
			count++;
		}
		System.out.println("Array of X is");
	    for(int i=0;i<x.length;i++) {
	    	System.out.println(x[i]);
	    }
	    int sum=0;
	    for(int i=0;i<x.length;i++) {
	    	sum=sum+x[i];
	    }
	    System.out.println("Sum of an Array is "+sum);
	    double avg=sum/x.length;
	    System.out.println("The Average of an Array is "+avg);
	}

}
