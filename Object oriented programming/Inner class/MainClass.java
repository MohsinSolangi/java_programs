import java.util.*;
class OuterClass{
	int feet;
	int inch;
	
	Inner in1 = new Inner();
	Inner in2 = new Inner();
	
	class Inner{
		int width ;
		int height;
		
		void show(){
		
		System.out.println(feet);
		System.out.println(inch);
		System.out.println(width);
		System.out.println(height);
		
		}	
	}
}

class MainClass{
	
	public static void main (String args[]){
	
	OuterClass out1 = new OuterClass();
	OuterClass out2 = new OuterClass();
	
	out1.feet=10;
	out1.inch=20;
	out1.in1.width=30;
	out1.in1.height=40;
	out1.in2.width=50;
	out1.in2.height=60;
	
	out2.feet=100;
	out2.inch=200;
	out2.in1.width=300;
	out2.in1.height=400;
	out2.in2.width=500;
	out2.in2.height=600;
	
	
	out1.in1.show();
	out1.in2.show();

	out2.in1.show();
	out2.in2.show();
	}
}