import java.util.*;

class Rectangle{
	int x;
	int y;
	
	int width;
	int height;
	
	
}

class TestRectangle{
	public static void main (String args []){
	
	
	Rectangle r1 = new Rectangle();
	Rectangle r2 = new Rectangle();
	Rectangle r3 = new Rectangle();
	Rectangle r4 = new Rectangle();
	Rectangle r5 = new Rectangle();
	
	r1.x = 1;
	r1.y = 2;
	r1.width = 3;
	r1.height = 4;
	
	r2.x = 5;
	r2.y = 10;
	r2.width = 15;
	r2.height = 20;
	
	r3.x = 10;
	r3.y = 20;
	r3.width = 30;
	r3.height = 40;
	
	r4.x = 100;
	r4.y = 200;
	r4.width = 300;
	r4.height = 400;
	
	r5.x = 1000;
	r5.y = 2000;
 	r5.width = 3000;
	r5.height = 4000;
	
	
	System.out.println(r1.x + r2.x + r3.x+ r4.x+ r5.x);
	System.out.println(r1.y+ r2.y+ r3.y+ r4.y+ r5.y);
	System.out.println(r1.width+ r2.width+ r3.width+ r4.width+ r5.width);
	System.out.println(r1.height+ r2.height+ r3.height+ r4.height+ r5.height);
	
	System.out.println(r1.x);
	System.out.println(r1.y);
	System.out.println(r1.width);
	System.out.println(r1.height);
	
	System.out.println(r2.x);
	System.out.println(r2.y);
	System.out.println(r2.width);
	System.out.println(r2.height);
	
	System.out.println(r3.x);
	System.out.println(r3.y);
	System.out.println(r3.width);
	System.out.println(r3.height);
	
	System.out.println(r4.x);
	System.out.println(r4.y);
	System.out.println(r4.width);
	System.out.println(r4.height);
	
	System.out.println(r5.x);
	System.out.println(r5.y);
	System.out.println(r5.width);
	System.out.println(r5.height);
	
	
	
	
	
	}
}