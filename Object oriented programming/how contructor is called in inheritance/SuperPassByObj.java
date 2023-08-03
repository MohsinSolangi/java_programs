class A{

	private int feet;
	private int inch;

	A(){
	System.out.println("no arg const of class A");
	}
	
	A(int a){
	System.out.println("1 arg const of class A"+a);
	}
	
	A(int a, int b){
	System.out.println("2 arg const of class A"+a+" "+b);
	}
	
	A(A ob){
	this.feet = ob.feet;
	this.inch = ob.inch;
	
	System.out.println("Const for passing obj of A"+feet+inch);
	}	
	
}

class B extends A{

	private int width;

	B(){
	System.out.println("no arg const of class B");
	}
	
	B(int a){
	super(a);
	System.out.println("1 arg const of class B"+a);
	}
	
	B(int a, int b, int c){
	super(a,b);
	System.out.println("3 arg const of class B"+a+" "+b+" "+c);
	}
	
	B(B ob){
	super(ob);
	width = ob.width;
	
	System.out.println("Const for passing obj of class B"+width);
	}
	
}

class C extends B{

	private int height;

	C(){
	System.out.println("no arg const of class C");
	}
	
	C(int a){
	super(a);
	System.out.println("1 arg const of class C"+a);
	}
	
	C(int a, int b, int c, int d){
	super(a,b,c);
	System.out.println("4 arg const of class C"+a+" "+b+" "+c+" "+d);
	}
	
	C(C ob){
	super(ob);
	height= ob.height;
	System.out.println("Const for passing obj of class C" +height);
	
	}
	
	
}

class SuperPassByObj{

	public static void main (String args[]){
		
		C ob1 = new C();
		C ob2 = new C(100);
		C ob3 = new C(100,2 00,300,400);
		C ob4 = new C(ob3);
		
		
	}
}