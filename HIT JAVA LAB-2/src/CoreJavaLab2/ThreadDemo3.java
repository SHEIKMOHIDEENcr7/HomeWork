package CoreJavaLab2;



public class ThreadDemo3 {
		public static void main(String[] args) {
			Thread t=Thread.currentThread();
			t.setName("Sheik");
			System.out.println("Reservation counter is Started Working.."+t.getName());
			ReservationCounter counter=new ReservationCounter();
			Thread nithish=new Thread(new BookingJob(counter,1000),"Nithish");
			Thread surya=new Thread(new BookingJob(counter,500),"Surya");
			nithish.start();
		    surya.start();
			
		}
	}
class BookingJob implements Runnable{
	ReservationCounter counter;int amt;
	public BookingJob(ReservationCounter counter,int amt) {
		this.counter=counter;
		this.amt=amt;
	}
	@Override
	public void run() {
		counter.bookTicket(amt);
		counter.giveChanges();
		
	}
}
class ReservationCounter{
	int amt;
	public void bookTicket(int amt) {
		this.amt=amt;
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" is come to book a Ticket in Reservation Counter");
		System.out.println(name+" brought "+amt);
	}
	public void giveChanges() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("Change given to "+name);
		System.out.println(name+" got a change "+(amt-100));
		
	}
}

