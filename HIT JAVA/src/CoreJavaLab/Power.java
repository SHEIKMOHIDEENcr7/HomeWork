package CoreJavaLab;

public class Power {
	public static void main(String[] args) {
		int base=2,exponent=10,result=1;
		while(exponent!=0){
			result=result*base;
			exponent--;
		}
		System.out.println("power "+result);
		
	}

}
