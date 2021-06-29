package CoreJavaLab2;

import java.util.Date;

public class ThreadDemo2 {
	public static void main(String[] args) {
		System.out.println(new Date());
		Thread t=new Thread(new Job());
		
		t.start();
		
	}
	

}
class Job implements Runnable{
	@Override
	public void run()  {
		try {
		for(int i=1;i<=5;i++) {
		System.out.println("The Job is Started..."+" Job"+i);
		Thread.sleep(1000);
		System.out.println(new Date());
		}}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
}
