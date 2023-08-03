import java.util.*;
	
class InputValue{
	
	int first,second;
	
	InputValue(int v1, int v2){
		first = v1;
		second = v2;
		
	}
	int addMethod(){
		
		return first+second;
	}

	int subMethod(){
		
		return first-second;
	}

	int multiplyMethod(){
		
		return  first*second;
		
	}
	int divideMethod(){
		
		return first/second;
	}
	
	int remainderMethod(){
		
		return first%second;
	}

}
	
class ConstructorEx2{
	public static void main(String args[]){
	
	InputValue input = new InputValue(9,3);
	
	int add = input.addMethod();
	int sub = input.subMethod();
	int multiply =input.multiplyMethod();
	int divide = input.divideMethod();
	int remainder = input.remainderMethod();
	
	System.out.println("Addition is "+add );
	System.out.println("Subtraction is "+sub );
	System.out.println("Multiplication is "+multiply);
	System.out.println("division is "+ divide);
	System.out.println("remainder is "+ remainder);
	
	
	}
}