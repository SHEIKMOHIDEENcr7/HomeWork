package CoreJavaLab2;
//Write a program in JAVA to create a class Bird also declares the different 
//parameterized constructor to display thename of Birds.
public class Birds {
	String name;
	public Birds() {
		System.out.println("this is the Parrot");
	}
	public Birds(String x) {
		this.name=x;
		System.out.println("this is the "+name);
	}
	public Birds(int a,String x) {
		this.name=x;
		System.out.println("this is the "+a+" year "+name);
	}
	public static void main(String[] args) {
		Birds obj=new Birds();
		Birds obj1=new Birds("sparrow");
		Birds obj2=new Birds(2,"crow");
		
	}

}
