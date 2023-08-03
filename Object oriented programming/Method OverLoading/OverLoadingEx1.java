import java.util.*;

class Calculator{

	void add(int first , int second ){
		System.out.println(" sum is " + (first+second) );
		
	}

	void add(int first , float second ){
		System.out.println(" sum is " + (first+second) );
	}

	void add(float first , int second ){
		System.out.println(" sum is " + (first+second) );
	}

	void add(float first , float second ){
		System.out.println(" sum is " + (first+second) );
	}



}

class OverLoadingEx1{

	public static void main (String args []){
	
		Calculator calculator = new Calculator();
		
		calculator.add(14,15);
		calculator.add(22,2.2f);
		calculator.add(3.1f,5);
		calculator.add(4.1f, 7.1f);
		
	}

}
