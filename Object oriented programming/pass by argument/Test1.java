import java.util.*;

class Test1{

	public static void main (String args []){

	Calculator calculator = new Calculator();
	
	calculator.add(20,30);
	calculator.subtract(40,10);
	calculator.multiplication(20,3);
	calculator.division(10,2);
	calculator.remainder(2,30);	
	}
	
}


class Calculator{
	
	void add(int a, int b){
		System.out.println("Addition is :"+(a+b) );
	}
	void subtract(int a, int b){
		System.out.println("Subtracion is :" + (a-b));
	}
	void multiplication(int a, int b){
		System.out.println("Multiplication is  :" + (a*b));
		
	}

	void division(int a, int b){
		System.out.println("division is  :" + (a/b));
		}
	
	void remainder(int a, int b){
		System.out.println("remainder is  :" + (a%b));
	
	
	}
	}
	