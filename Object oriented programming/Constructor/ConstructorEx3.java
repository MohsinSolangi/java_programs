import java.util.*;

class Result{
	
	int marks;
	
	Result(int number){
		marks = number;
	}
	
	String passOrFail(){
		if(marks>=50){
			return "pass";
		}else
			return "fail";
	}
	
}

class ConstructorEx3{
	
	public static void main(String args[]){
	
	Result result = new Result(88);				
	
	String outputResult = result.passOrFail();
	
	System.out.print("Result is " + outputResult);
	
	}
	
}