package RevisionCoreJavaLab;

public class TypeCasting {
	public static void main(String[] args) {
		int i=150;
		byte b=(byte)i;
		float f=(float)i;
		byte b1=12;
		int i1=(int)b1;
		byte x=12;
		byte y=2;
		//byte sum=x*y;// we cannot perform arithmetic operation in bytes;but=.....we can perform in int;
		float multi=x*y;
		System.out.println(multi);
		System.out.println(i1);
		System.out.println(f);
		int i2=97;
		char c=(char)i2;//By Type casting we can find ASCII value also;
		System.out.println(c);
		
	}

}
