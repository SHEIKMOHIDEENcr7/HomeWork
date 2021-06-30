package hit.day23;

public class ThreadRevision {
	public static void main(String[] args)throws Exception{
		Thread t=Thread.currentThread();
		System.out.println(t);
		new ThreadRevision();
		for(int i=1;i<=5;i++) {
			
			Thread.sleep(1000);
			System.out.println(i);
		
		}
	}
	public ThreadRevision() {
	    Thread t=new Thread(new ThreadJob());
	    t.start();
	}

}
class ThreadJob implements Runnable{
	@Override
	public void run() {
		System.out.println("Child Thread is Executed");
	}
}
