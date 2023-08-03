import java.util.*;

class OverLoadingEx6{

	public static void main (String args[]){
	Addition obj = new Addition();
	
	
	obj.add(88,99);
	obj.add(22,44,33);
	obj.add(31.21,87.12);
	obj.add(32,11,44.23);
	
	
	}

}

class Addition {
	
	void add(int a, int b ){
		System.out.println(a+b);
	}
	
	void add(int a, int b, int c){
		System.out.println(a+b+c);
	}
	
	void add(double a, double b){
		System.out.println(a+b);
	}
	
	void add(int a ,int b, double c){
	
		System.out.println(a+b+c);	
	}

}