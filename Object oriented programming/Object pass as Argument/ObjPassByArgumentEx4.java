 class Box {
	int feet;
	int inch;
	
	Box(int a, int b){
	feet = a;
	inch = b;
	}
	

 	
	void divide(){
		
		System.out.println("Divide " + (feet/inch));
	}
	
	void divide(Box ob){
		
		System.out.println("Divide " + (feet/ob.feet));
		System.out.println("Divide " + (inch/ob.inch));
	
	}
	
	void show(){
	
		System.out.println("Feet "+feet);
		System.out.println("inch "+inch);
		
	}
	
	 void divide(Box ob1 , Box ob2){
		
		System.out.println("Divide" + (feet/ob1.feet/ob2.feet));
		System.out.println("Divide" + (inch/ob1.inch/ob2.inch));
		
	}
	

	
}

class ObjPassByArgumentEx4{
	
	public static void main (String args[]){
		
		Box obj1 = new Box(12,89);
		Box obj2 = new Box(72,22);
		Box obj3 = new Box(2,4);
		
	
		obj1.divide();
		obj2.divide();
		obj3.divide();
		
		obj1.show();
		obj2.show();
		obj3.show();
		
		obj1.divide(obj1);
		obj2.divide(obj2);
		obj3.divide(obj3);
	
		obj1.divide(obj2,obj3);
		obj3.divide(obj2,obj3);
	
	}
	
}
