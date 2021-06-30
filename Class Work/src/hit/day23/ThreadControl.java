package hit.day23;

public class ThreadControl {
	public static void main(String[] args) {
		ReservationCounter counter=new ReservationCounter();
		Thread surya=new Thread(new BookingProcess(counter,1000),"surya");
		Thread nithish=new Thread(new BookingProcess(counter,500),"nithish");
		surya.start();
		nithish.start();
	}

}
class BookingProcess implements Runnable{
	ReservationCounter counter;int amt;
	public BookingProcess(ReservationCounter counter,int amt) {
		this.counter=counter;
		this.amt=amt;
	}
	@Override
	public void run() {
		synchronized(counter) {//by using this we can achieve the order.
			//in this case one thread is executed successfully and the next thread is executed
		counter.bookTicket(amt);
		counter.giveChanges();
		}
	}
}
class ReservationCounter {
	int amt;
	public void bookTicket(int amt) {
		this.amt=amt;
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("Ticket booked by "+name);
		System.out.println(name+" brought amount "+amt);
	}
	public void giveChanges() {
		Thread t= Thread.currentThread();
		String name=t.getName();
		System.out.println("Balance changes given to "+name);
		System.out.println(name+" got a change "+(amt-100));
	}
}