package CoreJavaLab;
public class FindLcm {
	public  static void main(String[] args) {
		
		int n1=72,n2=120,lcm;
		
		lcm=(n1>n2)?n1:n2;
		System.out.println(lcm);
		while(true) {
			if((lcm%n1==0)&&(lcm%n2==0)) {
				System.out.printf("The Lcm is %d and %d is %d :",n1,n2,lcm);
				break;
			}
			lcm++;
		}
	}
}
