package RevisionCoreJavaLab;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		do {
			System.out.println("pre Executed");
			System.out.println(n+" ");
			n++;
		}while(n<=10);
	}

}
