class Season{

	int input;
	
	void set(int a){
	
		input = a;
	}
	
		void season(){
	
	if(input == 3 || input == 4 || input == 5 ){
		System.out.println(" spring season");	
		
	}

	if(input == 6|| input  == 7 || input  == 8 ){
		System.out.println(" Summer season ");	
		
	 }
	
	if(input  == 9  || input  == 10 || input == 11){
		System.out.println(" Autumn Season  ");		
		
	}
	
	if(input  == 12 || input  == 1 || input == 2 ){
		System.out.println(" Winter Season ");	
		
	}
}
}


class InstanceMethodEx10{

	public static void main (String args[]){
		Season season = new Season();
		
		season.set(4);
		
		season.season();
		
	
	}
}