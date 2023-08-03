class Box {
	int feet;
	int inch;
	
	Box(int a, int b){
	feet = a;
	inch = b;
	}
	

 	
	void multiply(){
		
		System.out.println("Multiply " + (feet*inch));
	}
	
	void multiply(Box ob){
		
		System.out.println("Multiply " + (feet*ob.feet));
		System.out.println("Multiply "+(inch*ob.inch));
	}
	
	void show(){
	
		System.out.println("Feet "+feet);
		System.out.println("inch "+inch);
		
	}
	
	 void multiply(Box ob1 , Box ob2){
		
		System.out.println("Multiply " + (feet*ob1.feet*ob2.feet));
		System.out.println("Multiply " + (inch*ob1.inch*ob2.inch));
		
	}
	

	
}

class ObjPassByArgumentEx3{
	
	public static void main (String args[]){
		
		Box obj1 = new Box(24,8);
		Box obj2 = new Box(12,3);
		Box obj3 = new Box(7,4);
		
	
		obj1.multiply();
		obj2.multiply();
		obj3.multiply();
		
		obj1.show();
		obj2.show();
		obj3.show();
		
		obj1.multiply(obj1);
		obj2.multiply(obj2);
		obj3.multiply(obj3);
	
		obj1.multiply(obj2,obj3);
		obj3.multiply(obj2,obj3);
	
	}
	
}
