package RevisionCoreJavaLab;

import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character: ");
		char ch=sc.next().charAt(0);
		
		if((ch=='a'||ch=='A')||(ch=='e'||ch=='E')||(ch=='i'||ch=='I')||(ch=='o'||ch=='O')||(ch=='u'||ch=='U')){
			System.out.println("Its is Vowels");
		}
		else {
			System.out.println("It's not a Vowels");
		}
	}

}
