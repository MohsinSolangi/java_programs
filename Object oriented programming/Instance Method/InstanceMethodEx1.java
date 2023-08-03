import java.util.*;

class Box{

	int feet;
	int inch;
	
	void set(int a ,int b){
	
		feet=a;
		inch=b;
	}
	
	void show(){
		System.out.println("feet" +feet);
		System.out.println("Inch" +inch);
		
	}

}
	
	class InstanceMethodEx1{
		
		public static void main(String[] args){
		
		Box obj1= new Box();
		Box obj2= new Box();
		
		obj1.set(10,5);
		obj2.set(100,50);
		
		obj1.show();
		obj2.show();
		
		
		}
	}
