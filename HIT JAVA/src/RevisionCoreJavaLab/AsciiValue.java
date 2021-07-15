package RevisionCoreJavaLab;

import java.util.Scanner;

public class AsciiValue {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character Which want you to find Ascii Value: ");
		char ch=sc.next().charAt(0);
		int i=ch;
		//we can find Ascii value by USing Type Casting Also->
		int i1=(int)ch;
		System.out.println(i1);
		
	}
	

}
