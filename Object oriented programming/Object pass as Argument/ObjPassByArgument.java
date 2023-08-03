
class Box {
	int feet;
	int inch;
	
	Box(int a, int b){
	feet = a;
	inch = b;
	}
	

 	
	static void add(){
		
		System.out.println("Addition " + (feet+inch));
	}
	
	static void add(Box ob){
		
		System.out.println("Addition " + (feet+ob.feet));
	}
	
	static void show(Box ob){
	
		System.out.println("Feet "+feet);
		System.out.println("inch "+inch);
		
	}
	
	static void add(Box ob1 , Box ob2){
		
		System.out.println("Addition of 3 obj feet" + (feet+ob1.feet+ob2.feet));
		System.out.println("Addition of 3 obj inch" + (inch+ob1.inch+ob2.inch));
		
	}
	

	
}

class ObjPassByArgumentEx1{
	
	public static void main (String args[]){
		
		Box obj1 = new Box(10,5);
		Box obj2 = new Box(8,3);
		Box obj3 = new Box(8,8);
		
	
		obj1.add();
		obj2.add();
		obj3.add();
		
		obj1.show();
		obj2.show();
		obj3.show();
		
		obj1.add(obj1);
		obj2.add(obj2);
		obj3.add(obj3);
	
		obj1.add(obj2,obj3);
		obj3.add(obj2,obj3);
	
	}
	
}


