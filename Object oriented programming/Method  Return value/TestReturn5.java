import java.util.*;
class TestReturn5{

	public static void main (String args []){
	
	RtnMethods5 methods = new RtnMethods5();

	
	
	for (int i = 5; i>=0 ; i--){
		System.out.println(methods.nameRev("mohsin",i));
		
	}
	
	for(int i =1; i<5;i++){
		
		System.out.println(methods.table(6,i));
	}
	
	System.out.println("Odd \t Even");
	
	for(int i = 1 ;i<10;i+=2 ){
		
		System.out.println(methods.evenOrOdd(i));
	}

	// System.out.println( num1+ " \n "+ num2 );
	for(int i=2 ; i<10; i++){
		
		System.out.println(methods.fibinocii(1,0));
	}
	
	
}
}

class RtnMethods5{
	
	char nameRev(String name,int i){
		
		char na = name.charAt(i);	
	
	return na;
	}

	String table(int table,int i){
		
	String result =table +" x " + i + " = " + (i*table);	
	
		
		return result;
	}

	String evenOrOdd(int i){
			
	String str =  i + " \t " +(i+1);	
		
		return str;
	}
	

	String fibinocii(int num1,int num2){
	int num3 = num1+num2;
		
		String fib = " "+num3;
		
		num1 = num2;
		num2 = num3;

	return fib;
	}

}