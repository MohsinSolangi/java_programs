import java.util.*;
class Box{

	int feet;
	int inch;
	
	Box (int a , int b){
		
		feet = a;
		inch = b;
	
	}
	
	Rectangle r1 = new Rectangle(1,2);
	Rectangle r2 = new Rectangle(3,4);
	
	void show (){
		System.out.println("feet: "+ feet);
		System.out.println("inch: "+ inch);
		
	}

class Rectangle{
	
	int width;
	int height;
	
	Rectangle(int w, int h){
		
		width = w;
		height = h;
		
	}

	
	void add(){
		
		System.out.println("Addition "+(feet+inch));
		System.out.println("Addition "+(width+height));
		
	}
	
} //end inner class

}// end outer class

class InnerClassAdd{
	
	public static void main (String args[]){
		
	Box ob1 = new Box (10,5);
	Box ob2 = new Box (100,50);
	
	ob1.r1.add();
	ob1.r2.add();
	
	
	ob2.r1.add();
	ob2.r2.add();
	
	
	}
	
}