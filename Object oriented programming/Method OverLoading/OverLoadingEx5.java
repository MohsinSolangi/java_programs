import java.util.*;

class OverLoadingEx5{

	public static void main (String args[]){
	Division division = new Division();
	
	division.division(66,22);
	division.division(35.75, 33);
	division.division(45,55.5);
	division.division(23.24,66.66,88);
	}

}

class Division{

	void division(int first ,int second ){
	System.out.println("Division is " + (first/second));
	}
	void division(double first , int second){
	
	System.out.println("Division is " + (first/second));
	}
	
	void division(int first , double second){
	System.out.println("Division is " + (first/second));
	}
	
	void division(double first , double second, int third){
	System.out.println("Division is " + (first/second/third));
	}

	
}