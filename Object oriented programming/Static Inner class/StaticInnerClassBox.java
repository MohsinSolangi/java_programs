
class Box{
	
	int feet;
	int inch;
	
	Box(int a ,int b){
		
	feet = a;
	inch = b;
	
	}
	void show(){
	System.out.println(feet);
	System.out.println(inch);
	
	}
	static class Rectangle{
		
		int width;
		int height;
		
		Rectangle(int w, int h){
			
			width = w;
			height= h;
			
		}
	
	void display(){
		
		System.out.println("width " +width);
		System.out.println("height" +height);
		}
	
	
	}// end Inner 
	
}//end outerclass


	class StaticInnerClassBox{

	public static void main (String args[]){
	
	Box.Rectangle r1 = new Box.Rectangle(10,5);
	r1.display();
	Box.Rectangle r2 = new Box.Rectangle(100,50);
	r2.display();
	
	
	}
}