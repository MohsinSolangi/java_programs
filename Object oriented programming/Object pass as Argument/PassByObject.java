import java.util.*;		
class Box{
	int feet,inch;
	void setValue(int a, int b){
		feet = a;
		inch = b;
	}
}
class Display{
	void display(Box ob){
		System.out.println("Feet : "+ob.feet);
		System.out.println("Inch : "+ob.inch);
	}
	void display(Box ob1,Box ob2){
		System.out.println("Feet : "+(ob1.feet+ob2.feet));
		System.out.println("Inch : "+(ob1.inch+ob2.inch));
	}
}
class PassByObject{
	public static void main (String args []){		
		Box ob1 = new Box();
		Box ob2 = new Box();
		ob1.setValue(100,50);
		ob2.setValue(500,100);
		Display d = new Display();
		d.display(ob1);		
		d.display(ob1,ob2);	
		d.display(ob1,ob1);	
	}
	
}
