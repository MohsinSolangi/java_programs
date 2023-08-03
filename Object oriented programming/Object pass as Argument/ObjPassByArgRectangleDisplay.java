import java.util.*;
class Rectangle{
	
	int x;
	int y;
	int width;
	int height;
	
	Rectangle(int a, int b, int c , int d){
		x=a;
		y=b;
		width=c;
		height=d;
	}

	Rectangle(){

	}

	void show(){
		 System.out.println("X : "+x+"\n Y: "+y+"\n Width: "+width+"\n Height: "+height);

	}

}


class Display{
	static Rectangle add(Rectangle r1, Rectangle r2){

		Rectangle temp = new Rectangle();

		temp.x=r1.x+r2.x;
		temp.y=r1.y+r2.y;
        temp.width=r1.width+r2.width;
		temp.height=r1.height+r2.height;

		return temp;

		
	}
	
	static Rectangle sub(Rectangle r1, Rectangle r2, Rectangle r){

		Rectangle temp2 = new Rectangle();
     
 		temp2.x=r1.x-r2.x-r.x;
		temp2.y=r1.y-r2.y-r.y;
		temp2.width=r1.width-r2.width-r.width;
		temp2.height=r1.height-r2.height-r.height;
	
		return temp2;


		
	}
	
	static Rectangle division(Rectangle r){

		Rectangle temp3 = new Rectangle();

		temp3.x=r.x/r.x;
		temp3.y=r.y/r.y;
		temp3.width=r.width/r.width;
		temp3.height=r.height/r.height;

		return temp3;
		
	}
	
	static Rectangle multi(Rectangle r1, Rectangle r,Rectangle r4,Rectangle r5){

		Rectangle temp4 = new Rectangle();

		temp4.x=r1.x*r4.x*r.x;
		temp4.y=r1.y*r4.y*r.y;
		temp4.width=r1.width*r4.width*r.width;
		temp4.height=r1.height*r5.height*r.height;

		return temp4;
		
	}
	
	static Rectangle reminder(Rectangle r1, Rectangle r2,Rectangle r3){

		Rectangle temp5 = new Rectangle();

		temp5.x=r1.x%r2.x%r3.x;
		temp5.y=r1.y%r2.y%r3.y;
		temp5.width=r1.width%r2.width%r3.width;
		temp5.height=r1.height%r2.height%r3.height;
		
		return temp5;
	}
	
	
}

class ObjPassByArgRectangleDisplay{
	  
	  public static void main(String arg[]){
	
		Rectangle r=new Rectangle(10,20,30,40);
		Rectangle r1=new Rectangle(100,200,300,400);
		Rectangle r2=new Rectangle(130,380,380,280);
		Rectangle r3=new Rectangle(290,450,940,200);
		Rectangle r4=new Rectangle(57,480,490,590);
		Rectangle r5=new Rectangle(380,220,570,940);

		 
		 Rectangle ob1 = Display.add(r1,r2);
		 Rectangle ob2 = Display.sub(r1,r2,r);
		 Rectangle ob3 = Display.division(r);
		 Rectangle ob4 = Display.multi(r1,r,r4,r5);
		 Rectangle ob5 = Display.reminder(r1,r2,r3);

		 
		 ob1.show();
		 ob2.show();
		 ob3.show();
		 ob4.show();
		 ob5.show();

	}
}