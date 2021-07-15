package RevisionCoreJavaLab;

import java.util.Scanner;

public class DisplayPrime {
	public static void main(String[] args) {
		int i=0;
		
		//String primeNumber="";
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int num=0;
		for(i=1;i<=n;i++) {
			int count=0;
			for(num=i;num>=1;num--) {
				if(i%num==0) {
					count++;
				}
			}
			if(count==2) {
//				primeNumber=primeNumber+i+" ";
				System.out.print("PrimeNumber: "+i+" ");
			}
		}
//		System.out.println("Prime Number: "+primeNumber);
	}

}
