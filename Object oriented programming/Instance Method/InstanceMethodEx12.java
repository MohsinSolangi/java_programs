class EmployeeSalary{

	int pay;
	
	void set(int a){
		pay = a;
	}
	
	void employeeSalary(){
	
	int houseRent = (pay/100)*45;
	int medAllowance = (pay/100)*15;
	int bonus = (pay/100)*5;
	int grossPay = pay+houseRent+medAllowance+bonus;
	int incomeTax = (grossPay/100)*5;
	int convanceAllowance = (grossPay/100)*8;
	double zakat = (grossPay/100)*2.5;
	double netIncome = grossPay-incomeTax-convanceAllowance-zakat;
				
		System.out.println("House Rent 45% " +houseRent+ "\n Medical Allowance 15% " +medAllowance +"\n Bonus 5%"+ bonus +"\n Gross Pay " +grossPay +"\n Income Tax 5% " + incomeTax +" \n Convanace Allowance 8% " +convanceAllowance+ "\n Zakat 2%"+zakat+ " \n Net income "+ netIncome);
		
	}
}

class InstanceMethodEx12{
	public static void main (String args[]){
	EmployeeSalary employeeSal = new EmployeeSalary();
	
	employeeSal.set(50000);
		
	employeeSal.employeeSalary();
	}
}