import java.util.*;

class Pattern2{
	public static void main(String arg[]){
	
	Star star = new Star();
	
	
	star.starEx1(5);
	star.starEx2(5);
	star.starEx3(5);
	star.starEx4(5);
	star.primeNumber(10);
	
	}
}

class Star{
	
	void starEx1(int limit){
	
			for(int i = 1; i<=limit; i++){
			
			
			for(int  j =limit; j>=i; j--){
			System.out.print(" ");
			
			} 
			for(int  k =1; k<=i; k++){			
			System.out.print("*");
			
			}
			System.out.println();
			
		}
	}

	void starEx2(int limit){
			
		for(int i = 1; i<=limit; i++){
				
			for(int j = 1; j<=i ;j++){
			System.out.print("*");
			}
			System.out.println("");
		}
	
	}
	
	void starEx3(int limit){
	
		for(int i = limit; i>0; i--){
			
			for(int j = i; j>0 ;j--){			
			System.out.print("  *");
			}
			System.out.println(" ");	
		}
	
	}
	
	void starEx4(int limit ){
	for(int i = 1; i<limit; i++){
			
			for(int j = 1; j<limit ;j++){
			if(j>=i)
			System.out.print("*");
			
			else
				System.out.print(" ");
			}
			System.out.print("\n");
	}
	
	}
	
	void primeNumber(int  limit){
		
		for(int  i =2; i<=limit; i++ ){
			int j;
			for( j =2; j<=limit; j++){
				
				if (i%j == 0){
					break; 
				}
			}
			
			if(i==j)
			System.out.println(i);
		}
	
	
	}
}