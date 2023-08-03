abstract class Xyz {
	abstract void a();
	abstract void b();
	
	void c(){
		System.out.println("C()");
	}
}

abstract class AAA extends Xyz{
	@Override
	void a(){
		System.out.println("A()");
	}
}

class BB extends AAA{
	@Override
	void b(){
		System.out.println("B()");
	}
}
class AbstractEx3{
	
	public static void main(String args[]){
	
	BB bb = new BB();
	
	bb.b();
	bb.a();
	bb.c();
	
	}
	
}