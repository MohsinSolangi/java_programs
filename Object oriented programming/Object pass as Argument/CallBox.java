import java.util.*;	
	
class Box{
	int feet;
	int inch;

	
	Box (int a, int b){
		feet = a;
		inch = b;
	}

	Box(){}
	Box add(Box ob){
	
		Box obj = new Box();
	
		obj.feet = feet +ob.feet;
		obj.inch =inch +ob.inch;
	
		return obj;
	 
	}
	
	Box add(Box ob1, Box ob2){
	
		Box obj =new Box();
	
		obj.feet = feet +ob1.feet+ob2.feet;
		obj.inch =inch +ob1.inch+ ob2.inch;
	
		return obj;
	 
	}
	
	void show(){
	
		System.out.println("feet = "+feet);
		System.out.println("inch = "+inch);
		
	}
	
}

class CallBox{

	public static void main (String args []){
		
		Box obj1 = new Box(10,5);
		Box obj2 = new Box(100,50);
		
		Box obj3 = obj1.add(obj1);
		Box obj4 = obj2.add(obj1,obj2);
		
		System.out.println("Addition");
		
		obj3.show();
		obj4.show();
	}
	
}
