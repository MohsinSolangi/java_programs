import java.util.*;

class TestReturn2{
	public static void main (String args[]){
	RtnMethods2 methods  = new RtnMethods2();
	
	boolean prime = methods.primeNumber(5);
	boolean even =  methods.isEven(7);
	boolean positive =  methods.isPositive(23);
	String age2 =  methods.age2(22,44);
	String age3 =  methods.age3(33,22,11);
	
	System.out.println("is prime number ? "+ prime);
	System.out.println("is even number ? "+ even);
	System.out.println("is positive number ? "+ positive);
	System.out.println(age2);
	System.out.println(age3);
	
	
	
	}
}

class RtnMethods2{

		boolean primeNumber(int number){
	
	boolean t = false;
	
	for (int i=2 ; i<number-1; i++){
			if(number%i==1){
				t= true;
				break;
			}else
				t= false;
			
		}
		
		return t;
	}
	
	
	boolean isEven(int number){
		number%=2;
		
		if(number == 0)
			return true;
	
		else
			return false;
	}
	
	
	boolean isPositive(int number){
	boolean n = true;
	
	
		if(number >0){
			n= true;
			}
		if(number<0){
			n = false;
		}
	return n;
	
	}
	 
	String age2(int age1, int age2){
		
	String str = age1>age2?"age1 is largest " +age1:"age2 is largest " +age2;
	
	return str;
	
		
	}

		String age3(int age1, int age2 ,int age3){
		
		String txt = (age1>age2 && age1>age3) ? ("age1 is largest " + age1) : ((age2>age1 && age2>age3)? ("age2 is largest "+age2): ("age3 is largest "+age3)) ;


		return txt;
		
		}

}