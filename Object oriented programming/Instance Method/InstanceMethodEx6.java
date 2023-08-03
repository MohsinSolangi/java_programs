import java.util.*;
	
class Calculator{
	
	int v1;
	int v2;
	
	void set(int a, int b){
		v1= a;
		v2= b;
		
	}
	
	void add(){
		System.out.println("Addition: "+(v1+v2));
	}

	void sub(){
		System.out.println("Subtraction : "+(v1-v2));
	}
	
	void multiply(){
		System.out.println("Multiplication "+(v1*v2));
	}

	void divide(){
		System.out.println("Division  "+(v1/v2));
	}
	
}
	
class InstanceMethodEx6{
	
	public static void main(String args[]){
	
	Calculator obj1 = new Calculator();
	Calculator obj2 = new Calculator();
	Calculator obj3 = new Calculator();
	
	obj1.set(10,5);
	obj2.set(70,50);
	obj3.set(80,35);
	
	
	System.out.println("obj1 data ");
	obj1.add();
	obj1.sub();
	obj1.multiply();
	obj1.divide();
	
	System.out.println("obj2 data ");
	obj2.add();
	obj2.sub();
	obj2.multiply();
	obj2.divide();
	
	System.out.println("obj3 data ");
	obj3.add();
	obj3.sub();
	obj3.multiply();
	obj3.divide();
	
	}
}