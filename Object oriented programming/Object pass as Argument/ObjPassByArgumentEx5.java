class Box {
	int feet;
	int inch;
	
	Box(int a, int b){
	feet = a;
	inch = b;
	}
	

 	
	void remainder(){
		
		System.out.println("Remainder " + (feet%inch));
	}
	
	void remainder(Box ob){
		
		System.out.println("Remainder " + (feet%ob.feet));
		System.out.println("Remainder " + (inch%ob.inch));
	}
	
	void show(){
	
		System.out.println("Feet "+feet);
		System.out.println("inch "+inch);
		
	}
	
 	 void remainder(Box ob1 , Box ob2){
		
		System.out.println("Remainder " + (feet%ob1.feet%ob2.feet));
		System.out.println("Remainder " + (inch%ob1.inch%ob2.inch));
		
	}
	

	
}

class ObjPassByArgumentEx5{
	
	public static void main (String args[]){
		
		Box obj1 = new Box(14,46);
		Box obj2 = new Box(42,53);
		Box obj3 = new Box(17,24);
		
	
		obj1.remainder();
		obj2.remainder();
		obj3.remainder();
		
		obj1.show();
		obj2.show();
		obj3.show();
		
		obj1.remainder(obj1);
		obj2.remainder(obj2);
		obj3.remainder(obj3);
	
		obj1.remainder(obj2,obj3);
		obj3.remainder(obj2,obj3);
	
	}
	
}
