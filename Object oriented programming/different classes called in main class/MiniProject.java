import java.util.*;


// main class start
class MiniProject{
	//main method
	public static void main (String arg[] ){

		Scanner sc = new Scanner(System.in);
		
		Calculator cal = new Calculator();
		AtmClass atm = new AtmClass();
		TrolyLoad troly = new TrolyLoad();
		Employee employeeSal = new Employee();
		Hesco hesco = new Hesco();
		LoopSeries loop = new LoopSeries();
		WhileSeries whileSeries = new WhileSeries();
		DoWhileSeries dowhileSeries = new DoWhileSeries();
		UnitConverter unitconvert = new UnitConverter();
		
		
		String input;

		do{
		System.out.print("1.Calculator  \n 2.Atm \n 3.Troly Load \n 4.Employee Salary  \n 5.Hesco bill \n 6.for loop series  \n 7.while loop series \n 8.Do while loop series  \n  9.Unit converter \n  10.Exit   \n Enter your Selection "   );
		input = sc.next();
		
		
		if(input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4") || input.equals("5") || input.equals("6") || input.equals("7") || input.equals("8") || input.equals("9") ||input.equals("10") ){
		
		// 1 switch open
		switch(input){
		
		case "1":
		
		String inputcalculator;
		
		do{
		System.out.print(" 1. Manual Calculator \n 2.Operator calculator \n 3.Back  \n Enter your Selection ");
		inputcalculator = sc.next();
		if(inputcalculator.equals("1") || inputcalculator.equals("2") ||inputcalculator.equals("3") ){
		
		// 2 switch open
		switch(inputcalculator){
			
			case "1":
			cal.manualCalculator();
 			break;
			
			case "2":
			cal.operatorCalculator();
			break;
			
			}//2 switch close
			
		}else{System.out.println("invaild command ");}
		
		}while(!inputcalculator.equals("3"));
			
			break;
			
			
		case "2":
			
		atm.atm();
		break;
		
		case "3":
		troly.trolyLoad();
		break;
  		
		case "4":
		employeeSal.employeeSalary();
		break;
		
		case "5":
		hesco.hescoBill();
		
		break;
		
		case "6":
		
		String  inputloop;
		do{
			
		System.out.print(" For loop series \n 1.Fibinocii Series \n  2.Unkown Series \n 3.Even odd Series \n 4.Prime series \n 5.Star series \n 6.Back  \n Enter Selection ");inputloop = sc.next();
		
		if(inputloop.equals("1") || inputloop.equals("2") || inputloop.equals("3") || inputloop.equals("4") || inputloop.equals("5") || inputloop.equals("6") ){
		
			switch(inputloop){
				
				case "1":
				loop.fibinociiSeries();
				
				break;
				
				case "2":
				loop.unkownSeries();
				break;
				
				case "3":
				loop.evenOddSeries();
				
				break;
				
				case "4":
				
				loop.primeSeries();
				break;
				
	
	case "5":
				
				loop.starSeries();
				
				break;
				
				
 			}
		
		}else{System.out.println("invaild command ");}
		
		}while(!inputloop.equals("6"));
		
		break;
			
	
		case "7":
		
		String  whileInput;
		
		do{
			
		System.out.print("  while series \n 1.Fibinocii Series \n  2.Unkown Series \n 3.Even odd Series \n 4.factorial series \n 5.Cube \n 6.Back  \n Enter Selection ");whileInput = sc.next();
		
		if(whileInput.equals("1") || whileInput.equals("2") || whileInput.equals("3") || whileInput.equals("4") || whileInput.equals("5") || whileInput.equals("6") ){
		
			switch(whileInput){
				
				case "1":
				whileSeries.fibinociiSeries();
				
				break;
				
				case "2":
				whileSeries.unkownSeries();
				break;
				
				case "3":
				whileSeries.evenOddSeries();
				
				break;
				
				case "4":
				
				whileSeries.factorial();
				break;
				
				case "5":
				
				whileSeries.cube();
				
				break;
				
				
			}
		
		}else{System.out.println("invaild command ");}
		
		}while(!whileInput.equals("6"));
		
		break;

	
	
	case "8":
		
		String  dowhileInput;
		
		do{
			
		System.out.print(" Do while series \n 1.Fibinocii Series \n  2.factorial \n 3.Even odd Series \n 4.table series \n 5.Cube \n 6.Back  \n Enter Selection ");
		dowhileInput = sc.next();
		
		if(dowhileInput.equals("1") || dowhileInput.equals("2") || dowhileInput.equals("3") || dowhileInput.equals("4") || dowhileInput.equals("5") || dowhileInput.equals("6") ){
		
			switch(dowhileInput){
				
				case "1":
				dowhileSeries.fibinociiSeries();
				
				break;
				
				case "2":
				dowhileSeries.factorial();
				break;
				
				case "3":
				dowhileSeries.evenOddSeries();
				
				break;
				
				case "4":
				
				dowhileSeries.table();
				break;
				
				case "5":
				
				dowhileSeries.cube();
				
				break;
				
				
			}
		
		}else{System.out.println("invaild command ");}
		
		}while(!dowhileInput.equals("6"));
		
		break;

		
		case "9":
		
		String  unitCon;
		
		do{
			
		System.out.print(" Unit Converter  \n 1.Kilometer To Mile \n  2.Kilometer To Yard  \n 3.Day to Hour \n 4.Day To Week  \n 5.Pico sec To nano Sec \n 6.Back  \n Enter Selection");
		unitCon = sc.next();
		
		if(unitCon.equals("1") || unitCon.equals("2") || unitCon.equals("3") ||unitCon.equals("4") || unitCon.equals("5") || unitCon.equals("6") ){
		
			switch(unitCon){
				
				case "1":
				unitconvert.kiloToMile();
				
				break;
				
				
				
				
				case "2":
				unitconvert.kiloToYard();
				break;
				
				case "3":
				unitconvert.dayToHour();
				
				break;
				
				case "4":
				
				unitconvert.dayToWeek();
				break;
				
				case "5":
				
				unitconvert.picoTonano();
				
				
				break;
				
				
			}
		
		}else{System.out.println("invaild command ");}
		
		}while(!unitCon.equals("6"));
		
		break;
	

	
		}// 1 switch close
		
		}else{System.out.println("Invalid command ");}
		
		}while(!input.equals("10"));
	
		
	}// main method close

	}// main class end 



// calculator class 
class Calculator{
	
	void manualCalculator(){
		
		Scanner sc = new Scanner(System.in);
		
		String operand;
		
		do{
			
		System.out.print(" 1.Addition \n 2.Subtraction \n 3.Multiplication  \n 4.Divide \n 5.Remainder \n 6.Back \n Enter your Selection ");
		operand = sc.next();
		
		if(operand.equals("1") || operand.equals("2") || operand.equals("3") || operand.equals("4") || operand.equals("5") || operand.equals("6") ){
		
		switch(operand){
			
			case "1":
			
			System.out.print("Enter two value ");
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println("addition is " + (a+=b));
			break;
			
			case "2":
			System.out.print("Enter two value ");
			a = sc.nextInt();
			b = sc.nextInt();
						
			System.out.println("subtraction is " + (a-=b));
			
			break;
			
			case "3":
			System.out.print("Enter two value ");
			a = sc.nextInt();
			b = sc.nextInt();
			
			System.out.println("multipli is " + (a*=b));
			
			break;
			
			case "4":
			System.out.print("Enter two value ");
			a = sc.nextInt();
			b = sc.nextInt();
			
			System.out.println("division is " + (a/=b));
			
			break;
			
			case "5":
			System.out.print("Enter two value ");
			a = sc.nextInt();
			b = sc.nextInt();
			
			System.out.println("remainder is " + (a%=b));
			break;
			
					}
			
				}else{System.out.println("invaild command ");}
			
			}while(!operand.equals("6"));
			
		}
	


	void operatorCalculator(){
		
		Scanner sc = new Scanner(System.in);
 		
		
		String symbol;
		
		do{
		
		System.out.print(" +.(Add) \n -.(Sub) \n *.(Multi)  \n /.(Div) \n %.(Remainder) \n b.(Back) \n Enter your Selection ");
		symbol = sc.next();
	
	if(symbol.equals("+") || symbol.equals("-") || symbol.equals("*") || symbol.equals("/") || symbol.equals("%") || symbol.equals("b") ){
	
	switch(symbol){
			
			case "+":
			System.out.print("Enter two value ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println("addition is " + (a+=b));
			break;
			
			case "-":
			System.out.print("Enter two value ");
			a = sc.nextInt();
			b = sc.nextInt();
						
			System.out.println("subtraction is " + (a-=b));
			
			break;
			
			case "*":
			System.out.print("Enter two value ");
			a = sc.nextInt();
 			b = sc.nextInt();
			System.out.println("multipli is " + (a*=b));
			
			break;
			
			case "/":
			System.out.print("Enter two value ");
			a = sc.nextInt();
			b = sc.nextInt();
			
			System.out.println("division is " + (a/=b));
			
			break;
			
			case "%":
			System.out.print("Enter two value ");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("remainder is " + (a%=b));
			break;
	
				}
				
			}else{System.out.println("invaild command ");}
		
		}while(!symbol.equals("b"));

	
	}


} //calculator class end


class AtmClass{
	
	void atm(){
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter your Money ");
			
				int money = sc.nextInt();
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

class TrolyLoad{
	
	void trolyLoad(){
		
		Scanner sc = new Scanner(System.in);
		
				System.out.print("Enter Troly Load ");
				
				int trolyLoad = sc.nextInt();

				int totalIncome = 800*trolyLoad;
				int driver = 150*trolyLoad;
				int tax =   totalIncome/10;
				int diesel = 210*trolyLoad;
				int totalExpense = driver+tax+diesel;
				int profit = totalIncome-totalExpense;
				
				System.out.println("Load Entered " +trolyLoad+ "\n Total Income  "+ totalIncome + " \n Driver " +driver + "\n Tax 10% " +tax+ "\n Diesel " + diesel+ "\n Profit "+ profit );
	}
}

class Employee{
	void employeeSalary(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Basic pay  ");
				
				int pay = sc.nextInt();

				int houseRent = (pay/100)*45;
				int medAllowance = (pay/100)*15;
				int bonus = (pay/100)*5;
				int grossPay = pay+houseRent+medAllowance+bonus;
				int incomeTax = (grossPay/100)*5;
				int convanceAllowance = (grossPay/100)*8;
				int zakat = (grossPay/100)*2;
				int netIncome = grossPay-incomeTax-convanceAllowance-zakat;
				
				System.out.println("House Rent 45% " +houseRent+ "\n Medical Allowance 15% " +medAllowance +"\n Bonus 5%" +bonus +"\n Gross Pay " +grossPay +"\n Income Tax 5% " + incomeTax +" \n Convanace Allowance 8% " +convanceAllowance+ "\n Zakat 2%" +zakat+ " \n Net income "+ netIncome );
	}
}	

class Hesco{

	void hescoBill(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your units   ");	
				int unit = sc.nextInt();
				
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
			
			System.out.println(unit +" \n Total charges "+ totalResult);
		
	}
}


class LoopSeries{
	
	Scanner sc  = new Scanner(System.in);
	int limit ;
	
	void fibinociiSeries(){

	System.out.print("Enter number ");
	 limit = sc.nextInt();
					
	int num1 = 0;
	int num2 = 1;
	int num3 ;
					
	System.out.println( num1+ " \n "+ num2 );
	for (int i =2; i<limit ; ++i){
						
	num3 = num1+num2;
						
	System.out.println(" "+num3);
						
	num1 = num2;
	num2 = num3;		
				}
	}
	
	void unkownSeries(){
			System.out.print("Enter number ");
			int number = sc.nextInt();
			int r = 1;
			for(int i= 1; i<=number;i++){	
						
			System.out.println(r);
			int a =i;
						
			a%=2;
						
			if (a==0){
			r=r+2;
			}else{
			r=r+3;	
			}
						
		}
	}
	
	void evenOddSeries(){
		
		System.out.print("Enter number ");
		limit = sc.nextInt();
						
		System.out.print("Odd \t Even \n");
		for (int i =1; i<limit ; i+=2 ) {
		System.out.println( i + " \t " +(i+1));	
		
						}
	}
	
	void primeSeries(){
		
		boolean p = false;
		boolean equal = false;
		
		System.out.print("Enter limit ");
		limit = sc.nextInt();
		
		for(int  i =2; i<=limit; i++ ){
			int j;
			for( j =2; j<=limit; j++){
				p = i%j == 0;
				if (p){
					break; 
				}
			}
			equal = i==j;
			if(equal)
			System.out.println(i);
		}
	}
	
	void starSeries(){
		
		System.out.print("Enter limit ");
		limit = sc.nextInt();
						
		for(int a = 1; a<=limit; a++){
								
		for(int j = 1; j<=a ;j++){
		System.out.print("*");
		}
		System.out.println("");
		}
		
		
	}


}

class WhileSeries{
	Scanner sc = new Scanner (System.in);
	
	int limit;
	int i;
	
	
	void fibinociiSeries(){
		System.out.print("Enter number ");
		 limit = sc.nextInt();
				
			int num1 = 0;
			int num2 = 1;
			int num3 ;

			System.out.println( num1+ " \n "+ num2 );	

			int i =2;
			while (i<=limit){
				
				num3 = num1+num2;
					
				System.out.println(" "+num3);
					
				num1 = num2;
				num2 = num3;

				i++;	
					}
	
		}
		
		void unkownSeries(){

		System.out.print("Enter number ");
			int number = sc.nextInt();
			int r = 1;
			int diff = 3;				
				
			i = 1;
			while (i<=number){
							
				System.out.println(r);
				r=r+diff;
				diff=diff+2;
				i++;
				}
		
		}
		
		
		void evenOddSeries(){
			
			System.out.print("Enter number ");
				limit = sc.nextInt();
					
			System.out.print("Odd \t Even \n");

			i =1;
			while (i<=limit){
								
			System.out.println( i + " \t " +(i+1));	
						
			i+=2;
		
			}
		}
	
	
		void factorial(){
			System.out.print("Enter number ");
				 int number = sc.nextInt();
				int r = 1;
				i =1;
				
				while (i<=number){
					r =r *i;				
					System.out.println("the factorial of "+i+" is "+ r);	
						
						i++;
					}
			
			
		}


	 	void cube(){

		System.out.print("Enter number ");
		
		limit = sc.nextInt();
		
		System.out.print("No \t Squre \t Cube  \n");

			i =1;
				
				while (i<=limit){
								
				System.out.println( i + " \t " +(i*i) + " \t " + (i*i*i) );	
						
				i++;
			}
			
	}


	}
	
	class DoWhileSeries{
	
	Scanner sc  = new Scanner(System.in);			

		int limit ;
		int i;
		
		void fibinociiSeries(){
						
		System.out.print("Enter number ");
		
		limit = sc.nextInt();
					
		int num1 = 0;
		int num2 = 1;
		int num3 ;

		System.out.println( num1+ " \n "+ num2 );
			
		int i=2;
			do {
							
			num3 = num1+num2;
					
			System.out.println(" "+num3);
					
				num1 = num2;
				num2 = num3;
					
					
				i++;
				}while(i<limit);

		
	
	}
	
	void factorial(){
		
			System.out.print("Enter number ");
					int number = sc.nextInt();
					int r = 1;
					
					 i=2;
					do {
					r =r *i;
					
					System.out.println("the factorial of "+i+" is "+ r);			
					

					i++;
					
				}while(i<=number);
					
	
	}
	
		void evenOddSeries(){
			
			System.out.print("Enter number ");
				limit = sc.nextInt();
					
				 i=1;
				System.out.print("Odd \t Even \n");

				do {
				System.out.println( i + " \t " +(i+1));	
					
					i+=2;
					
				}while(i<=limit);
			
		}
	
		void table(){
			
			System.out.print("Enter table number ");
					int table = sc.nextInt();
					
					System.out.print("Enter table limit ");
					 limit = sc.nextInt();
					
					 i=1;

					do {
						System.out.println( table +" x " + i + " = " + (i*table));	
					
					i++;
					
					}while(i<=limit);
					
			
		}
	
		void cube(){
			
			System.out.print("Enter number ");
				 limit = sc.nextInt();
				
				 i=1;
				System.out.print("No \t Squre \t Cube  \n");
				do {
				System.out.println( i + " \t " +(i*i) + " \t " + (i*i*i) );				
					i++;
					
				}while(i<=limit);
		}
	
	
	}
	
class UnitConverter{
	Scanner sc  = new Scanner(System.in);			
	
	void kiloToMile(){
		
		System.out.print("Enter kilometer  ");
		int kilometer = sc.nextInt();

		int mile  = kilometer/2;
			
		System.out.println(" kilometer is "+kilometer +" mile will be :" + mile);			
	}
	
	void kiloToYard(){
		System.out.print("Enter kilometer  ");
		
		int kilometer = sc.nextInt();

		int yard = kilometer/1094;
			 
		System.out.println(" kilometer is "+kilometer +" yard will be :" + yard);		
	}
	
	void dayToHour(){
	System.out.print("Enter  days ");
		int day = sc.nextInt();

		int hour =  day*24;
			
		System.out.println("days is "+day+" hour will be :" + hour);	
	
	}
	
	void dayToWeek(){
	System.out.print("Enter  days ");
		int day = sc.nextInt();

		int week =  day/7;
				
		System.out.println("days is "+day+" week will be :" + week);
		
	}

	void picoTonano(){
		
	System.out.print("Enter  pico sec ");
	
	int pico = sc.nextInt();

	int nano  =  pico/1000;
			
	System.out.println("pico is "+pico+" nano will be :" + nano);
	
	}

}