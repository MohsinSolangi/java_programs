import java.util.*;

class Example{

	int n1,n2;
	
	Example(int a ,int b){
	
		n1=a;
		n2=b;
	}
	int show(){
		System.out.println("first value : " +n1);
		System.out.println("second value : " +n2);
		return n1+n2;		
		
	}

}
	
	class ConstructorEx1{
		
		public static void main(String[] args){
		
			Example e = new Example(2,6);
			int a = e.show();
			System.out.println("Main Method " +a);
		}
	}