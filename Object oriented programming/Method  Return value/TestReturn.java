import java.util.*;

class TestReturn{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	Calculator calobj = new Calculator();
		System.out.println("Enter two values ");
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
			
		int add =  calobj.add(input1,input2);
		
		int subtarct = calobj.subtract(input1, input2);
		
		int multiply = calobj.multiply(input1,input2);
		
		Double d1 = new Double(input1);
		Double d2 = new Double(input2);
		
		double divide = calobj.division(d1,d2);
		
		float f1 = input1;
		float f2 = input2;
		
		float remainder = calobj.remainder(f1,f2);
		
		
		System.out.println(" Addition is "+ add);
		System.out.println("Subtraction is  "+ subtarct);
		System.out.println("Multiplication is  "+ multiply);
		System.out.println("Division is "+ divide);
		System.out.println("Remainder is  "+remainder);
		
		
		}

}

class Calculator{

	int add(int value1,int value2){
	
		int value3 = value1+value2;
		
		return value3;
	}
	
	int subtract(int value1 , int value2){
		
		int value3 = value1-value2;
		
		return value3;
	}

	int multiply(int value1 , int value2){
		
		int value3 = value1*value2;
		
		return value3;
		
	}
	
	double division(double value1, double value2 ){
		
		double value3 = value1/value2;
		
		return value3;
		
	}

	float remainder(float value1 , float value2){
		
		float value3 = value1%value2;
		
		return value3;
		
	}
}
