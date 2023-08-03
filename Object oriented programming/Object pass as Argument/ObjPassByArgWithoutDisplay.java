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
		 System.out.println("X: "+x+"\nY: "+y+"\n Width: "+width+"\n Height: "+height);
	}

	Rectangle add(Rectangle ob1, Rectangle ob2){
	
	Rectangle temp1 = new Rectangle();

		temp1.x=x+ob1.x+ob2.x;
		temp1.y=y+ob1.y+ob2.y;
		temp1.width=width+ob1.width+ob2.width;
		temp1.height=height+ob1.height+ob2.height;
		

		return temp1;

		
	}
	
	Rectangle sub(Rectangle ob1, Rectangle ob2, Rectangle ob3){
	
	Rectangle temp2 = new Rectangle();
     
 		temp2.x=x-ob1.x-ob2.x-ob3.x;
		temp2.y=y-ob1.y-ob2.y-ob3.y;
		temp2.width=width-ob1.width-ob2.width-ob3.width;
		temp2.height=height-ob1.height-ob2.height-ob3.height;

		return temp2;
	}
	
	Rectangle division(Rectangle ob1){
	
	Rectangle temp3 = new Rectangle();

		temp3.x=x/ob1.x;
		temp3.y=y/ob1.y;
		temp3.width=width/ob1.width;
		temp3.height=height/ob1.height;

		return temp3;
		
	}
	
	Rectangle multi(Rectangle ob1, Rectangle ob2,Rectangle ob3,Rectangle ob4){
	
	Rectangle temp4 = new Rectangle();

		temp4.x=x*ob1.x*ob2.x*ob3.x*ob4.x;
		temp4.y=y*ob1.y*ob2.y*ob3.y*ob4.y;
		temp4.width=width*ob1.width*ob2.width*ob3.width*ob4.width;
		temp4.height=height*ob1.height*ob2.height*ob3.height*ob4.height;

		return temp4;
		
	}
	
	Rectangle reminder(Rectangle ob1, Rectangle ob2,Rectangle ob3){

		Rectangle temp5 = new Rectangle();

		temp5.x=x%ob1.x%ob2.x%ob3.x;
		temp5.y=y%ob1.y%ob2.y%ob3.y;
		temp5.width=width%ob1.width%ob2.width%ob3.width;
		temp5.height=height%ob1.height%ob2.height%ob3.height;
		
		return temp5;
		}
	
	
	}

	class ObjPassByArgWithoutDisplay{
		public static void main(String arg[]){
	
		Rectangle r=new Rectangle(10,20,30,40);
		Rectangle r1=new Rectangle(210,240,330,420);
		Rectangle r2=new Rectangle(120,780,320,280);
		Rectangle r3=new Rectangle(250,450,940,760);
		Rectangle r4=new Rectangle(571,480,490,590);
		Rectangle r5=new Rectangle(310,440,570,940);

		 
		 Rectangle ob1 = r.add(r1,r2);
		 Rectangle ob2 = r1.sub(r1,r2,r);
		 Rectangle ob3 = r2.division(r);
		 Rectangle ob4 = r3.multi(r1,r,r4,r5);
		 Rectangle ob5 = r4.reminder(r1,r2,r3);

		 
		 ob1.show();
		 ob2.show();
		 ob3.show();
		 ob4.show();
		 ob5.show();

	}
}