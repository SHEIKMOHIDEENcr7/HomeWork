package RevisionCoreJavaLab;

import java.util.Scanner;
//By taking input from User;
public class SumOfArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i:arr) {
			sum=sum+i;	
		}
		System.out.println(sum);
		
	}

}
