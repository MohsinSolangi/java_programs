import java.util.*;

class OverLoadingEx2{
	public static void main(String arg[]){
	
	Age2  age2 = new Age2();
	
	age2.age2();
	age2.age2(67);
	age2.age2(33,88);
	
	}
}

class Age2{

	void age2(){
		
		int age1 =13;
		int age2 = 23;
		
	String s = age1>age2?"age1 is largest " +age1:"age2 is largest " +age2;
	System.out.println(s);
	
	}

	
	void age2(int age1){
		
		int age2 = 23;
		
	String s = age1>age2?"age1 is largest " +age1:"age2 is largest " +age2;
	System.out.println(s);
	
	}
	
	void age2(int age1, int age2){
		
	String s = age1>age2?"age1 is largest " +age1:"age2 is largest " +age2;
	System.out.println(s);
	
	}
	
	
	
}