package RevisionCoreJavaLab;

public class FloydTraingle {
	public static void main(String[] args) {
		int num=1;
		System.out.println("Floyd Triangle.............");
	   for(int i=1;i<=5;i++) {
		   for(int j=1;j<=i;j++) {
			   System.out.print(num+" ");
			   num++;
		   }
		   System.out.println();
	   }
	 }

}
