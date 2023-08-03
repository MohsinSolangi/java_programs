import java.util.*;

class Rectangle{
	
	int x;
	int y;
	int width;
	int height;
	
	void set(int a,int b,int c,int d){
		
		x=a;
		y=b;
		width=c;
		height=d;
	
	}
	
	void add(){
		System.out.println("Addition: "+(x+y+width+height));
	}


	void multiply(){
		System.out.println("Multiplication "+(x*y*width*height));
	}

	void sub(){
		System.out.println("Subtraction : "+(x-y-width-height));
	}

}

class InstanceMethodEx3{
	
	public static void main(String args[]){
	
	Rectangle rectObj1 = new Rectangle();				
	Rectangle rectObj2 = new Rectangle();				
	
	rectObj1.set(10,20,30,40);
	rectObj2.set(15,22,36,52);
	
	System.out.println("obj1 data ");
	rectObj1.add();
	rectObj1.sub();
	rectObj1.multiply();
	
	
	System.out.println("obj2 data ");
	rectObj2.add();
	rectObj2.sub();
	rectObj2.multiply();
	
	
	}
	
}