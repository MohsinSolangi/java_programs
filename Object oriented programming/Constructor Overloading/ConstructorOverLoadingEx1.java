import java.util.*;

class Rectangle{
	
	int x; 
	int y;
	int width;
	int height;
	int value4;
	int value5;
	int value6;
	int value7;
	
	
	Rectangle(){
	
	System.out.println("constructor with no argument ");
	}
	
	Rectangle(int a){
	x=a;
	System.out.println("constructor with 1 argument");
	}
	
	Rectangle(int a, int b){
	x=a;
	y=b;
	System.out.println("constructor with 2 argument");
	
	}
	
	Rectangle(int a, int b , int c){
	x=a;
	y=b;
	width=c;
	
	System.out.println("constructor with 3 argument");
	
	}

	Rectangle(int a, int b , int c, int d){
	x=a;
	y=b;
	width=c;
	height=d;
	
	System.out.println("constructor with 4 argument");
	
	}
	 
	Rectangle(int a, int b , int c, int d ,int e){
	x=a;
	y=b;
	width=c;
	height=d;
	value4=e;
	
	System.out.println("constructor with 5 argument");
	
	}
	 
	Rectangle(int a, int b , int c, int d ,int e,int f){
	x=a;
	y=b;
	width=c;
	height=d;
	value4=e;
	value5=f;
	System.out.println("constructor with 6 argument");
	
	}
	 
	Rectangle(int a, int b , int c, int d ,int e,int f ,int g){
	x=a;
	y=b;
	width=c;
	height=d;
	value4=e;
	value5=f;
	value6=g;
	System.out.println("constructor with 7 argument");
	
	}
	 
	
	
	
	void show(){
		System.out.println(x);
		System.out.println(y);
		System.out.println(width);
		System.out.println(height);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7);
		
	}

}


	class ConstructorOverLoadingEx1{
	
	public static void main (String args[]) {
		
	Rectangle rectobj1 = new Rectangle();
	Rectangle rectobj2 = new Rectangle(21);
	Rectangle rectobj3 = new Rectangle(12,22);	
	Rectangle rectobj4 = new Rectangle(33,44,22);	
	Rectangle rectobj5 = new Rectangle(77,33,11,99);	
	Rectangle rectobj6 = new Rectangle(67,23,31,22,67);	
	Rectangle rectobj7 = new Rectangle(57,43,41,12,61,38);	
	Rectangle rectobj8 = new Rectangle(98,73,51,22,41,18,86);	
	
	rectobj1.show();
	System.out.print("\n \n");
	rectobj2.show();
	System.out.print("\n \n");
	rectobj3.show();
	System.out.print("\n \n");
	rectobj4.show();
	System.out.print("\n \n");
	rectobj5.show();
	System.out.print("\n \n");
	rectobj6.show();
	System.out.print("\n \n");
	rectobj7.show();
	System.out.print("\n \n");
	rectobj8.show();
	
	
	}
	
}