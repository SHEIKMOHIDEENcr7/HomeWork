package CoreJavaLab2;
/*Create a program that defines a class Student with the data 'name, city, 
and age,' as well as a method printData to display the data. To declare and 
access the values, create the objects s1 and s2.*/

class Student{
	String name;
	String city;
	int age;
	static int m;
	void printData() {
		System.out.println("Student Name="+name);
		System.out.println("Student City="+city);
		System.out.println("Student age="+age);
	}
}
public class Stest {
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		s1.name="Sheik";
		s2.name="Nithish";
		s1.city="chennai";
		s2.city="chennai";
		s1.age=19;
		s2.age=20;
		s1.printData();
		s2.printData();
		s1.m=20;
		s2.m=21;
		Student.m=27;
		System.out.println("s1.m ="+s1.m);
		System.out.println("s2.m ="+s2.m);
		System.out.println("Student ="+Student.m);
		
		
	}

}
