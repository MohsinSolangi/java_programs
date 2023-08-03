final class Calculator{
 
	final void add(int a , int b){
		System.out.println("Addition "+(a+b));
	}
	final void sub(int a, int b){
		System.out.println("Subtraction "+(a-b));
	}

	final void multiply(int a,int b){
		System.out.println("Multiplication"+(a*b));
	}
	
	final void divide(int a,int b){
		System.out.println("Division "+(a/b));
	}
	
	final void remainder(int a , int b){
		System.out.println("Remainder "+(a%b));
	}

}

class FinalCalculator{
	public static void main(String args[]){
	
	Calculator cal = new Calculator();
	
	cal.add(14,4);
	cal.sub(17,1);
	cal.multiply(15,4);
	cal.divide(13,4);
	cal.remainder(19,2);
	
	
	}
}
