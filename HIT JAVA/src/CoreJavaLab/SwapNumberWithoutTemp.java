package CoreJavaLab;

public class SwapNumberWithoutTemp {
	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("BeforeSwap");
		System.out.println("First Number : "+a);
		System.out.println("Second Number : "+b);
		a=a-b;//-10
		b=a+b;//10
		a=b-a;//20
		System.out.println("AfterSwap");
		System.out.println("First Number : "+a);
		System.out.println("Before Number : "+b);
			
	}

}
