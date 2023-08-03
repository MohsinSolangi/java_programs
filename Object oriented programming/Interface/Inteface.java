 interface X{
	void x();
	void y();
}
interface B{
	void a();
	void b();
}

class XY implements X{
	public void x(){
		System.out.println("I am x()");
	}
	public void y(){
		System.out.println("I am y()");
	}
}
class AB implements B{
	public void a(){
		System.out.println("I am a()");
	}
	public void b(){
		System.out.println("I am b()");
	}
}
class Inteface{
	public static void main(String arg[]){
		AB ob=new AB();
		ob.a();
		ob.b();
		XY ob1=new XY();
		ob1.x();
		ob1.y();
		
	}
}