package hit.day24;

public class Deadlock {
	public static void main(String[] args) {
		Crane crane=new Crane();
		Frog frog=new Frog();
		new Thread(new Runnable() {
			@Override
			public void run() {
				crane.eat(frog);
			
				
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				
				frog.escape(crane);
			}
		}).start();
		
	}

}
class Crane{
	synchronized public void eat(Frog frog) {
		System.out.println();
		frog.leaveCalledByCrane();
		//System.out.println("Crane ate frog successfully");
	}
	synchronized public void leaveCalledByFrog(){
		//System.out.println("Crane leaved Frog as per frog concerned");
	}
}
class Frog{
	
	synchronized public void escape(Crane crane) {
		crane.leaveCalledByFrog();
		//System.out.println("frog is Escape from a Crane");
	}
	synchronized public void leaveCalledByCrane() {
		//System.out.println("Frog leaved Crane as per Crane concerned");
	}
}
