package hit.day28;

public class GenericsDemo {
	public static void main(String[] args) {
		      Ball b=new Ball();
		      Sweet s=new Sweet();
			  Child child=new Child();
			  child.doing(b);
			  child.doing(s);
			  
		
		      Ball ball=new Ball();
		      Sweet sweet=new Sweet();
		      Child2 c=new Child2();
		      c.obj=ball;
		      c.doing();
		      c.obj=sweet;
		      c.doing();
		      
		      
	          Child3<Ball> ball1=new Child3<>();
	          ball1.setObj(new Ball());
	          ball1.getObj().Playing();
	          Child3<Sweet> sweet1=new Child3<>();
	          sweet1.setObj(new Sweet());
	          sweet1.getObj().Eating();
	         
	}

}
class Ball{
	public void Playing() {
		System.out.println("Playing now....");
	}
}
class Sweet{
	public void Eating() {
		System.out.println("Eating now....");
	}
	
}
class Child{
	Ball ball;
	Sweet sweet;
	public void doing(Ball ball) {
		this.ball=ball;
		ball.Playing();
	}
	public void doing(Sweet sweet) {
		this.sweet=sweet;
		sweet.Eating();
	}
}
class Child2{
	Object obj;
	public void doing() {
	if(obj instanceof Ball) {
		Ball ball=(Ball)obj;
		ball.Playing();;
	}else if(obj instanceof Sweet) {
		Sweet sweet=(Sweet)obj;
		sweet.Eating();;
	}
	}
}
class Child3<T>{
	T obj;
	public void setObj(T obj) {
		this.obj=obj;
	}
	public T getObj() {
		return obj;
	}
}