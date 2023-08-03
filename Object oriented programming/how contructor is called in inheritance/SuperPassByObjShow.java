class A{

	private int feet;
	private int inch;

	A(){
		feet = 0;
		inch = 0;
	System.out.println("no arg const of class A");
	}
	
	A(int a){
	feet=inch=a;
	System.out.println("1 arg const of class A");
	}
	
	A(int a, int b){
		feet = a;
		inch = b;
	System.out.println("2 arg const of class A");
	}
	
	A(A ob){
	this.feet = ob.feet;
	this.inch = ob.inch;
	
	System.out.println("Const for passing obj of class A"+feet+inch);
	}	
	
	void show(){
		System.out.println("feet"+feet);
		System.out.println("inch"+inch);
		
	}
}

class B extends A{

	private int width;

	B(){
		width = 0;
	System.out.println("no arg const of class B");
	}
	
	B(int a){
	super(a);
	width =a;
	System.out.println("1 arg const of class B");
	}
	
	B(int a, int b, int c){
	super(a,b);
	width= c;
	System.out.println("3 arg const of class B");
	}
	
	B(B ob){
	super(ob);
	width = ob.width;
	
	System.out.println("Const for passing obj of class B"+width);
	}
	void show(){
		super.show();
		System.out.println("width" + width);
		
		
	}
	
}

class C extends B{

	private int height;

	C(){
		height = 0;
	System.out.println("no arg const of class C");
	}
	
	C(int a){
	super(a);
	height = a;
	System.out.println("1 arg const of class C");
	}
	
	C(int a, int b, int c, int d){
	super(a,b,c);
	height = d;
	System.out.println("4 arg const of class C");
	}
	
	C(C ob){
	super(ob);
	height= ob.height;
	System.out.println("Const for passing obj of class C"+height);
	
	}
	void show(){
		super.show();
		System.out.println("height" + height);
		
		
	}
	
}

class SuperPassByObjShow{

	public static void main (String args[]){
		
		C ob1 = new C();
		C ob2 = new C(10);
		C ob3 = new C(100,200,300,400);
		C ob4 = new C(ob3);
		
	
		ob1.show();
		ob2.show();
		ob3.show();
		ob4.show();
		
		
	}
}