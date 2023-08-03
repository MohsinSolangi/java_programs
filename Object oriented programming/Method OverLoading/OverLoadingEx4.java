import java.util.*;

class OverLoadingEx4{
	public static void main (String args[]){
	
	Multiplication multi = new Multiplication();
	
	multi.multiply(8,3);
	multi.multiply(5,8.7f);
	multi.multiply(4.2f,9);
	multi.multiply(2.2f,3.3f);
	
	}
}
class Multiplication{

	void multiply(int first, int second){
	System.out.println("multiply " + (first*second));
	}
	
	void multiply(int first, float second){
	System.out.println("multiply " + (first*second));
	}
	
	void multiply(float first, int second){
	System.out.println("multiply " + (first*second));
	}
	
	void multiply(float first , float second){
	System.out.println("multiply " + (first*second));
	}
	
	
}

