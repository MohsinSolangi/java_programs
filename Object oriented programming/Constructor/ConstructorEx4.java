import java.util.*;

class TrolyLoad{
	
	int load;
	
	TrolyLoad(int weight){
	
	load = weight;
	
	}
	
	String troly(){
			
	int totalIncome = 800*load;
	int driver = 150*load;
	int tax =   totalIncome/10;
	int diesel = 210*load;
	int totalExpense = driver+tax+diesel;
	int profit = totalIncome-totalExpense;
				
	String troly  = "Load Entered " +load+ "\n Total Income  "+ totalIncome + " \n Driver " +driver + "\n Tax 10% " +tax+ "\n Diesel " + diesel+ "\n Profit "+ profit ;
			
	return troly;
	
	}
}

class ConstructorEx4{

	public static void main (String args []){
	
		TrolyLoad  trolyLoad = new TrolyLoad(3);
		
		String output = trolyLoad.troly();
		
		System.out.print(output);
	
	}
}