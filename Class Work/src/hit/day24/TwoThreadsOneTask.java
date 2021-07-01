package hit.day24;

public class TwoThreadsOneTask {
	public static void main(String[] args) {
		Panzer ammo=new Panzer();
		ShootingTask st=new ShootingTask(ammo);
		Thread sheik=new Thread(st,"Sheik");
		Thread nithish=new Thread(st,"Nithish");
		sheik.start();
		nithish.start();
	}

}
class ShootingTask implements Runnable{
	Panzer ammo;
	public ShootingTask(Panzer ammo) {
		this.ammo=ammo;
	}
	
	@Override
	
	public void run() {
		Thread t=Thread.currentThread();
		if(t.getName().equals("Sheik")) {
			for(int i=0;i<5;i++) {
			ammo.fill();
			}
		}
		else if(t.getName().equals("Nithish")) {
			for(int i=0;i<5;i++) {
			ammo.shoot();
			}
		}
		
	}
}
class Panzer{
	boolean task;
	synchronized public void fill() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		if(task) {
			try{wait();}
			catch(Exception e) {
				System.out.println(e);
			}
			notify();
		}
		System.out.println(name+" ...Fill the Ammo...");
		task=true;
		
	}
	synchronized public void shoot(){
		Thread t=Thread.currentThread();
		String name=t.getName();
		if(!task) {
			try{wait();}
			catch(Exception e) {
				System.out.println(e);
			}
			notify();
			
		}
		System.out.println(name+" ...Shoot the Ammo...");
		task=false;
		notify();
	}
}
