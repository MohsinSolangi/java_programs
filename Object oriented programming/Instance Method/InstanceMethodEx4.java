import java.util.*;

class TrolyLoad{
	
	int load;
	//Instance Method 
	void setLoad(int a){
		load = a;
		}
	//InstanceMethod
	void troly(){
		
	int totalIncome = 800*load;
	int driver = 150*load;
	int tax =   totalIncome/10;
	int diesel = 210*load;
	int totalExpense = driver+tax+diesel;
	int profit = totalIncome-totalExpense;

	System.out.println("Load Entered " +load+ "\n Total Income  "+ totalIncome + " \n Driver " +driver + "\n Tax 10% " +tax+ "\n Diesel " + diesel+ "\n Profit "+ profit);
}
}

class InstanceMethodEx4{
	
	public static void main (String args[]){
	
	TrolyLoad load1 = new TrolyLoad();
	TrolyLoad load2 = new TrolyLoad();
	TrolyLoad load3 = new TrolyLoad();
	
	load1.setLoad(5);
	load2.setLoad(2);
	load3.setLoad(6);
	
	load1.troly();
	load2.troly();
	load3.troly();
	
	
	}
}