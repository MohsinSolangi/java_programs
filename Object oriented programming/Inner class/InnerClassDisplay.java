import java.util.*;
class Box{

	int feet;
	int inch;
	
	Box (int a , int b){
		
		feet = a;
		inch = b;
	
	}
	
	
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

	void display(){
		
	System.out.println("width "+width );
	System.out.println("height"+height);
	
	}
	
} //end inner class

}// end outer class

class InnerClassDisplay{
	
	public static void main (String args[]){
		
	Box ob1 = new Box (10,5);
	Box ob2 = new Box (100,50);
	
	Box.Rectangle r1 = ob1.new Rectangle(1,2);
	Box.Rectangle r2 = ob1.new Rectangle(3,4);
	
	r1.display();
	r2.display();
	
	
	
	}
	
}