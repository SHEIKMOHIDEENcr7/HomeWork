package CoreJavaLab2;

import java.util.Scanner;

public class GoodFanDemo {
	public static void main(String[] args) {
		GoodFan fan=new GoodFan();
		FirstPull FP=new FirstPull();
		SecondPull sp=new SecondPull();
		ThirdPull tp=new ThirdPull();
		LastPull lp=new LastPull();
		Scanner sc=new Scanner(System.in);
		int state=1;
		while(true) {
		while(state==1) {
	    fan.fp=FP;
		String a=sc.next();
//		fan.pull();
		FP.firstpull();
		state++;
		}
		while(state==2) {
		    fan.fp=sp;
			String a=sc.next();
//			fan.pull();
			sp.secondpull();
			state++;
			}
		while(state==3) {
		    fan.fp=tp;
			String a=sc.next();
//			fan.pull();
			tp.thirdpull();
			state=0;
			}
		while(state==0) {
		    fan.fp=lp;
			String a=sc.next();
//			fan.pull();
			lp.lastpull();
			state++;
			}
		}
		
	}

}
class GoodFan {
	FirstPull fp;
	public void pull() {
		System.out.println(fp);
	}
}
class FirstPull{
	void firstpull() {
		System.out.println("Switched On the Fan");
	}
	
}
class SecondPull extends FirstPull{
	void secondpull() {
		System.out.println("switched On the medium speed");
	}
	
}
class ThirdPull extends SecondPull{
	void thirdpull() {
		System.out.println("switched on the high speed");
	}
}
class LastPull extends ThirdPull{
	void lastpull() {
		System.out.println("switched off the Fan");
	}
}