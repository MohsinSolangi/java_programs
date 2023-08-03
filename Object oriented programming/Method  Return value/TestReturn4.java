import java.util.*;

class TestReturn4{
	
	public static void main (String args []){
		
		RtnMethods4  methods  = new RtnMethods4();
		
		String season =  methods.season(7);
		String atm =  methods.atm(763);
		String trolyLoad =  methods.trolyLoad(5);
		String employeeSalary =  methods.employeeSalary(50000);
		String hescobill = methods.hescobill(250);
		
		System.out.println(season+"\n \n"+atm +"\n \n" + trolyLoad+"\n \n"+hescobill+"\n \n"+ employeeSalary);
		
	}
}

class RtnMethods4{

	String season(int input){
	
	
	if(input == 3 || input == 4 || input == 5 ){
		String str =" spring season";	
		return str;
	}

	if(input == 6|| input  == 7 || input  == 8 ){
		String str2 =" Summer season ";	
		return str2;
	 }
	
	if(input  == 9  || input  == 10 || input == 11){
		String str3=" Autumn Season  ";		
		return str3;
	}
	
	if(input  == 12 || input  == 1 || input == 2 ){
		String str4 =" Winter Season ";	
		return str4;
	}
	
	
	
	return null;
}

	String atm(int money){
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

			String atmMoney = "Rupees Entered  "+ money +  "\n Five Thousand " + fiveThousand+ " \n one Thousand " + oneThousand +" \n Five hundred " +fiveHundred+ "\n one hundred "+ onehundred+ "\n Fifty  " + fifty+"\n Twenty " + twenty+" \n Ten " + ten + "\n Five "+five +"\n Two "+two + "\n one "+ one;
	
		return atmMoney;
	}
	
	String trolyLoad(int load){
			
	int totalIncome = 800*load;
	int driver = 150*load;
	int tax =   totalIncome/10;
	int diesel = 210*load;
	int totalExpense = driver+tax+diesel;
	int profit = totalIncome-totalExpense;
				
	String troly  = "Load Entered " +load+ "\n Total Income  "+ totalIncome + " \n Driver " +driver + "\n Tax 10% " +tax+ "\n Diesel " + diesel+ "\n Profit "+ profit ;
			
	return troly;
	
	}

	String employeeSalary(int pay){
	
	int houseRent = (pay/100)*45;
	int medAllowance = (pay/100)*15;
	int bonus = (pay/100)*5;
	int grossPay = pay+houseRent+medAllowance+bonus;
	int incomeTax = (grossPay/100)*5;
	int convanceAllowance = (grossPay/100)*8;
	int zakat = (grossPay/100)*2;
	int netIncome = grossPay-incomeTax-convanceAllowance-zakat;
				
		String sal ="House Rent 45% " +houseRent+ "\n Medical Allowance 15% " +medAllowance +"\n Bonus 5%"+ bonus +"\n Gross Pay " +grossPay +"\n Income Tax 5% " + incomeTax +" \n Convanace Allowance 8% " +convanceAllowance+ "\n Zakat 2%"+zakat+ " \n Net income "+ netIncome;
		
		return sal;
		
	}
	
	String hescobill(int unit){
		
		int result1 = 0;
				int result2 =0;
				int result3 = 0;
				int result4 = 0;
				int result5 = 0;
				int unit2 = unit;
				int unit4 = unit;
				int unit3 = unit -100;
				int unit5 = unit;
				int unit6 = unit;
				int unit7 = unit;
				int totalResult;
				
			if(unit2 > 1){
					if(unit2>100){unit2= unit2-unit3;}
				
				result1 = unit2*2;
				
			}
			
			if (unit4 >100 ){
				unit4 =unit-100;
				if(unit4>=1){  
					if(unit4>100){ unit4 = unit - unit3;}
				
				 result2 = unit4*4;
				
				}
			}
			
			
			if (unit5 >200 ){
				unit5 =unit-200;
					if(unit5 >=1){
					if(unit5>100){unit5= unit- unit3;}
						result3 = unit5*6;
			
				}
			}
			
			if (unit6 >300){
				unit6 =unit-300;
				if(unit6 >=1){
					if(unit6>100){unit6= unit- unit3;}
					
					result4 = unit6*8;
			
				}
			}

			if ( unit7 >=400 ){
				unit7 =unit-400;	
				if(unit7 >=1){	
					result5 = unit7*10;
				}
			}
			
			totalResult = result1+result2+result3+result4+result5;
			
			String bill = unit +" \n Total charges "+ totalResult;
	
		return bill;
	}


}