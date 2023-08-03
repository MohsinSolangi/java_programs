import java.util.*;

class Calculator{
	
	int value1;
	int value2;
	double value3;
	double value4;
	
	int result1;
	double result2;
	double result3;
	double result4;
	double result5;
	

	Calculator(){
	
	}
	
	Calculator(int a,int b){
	value1=a;
	value2=b;
	result1 = value1+value2;
	}
	
	Calculator(int a, double b){
	value1=a;
	value3=b;
	
	result2 = value1+value3;
	}
		
	Calculator(int a ,int b ,double c ){
	value1=a;
	value2=b;
	value3=c;
	
	result3 = value1+value2+value3;
	
	}	
	
	Calculator(double a ,double b ,int c ){
	
	value4=a;
	value3=b;
	value2=c;
	
	result4 = value4+value3+value2;
	
	}	
	
	Calculator(int a, int b,double c, double d){
	value1=a;
	value2=b;
	value3=c;
	value4=d;
	
	result5 = value1+value2+value3+value4;
	
	
	}
	
	void show(){
	System.out.println("Addition of 2 int " +result1);	
	System.out.println("Addition of int & double " +result2);	
	System.out.println("Addition of 2 int & 1 double " +result3);	
	System.out.println("Addition of 1 int & 2 double " +result4);
	System.out.println("Addition of 2 int & 2 double " +result5);
		
	}
}

class ConstructorOverLoadingEx2{
	
	public static void main (String args []){
		

		Calculator obj1 = new Calculator();
		Calculator obj2 = new Calculator(32,65);
		Calculator obj3 = new Calculator(45,98.2);
		Calculator obj4 = new Calculator(65,48,75.43);
		Calculator obj5 = new Calculator(45.11,48.66,75);
		Calculator obj6 = new Calculator(15,38,46.98,39.32);
		
		obj1.show();
		System.out.print("\n \n");
		obj2.show();
		System.out.print("\n \n");
		obj3.show();
		System.out.print("\n \n");
		obj4.show();
		System.out.print("\n \n");
		obj5.show();
		System.out.print("\n \n");
		obj6.show();
		
		
	}
		
	
}