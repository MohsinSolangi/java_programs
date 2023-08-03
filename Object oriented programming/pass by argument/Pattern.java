import java.util.*;

class Pattern{

	public static void main (String arg[]){

		StarPattern starPattern = new StarPattern();
		
		
		starPattern.starEx1(5);
		starPattern.numberEx1(4);
		starPattern.numberEx2(4);
		starPattern.numberEx3(5);
		starPattern.alphaEx1(5);
		
	}
}

class StarPattern{
 
 
 void  starEx1(int limit){
		for(int i = 1; i<limit; i++){
			
		for(int j = 1; j<=i ;j++){
		System.out.print("* ");
		}
		System.out.println("");
	}
 } 


	void numberEx1(int limit){
		int number = 0;
		for(int i = limit; i>0; i--){
			
			for(int j = i; j>0 ;j--){			
			number++;
			System.out.print(number);
			}
			number=0;
			System.out.println(" ");
			
		}
	}

	void numberEx2(int limit){
			
		int number = 0;
		
		for(int i = 1; i<=limit; i++){
				
			for(int j = 1; j<=i ;j++){
			number++;
			System.out.print(number);
			}
			number = 0;
			System.out.println("");
		}
	}


	void numberEx3(int limit){
		
		int number = 0;
		for(int i = 1; i<=limit; i++){
				
			for(int j = 1; j<=i ;j++){
			number++;
			System.out.print(number );
			}
			System.out.println(" ");
		}
	}

	void alphaEx1(int limit){
		char alpha = 64;
		
		for(int i = 1; i<=limit; i++){
				
			for(int j = 1; j<=i ;j++){
			alpha++;
			System.out.print(alpha);
			}
			System.out.println("");
		}
		
	}


}
