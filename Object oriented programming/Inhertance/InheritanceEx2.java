class Project{
	
	void add(int a, int b ){
	System.out.println(a+b);
	
	}
	
	void salary(int pay){
		
 		int houseRent = (pay/100)*45;
		int medAllowance = (pay/100)*15;
		int bonus = (pay/100)*5;
		int grossPay = pay+houseRent+medAllowance+bonus;
		int incomeTax = (grossPay/100)*5;
		int convanceAllowance = (grossPay/100)*8;
		double zakat = (grossPay/100)*2.5;
		double netIncome = grossPay-incomeTax-convanceAllowance-zakat;
		
		System.out.println("House Rent 45% " +houseRent+ "\n Medical Allowance 15% " +medAllowance +"\n Bonus 5%" +bonus +"\n Gross Pay " +grossPay +"\n Income Tax 5% " + incomeTax +" \n Convanace Allowance 8% " +convanceAllowance+ "\n Zakat 2.5%" +zakat+ " \n Net income "+ netIncome );
		

	}
	void trollyload(int load){
		
 		int totalIncome = 800*load;
		int driver = 150*load;
		int tax =   totalIncome/10;
		int diesel = 210*load;
		int totalExpense = driver+tax+diesel;
		int profit = totalIncome-totalExpense;
		
	System.out.println("Load Entered " +load+ "\n Total Income  "+ totalIncome + " \n Driver " +driver + "\n Tax 10% " +tax+ "\n Diesel " + diesel+	"\n Profit " + profit);

	}
}

class Child extends Project{
	
	void task(int a, int b){
		System.out.println(a-b);
		}
		
	void prime(int num){
	for( int i = 2 ; i<=num; i++){
		int j;
		for(j = 2; j<=i; j++){
			 
		    if(i%j == 0){
		       break;
		    }
		}
		if(i==j)
			System.out.println(i);
			}
		}
		
	void factorial(int num){
		int fact = 1;
		for(int i =1;i<=0; i++){
		
		fact = fact*i;
		System.out.println(fact);
		}
	}
	
	void even(int num){
		for (int i=2;i<=num;i+=2){
			System.out.println(i);
		}
	}

}

class InheritanceEx2{
	public static void main(String args[]){
		Child ob = new Child();
		
		ob.task(10,5);
		ob.add(5,10);
		ob.salary(1000);
		ob.trollyload(1);
		ob.prime(10);
		ob.factorial(10);
		ob.even(10);
		
		
	}
}
