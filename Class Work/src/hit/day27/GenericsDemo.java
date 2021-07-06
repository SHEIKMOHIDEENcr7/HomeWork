package hit.day27;

public class GenericsDemo {
	public static void main(String[] args) {
		Paint paint=new RedPaint();
		Paint paint1=new BluePaint();
		Powder powder=new RosePowder();
		BadPaintBrush2 brush=new BadPaintBrush2();
		brush.paint=paint;
		brush.doPaint();
		
		BadPaintBrush bp=new BadPaintBrush();
		bp.paint=paint;
		bp.doPaint(1);
		
		GoodPaintBrush<Paint> gpb=new GoodPaintBrush<>();
		gpb.setObj(paint1);
		System.out.println(gpb.getObj());
		
		Paint mypaint=gpb.getObj();
		mypaint.color();
		
		GoodPaintBrush<Powder> gpb2=new GoodPaintBrush<>();
		gpb2.setObj(new RosePowder());
		System.out.println(gpb2.getObj());
		powder.doMakeUp();
		
		
//		BadPaintBrush3 bpb3=new BadPaintBrush3();
//		bpb3.obj=paint1;
//		bpb3.execute();
//		
//		Powder p=new RosePowder();
//		p.doMakeUp();
		
	}

}
abstract class Paint{
	abstract public void color();
}
class RedPaint extends Paint{
	@Override
	public void color() {
       System.out.println("Red colour...");		
	}
}
class BluePaint extends Paint{
	@Override
	public void color() {
		System.out.println("Blue Colour....");
		
	}
}
abstract class Powder{
	abstract public void doMakeUp();
}
class WhitePowder extends Powder{
	@Override
	public void doMakeUp() {
		System.out.println("Applying White Powder...");
	}
	
}
class RosePowder extends Powder{
	@Override
	public void doMakeUp() {
		System.out.println("Applying Rose Powder...");
		
	}
}
class GoodPaintBrush<T>{
	T obj;
	public void setObj(T obj) {
		this.obj=obj;
		
	}
	public T getObj() {
		return this.obj;
	}
	
}
class BadPaintBrush3{
	Object obj;
	public void execute() {
		if(obj instanceof Paint) {
			Paint paint=(Paint)obj;
			paint.color();
		}
	}
}
class BadPaintBrush2{
	Paint paint;
	public void doPaint() {
		System.out.println(paint);
	}
}
class BadPaintBrush{
	Paint paint;
	public void doPaint(int i) {
		if(i==1) {
			RedPaint rp=new RedPaint();
			rp.color();
		}
		if(i==2) {
			BluePaint bp=new BluePaint();
			bp.color();
			
		}
	}
}
