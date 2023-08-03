
class A{
	
	void abc(){
	System.out.println("ABC Method ");
	}
}

class B extends A{
	void xyz(){
		System.out.println("XYZ Method ");

	}
}

class C extends B{
	void hello(){
		System.out.println("Hello Method");
	}
	
}

class InheritanceEx1{
	public static void main (String args[]){
		C ob = new C();
		
		ob.abc();
		ob.xyz();
		ob.hello();
	}
}

