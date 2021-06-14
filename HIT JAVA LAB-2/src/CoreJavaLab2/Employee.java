package CoreJavaLab2;
/*Using parameterized constructor with two parameters id and name. While 
creating the objects obj1 and obj2 passed two arguments so that this 
constructor gets invoked after creation of obj1 and obj2*/


public class Employee {
	int empId;
	String empName;
	 Employee(int id,String name){
		this.empId=id;
		this.empName=name;
	}
	 void info() {
		System.out.println("Id: "+empId+" name: "+empName);
	}
	
	
	public static void main(String[] args) {
		Employee E1=new Employee(101,"Sheik");
		Employee E2=new Employee(102,"Nithish");
		E1.info();
		E2.info();
		}

}
