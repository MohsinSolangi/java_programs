class A{

	A(){
	System.out.println("no arg const of class A");
	}
	A(int a){
	System.out.println("1 arg const of class A");	
	}

	A(int a, int b){
	System.out.println("2 arg const of class A");
	}

	
}

class B extends A{

	B(){
		System.out.println("no arg const of class B");
	}
	
	B(int a, int b){
		super(a,b);
	System.out.println("2 arg const of class B");
	}
	
	B(int a, int b, int c){
		super(a);
	System.out.println("3 arg const of class B");
	}
	
	B(int a, int b, int c, int d){
		super(a,b);
	System.out.println("4 arg const of class B");
	}
	
	
}

class C extends B{

	C(){
	System.out.println("no arg const of class C");
	}
	
	C(int a){
		super(a,5);
	System.out.println("1 arg const of class C");	
	}
	
	C(int a, int b, int c){
		super(a,b,c);
	System.out.println("3 arg const of class C");
	}
	
	C(int a, int b, int c, int d, int e){
		super(a,b,c,d);
	System.out.println("5 arg const of class C");
	}
	
	
}

class SuperKeywordEx1{
	public static void main (String args[] ){
		C c1 = new C();
		C c2 = new C(4);
		C c3 = new C(10,20,30);
		C c4 = new C(10,20,30,40,50);d
		
	}
}