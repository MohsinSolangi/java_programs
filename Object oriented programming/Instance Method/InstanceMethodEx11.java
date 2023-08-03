class Atm{ 

	int money;
	
	void set(int a){
	money = a;
	
	}
	
	void atm(){
	int remMoney;
			
			
		int fiveThousand=  money/5000;
		remMoney= money%5000;
		int oneThousand = remMoney/1000;
		remMoney = remMoney%1000;          
		int fiveHundred = remMoney/500;
		remMoney = remMoney%500;
		int onehundred  = remMoney/100;
		remMoney = remMoney%100;
		int fifty = remMoney/50;
		remMoney = remMoney%50;
		int twenty = remMoney /20;
		remMoney = remMoney %20;
		int ten = remMoney /10;
		remMoney = remMoney%10;
		int five = remMoney/5;
		remMoney = remMoney%5;
		int two = remMoney/2;
		remMoney  = remMoney %2;
		int one = remMoney/1;

			System.out.println("Rupees Entered  "+ money +  "\n Five Thousand " + fiveThousand+ " \n one Thousand " + oneThousand +" \n Five hundred " +fiveHundred+ "\n one hundred "+ onehundred+ "\n Fifty  " + fifty+"\n Twenty " + twenty+" \n Ten " + ten + "\n Five "+five +"\n Two "+two + "\n one "+ one);
	
		
	}
}

class InstanceMethodEx11{
	
	public static void main (String args []){
		Atm atm = new Atm();
		
		atm.set(8888);
		
		atm.atm();
	}
}