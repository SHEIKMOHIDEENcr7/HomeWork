package CoreJavaLab;

public class AmstrongNumber {
	public static void main(String[] args) {
		int n=153;
		int n1=n;
		int rev,sum=0;
		
		while(n!=0) {
			rev=n%10;
			n=n/10;
			sum=sum+rev*rev*rev;
		}
		System.out.println(sum);
		if(n1==sum) {
			System.out.println("Amstrong Number");
		}else {
			System.out.println("Not An Amstrong Number");
		}
		
	}

}
