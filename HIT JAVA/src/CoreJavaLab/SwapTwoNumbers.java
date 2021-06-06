package CoreJavaLab;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int num1=20,num2=30;
		System.out.println("BeforeSwap");
		System.out.println("First Number : "+num1);
		System.out.println("Second Number : "+num2);
		int temp;
		  temp=num1;
		  num1=num2;
		  num2=temp;
		System.out.println("AfterSwap");
		System.out.println("First Number : "+num1);
		System.out.println("Second Number : "+num2);
	}

}
