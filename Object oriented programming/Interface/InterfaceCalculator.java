 interface Calc{
	
	void add(int a, int b);
	void sub(int a, int b);
	void multi(int a, int b);
	void div(int a, int b);
	void rem(int a, int b);
	
}

class Calculator implements Calc{
	
	public void add(int a, int b){
		System.out.println("Addition " +(a+b));
	}
	public void sub(int a, int b){
		System.out.println("Subtraction " +(a-b));
	}
	public void multi(int a, int b){
		System.out.println("Multiplication" +(a*b));
	}
	public void div(int a, int b){
		System.out.println("Division" +(a/b));
	}
	public void rem(int a, int b){
		System.out.println("Remainder " +(a%b));
	}
	
}

class InterfaceCalculator{
	public static void main (String args []){
		
		Calculator cal = new Calculator();
		
		cal.add(2,3);
		cal.sub(34,12);
		cal.multi(44,31);
		cal.div(88,32);
		cal.rem(12,38);
		
	}
	
}