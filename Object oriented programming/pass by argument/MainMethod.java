import java.util.*;

class MainMethod{
	
	public static void main (String args []){
	
		Methods methods = new  Methods();
		
		methods.age2(12,23);
		methods.age3(15,18,94);
		methods.secretMessage("X125QK");
		methods.evenOrOdd(67);
		methods.positiveOrNegative(76);
	
	}


}
class Methods{
	
	void age2(int age1 , int age2 ){
			if(age1>age2){
			System.out.println("age 1 is largest");
		}else {System.out.println("age 2 is largest");}
	
	}
	
	void age3(int age1 , int age2, int age3){
			
				
				if(age1>age2){
			if(age1>age3){
				
			System.out.println("age 1 is largest");
			}else{System.out.println("age 3 is largest");}
		}else {if (age2>age1){
				if(age2>age3){
					System.out.println("age 2 is largest");
				}else{System.out.println("age 3 is largest");}
		}else{System.out.println("age 3 is largest");}
	}
	
	}
	

	void secretMessage(String secretCode){
	
	

	if(secretCode.equals("X125QK") || secretCode.equals("FGHL5") || secretCode.equals("LM6788")){
		System.out.println("Welcome Sir  to the hall");
	}
	else {
		System.out.println(" Sorry sir your are outsider you not allowed  in the hall");
		}
	}

	void positiveOrNegative(int num){
		
		if(num >0){
			System.out.println("positive " + num);
			
		}
		if(num<0){
			System.out.println("negative " + num);
		}
	}


	void evenOrOdd(int number){
		
		number %=2;
	if( number == 0 ){
		System.out.println(" number is even " );	
	}else{
		System.out.println(" number is odd  " );
	}
		
	}

	
}