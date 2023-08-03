import java.util.*;

 class OperatorCalculator{
	
	public static void main (String args[]){
	Scanner sc = new Scanner(System.in);
	
	RtnMethods1  methods = new RtnMethods1();
	
	System.out.println("Enter two values ");
	int value1 = sc.nextInt();
	int value2 = sc.nextInt();
	
	
	int r1 = methods.calculator(value1, value2, '+');
	int r2 = methods.calculator(value1, value2, '-');
	int r3 = methods.calculator(value1, value2, '*');
	int r4 = methods.calculator(value1, value2, '/');
	int r5 = methods.calculator(value1, value2, '%');
	
	
	System.out.println("Addition is " + r1);
	System.out.println("Subtraction is " + r2);
	System.out.println("Multiplication  is " + r3);
	System.out.println("Division is " + r4);
	System.out.println("Remainder is " + r5);

	// printing squre and cube
	for(int i =1 ; i<=5; i++){ 
		
		double squre = methods.squre(i);
		float cube = methods.cube(i);
		
			System.out.println(i +"\t" +squre+"\t"+cube );
		}

		//grade
		String result = methods.grade(87);	
		System.out.println("result is " +result);	
		
		//factorial
		for (int j = 1 ; j<5 ; j++){
			
		int factorial = methods.factorial(j);
		System.out.println(factorial);
		} 
		
		
	}
}

class RtnMethods1{

	int calculator(int first, int second , char op ){
	if(op=='+')return first+second;
	if(op=='-')return first-second;
	if(op=='*')return first*second;
	if(op=='/')return first/second;
	if(op=='%')return first%second;
		return 0;
		
	}
	
	
	double squre(double value1){
		
		double result  = value1*value1;
		
		return result;
		
		}

	
	float cube(float value1){
		float result = value1*value1*value1;
		return result;
		
	}

	
	String grade(int marks){
	if(marks>50)
		return "pass";
	
	else 
		return "fail";
	}


	int factorial(int num){
		
		int input = 1;
		
		for(int i =1;i<num ; i++ ){
			
			input*=i;
			
		}
	
		return input;
	}


}

