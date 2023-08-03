class Box {
	int feet;
	int inch;
	
	Box(int a, int b){
	feet = a;
	inch = b;
	}
	

 	
	void sub(){
		
		System.out.println("Subtraction " + (feet-inch));
	}
	
	void sub(Box ob){
		
		System.out.println("Subtraction  of 2 obj feet" + (feet-ob.feet));
		System.out.println("Subtraction  of 2 obj inch" + (inch-ob.inch));
	}
	
	void show(){
	
		System.out.println("Feet "+feet);
		System.out.println("Inch "+inch);
		
	}
	
	 void sub(Box ob1 , Box ob2){
		
		System.out.println("Subtraction of 3 obj feet" + (feet-ob1.feet-ob2.feet));
		System.out.println("Subtraction of 3 obj inch" + (inch-ob1.inch-ob2.inch));
		
	}


	
}

class ObjPassByArgumentEx2{
	
	public static void main (String args[]){
		
		Box obj1 = new Box(24,8);
		Box obj2 = new Box(12,3);
		Box obj3 = new Box(7,4);
		
	
		obj1.sub();
		obj2.sub();
		obj3.sub();
		
		obj1.show();
		obj2.show();
		obj3.show();
		
		obj1.sub(obj1);
		obj2.sub(obj2);
		obj3.sub(obj3);
	
		obj1.sub(obj2,obj3);
		obj3.sub(obj2,obj3);
	
	}
	
}
