import java.util.*;

class ForLoop{

	public static void main(String args[]){
	
		
		ForMethods forMethod = new ForMethods();
		
		forMethod.cube(5);
		forMethod.factorial(4);
		forMethod.alphabetReverse(7);
		forMethod.namePrint("MARSHAL");
		forMethod.alphabet(8);
		
	}


}

class ForMethods{

	void cube(int limit){
	System.out.print("No \t Squre \t Cube  \n");
	for (int i =1; i<=limit ;i++ ) {
		
		System.out.println( i + " \t " +(i*i) + " \t " + (i*i*i) );	
	}
	}
	
	void factorial(int number){
		
	int r = 1;
	
	for(int i= 1; i<=number;i++){	
	r =r *i;
	
	System.out.println("the factorial of "+i+" is "+ r);	
	} 
	}

	void namePrint(String name){
			
	String n = " ";
	
	for (int i = 0; i<=name.length() ;i++)	{
		
		System.out.println(n);	
		if(i<name.length())
		n = n+name.charAt(i);	
	}

	}

	void alphabetReverse(int limit){
			char a = 90;
	limit = 90 -limit;
	
	for (int i =90;i>limit ; i--){	
		System.out.println(a);
		a--;
	
	}
		
	}

	void alphabet(int limit){
		char a = 65;
	for (int i =1; i<=limit ; ++i){
		
		System.out.println(a);
		a++;
	}
	}
}