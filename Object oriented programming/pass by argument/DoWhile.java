import java.util.*;

class DoWhile{

 public static void main (String args[]){

	DoWhileMethods methods = new DoWhileMethods();


		methods.prime(11);
		methods.evenOrOdd(10);
		methods.squre(5);
		methods.cube(5);
		methods.table(5,7);
		


 
 }
	
}

class DoWhileMethods{

	void prime(int number){
	
	
	int primeNumber = 0;
		
		int i=2;
		do {
			if(number%i== 0){
				primeNumber++;
				break;
			}
			i++;
			
		}while(i<number);
	
	
	if(primeNumber==0){
	System.out.println(" it is a prime Number");
	}
	else{
	System.out.println("it is not a prime number ");
	
	}
	
	}

	void evenOrOdd(int limit){
	int i=1;
	System.out.print("Odd \t Even \n");

		do {
 		System.out.println( i + " \t " +(i+1));	
			
			i+=2;
			
		}while(i<=limit);
	
	}
	
	void squre(int limit){
		int i=1;
		System.out.print("No \t Squre \n");

		do {
		System.out.println( i + " \t " +(i*i));	
			
			i++;
			
		}while(i<=limit);	
	}
	
	void cube(int limit){
	
	int i=1;
		System.out.print("No \t Squre \t Cube  \n");

		do {
		System.out.println( i + " \t " +(i*i) + " \t " + (i*i*i) );	
			
			i++;
			
		}while(i<=limit);
	}
	
	void table (int table, int limit){
		
	int i=1;

		do {
				System.out.println( table +" x " + i + " = " + (i*table));	
			
			i++;
			
		}while(i<=limit);
	
	}
	
	}
	

