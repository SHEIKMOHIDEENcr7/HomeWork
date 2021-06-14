package CoreJavaLab2;

/*Write a program in JAVA to demonstrate the method and constructor 
overloading.*/

class Cs{
	int p,q;
	Cs(){
		System.out.println("No Parameterized Constructor");
		
	}
	Cs(int a,int b){
		this.p=a;
		this.q=b;
	}
	public int add(int i,int j) {
		return i+j;
	}
	public int add(int i,int j,int k) {
		return i+j+k;
	}
	public float add(float m,float n) {
		return m+n;
	}
	public void printData() {
		System.out.println("p= "+p);
		System.out.println("q= "+q);
	}
}

public class ConstructorOverloading {
	public static void main(String[] args) {
		int x=2,y=3,z=4;
		Cs c=new Cs();
		Cs c1=new Cs(x,y);
		c1.printData();
		float m=10.2f,n=2.3f;
		int s=c.add(y, z);
		
		int t=c.add(y, z, x);
		float u=c.add(m, n);
		System.out.println("Addition of Two Integer Is "+s);
		System.out.println("Addition of Three Integer Is "+t);
		System.out.println("Addition of Two Float Is "+u);
		
	}

}
