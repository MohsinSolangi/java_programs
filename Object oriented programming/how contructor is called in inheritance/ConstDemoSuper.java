class A{
	A(){
		System.out.println("I am no arg const of A class");
		
	}
	A(int len){
		System.out.println("I am one arg const of A class");
	}
	
}

class B extends A{
	B(){
		System.out.println("I am no arg const of B class");
		
	}
	B(int len){
		super(len);
		System.out.println("I am one arg const of B class");
	}
	
}

class C extends B{
	C(){
		System.out.println("I am no arg const of C class");
		
	}
	C(int len){
		super(len);
		System.out.println("I am one arg const of C class");
	}
	
}

class ConstDemoSuper{
	
	public static void main (String args[]){
		
		C ob1 = new C();
		C ob2 = new C(10);
		
	}
	
}
