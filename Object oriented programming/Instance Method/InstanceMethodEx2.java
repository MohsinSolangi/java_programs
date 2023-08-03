import java.util.*;
	
class Box2{
	
	int feet;
	int inch;
	
	void set(int a, int b){
		feet= a;
		inch= b;
		
	}
	
	void add(){
		System.out.println("Addition: "+(feet+inch));
	}


	void multiply(){
		System.out.println("Multiplication "+(feet*inch));
	}

	void sub(){
		System.out.println("Subtraction : "+(feet-inch));
	}
}
	
class InstanceMethodEx2{
	
	public static void main(String args[]){
	
	Box2 obj1 = new Box2();
	Box2 obj2 = new Box2();
	
	obj1.set(10,5);
	obj2.set(100,50);
	
	System.out.println("obj1 data ");
	obj1.add();
	obj1.sub();
	obj1.multiply();
	
	System.out.println("obj2 data ");
	obj2.add();
	obj2.sub();
	obj2.multiply();
	
	}
}