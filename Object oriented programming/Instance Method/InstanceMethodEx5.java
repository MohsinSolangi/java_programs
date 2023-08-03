import java.util.*;

class Methods{

	int numb;
	
	void set(int n){
		numb = n;
	} 
	
	void fact(){

		int i=2;
		do {
		numb =numb*i;
		
		System.out.println("the factorial of "+i+" is "+ numb);
			
			i++;
			
		}while(i<numb);
	}

	void even(){
	if(numb%2==0){
		System.out.println("number is even " +numb);
	}else{
		System.out.println("number is not even " +numb);
	}
	}
	
	void odd(){
	if(numb%2==1){
		System.out.println("number is odd " +numb);
	}else{
		System.out.println("number is not odd " +numb);
	}
	}
	
	
	void prime(){
	int primeNumber = 0;
	for (int i=2 ; i<numb; i++){
		int a = numb%i;	
		if(a== 0){
			primeNumber++;
			break;
		}
	}
	if(primeNumber==0){
	System.out.println(" it is a prime Number");
	
	}else{
	System.out.println("it is not a prime number ");
	
	}
	
	}
}

class InstanceMethodEx5{
	public static void main (String args[]){

	Methods obj1 = new Methods();
	Methods obj2 = new Methods();
	
	obj1.set(5);
	// obj2.set(3);
	
		
	obj1.even();
	obj1.odd();
	obj1.fact();
	
	
	// obj2.even();
	// obj2.odd();
	// obj2.fact();
	
	
	
	}
}

