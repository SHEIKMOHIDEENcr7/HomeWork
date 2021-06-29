package CoreJavaLab2;

import java.util.Date;

public class ThreadDemo4 {
	public static void main(String[] args)throws Exception {
		VaccinationCenter vc=new VaccinationCenter();
		Thread t=Thread.currentThread();
		t.setName("Sheik");
		System.out.println(new Date());
		System.out.println("Before Going to the College");
		Thread brother=new Thread(new GivingJob(vc));
		brother.setName("Thoufig");
		brother.start();
	
		//vc.getToken();
		System.out.println(t.getName()+" Write to start a exam at "+new Date());
		
	}

}
class GivingJob implements Runnable{
	VaccinationCenter vc;
	public GivingJob(VaccinationCenter vc) {
		this.vc=vc;
	}
	
	@Override
	public void run() {
		System.out.println("my brother is going to get token instead of me for Vaccine");
		try {
		vc.getToken();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
class VaccinationCenter{
	public void getToken()throws Exception {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" Standing in a Queue for taking Vaccine");
		Thread.sleep(5000);
		System.out.println("Finally "+name +" got the Token at "+new Date());
	}
}
