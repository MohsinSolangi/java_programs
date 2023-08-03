import java.util.*;

class Ternery{
	public static void main (String args[]){
	
	MethodClass methodClass  = new MethodClass();
	
	
	methodClass.percentage(55,67,98,99,67);
	methodClass.season(8);
	methodClass.positiveOrNegative(-7);
	methodClass.age2(11,33);
	methodClass.age3(32,42,55);
	
	
	}
}

class MethodClass{
	void percentage(int php, int python, int java, int c, int cpp){
		int marksObtain = php+python+java+c+cpp;

	int percentage = (marksObtain*100)/500;	
	int per = 0;  
	
	 per =percentage;
		
	String txt = (per>100)? ("overflow ") : ((per<=100 && per>90)? ("grade A1"):( (per<=90 && per>80 )? ("grade A ") : ( ( per<=80 && per> 70)? ("grade B"): ((per<=70 && per>60) ? ("grade C") :( (per<=60 && per>50) ? ("grade D") :( ( per<=50 && per>40 ) ? ("grade E") : ("fail"))) )) )) ;
	
	System.out.println( "total marks " +500 + " marks Obtain " +marksObtain + " percentage " + percentage + "% "+	txt);
	
	}

	void season(int input){
	 	
		switch (input){	
		case 1:		
		case 2:
		case 12:
		System.out.println("Winter season");
		break;
		case 3:
		case 4:
		case 5:
		System.out.println("Spring season" );
		break;
		case 6:
		case 7:
		case 8:
		System.out.println("Summer season " );
		break;
		case 9:
		case 10:
		case 11:
		System.out.println("Autumn Season " );
		break;
		
		default:
		System.out.println("invalid command ");
	 
	}
	
	}
	
	void positiveOrNegative(int number){
	
	String txt = number>1? " number is positive " : " number is negative" ;
	
	System.out.println(txt);
	
	}
	
	void age2(int age1, int age2 ){
		String s = age1>age2?"age1 is largest " +age1:"age2 is largest " +age2;
	System.out.println(s);
	
	}
	
	void age3(int age1 , int age2, int age3 ){
		
		String txt = (age1>age2 && age1>age3) ? ("age1 is largest " + age1) : ((age2>age1 && age2>age3)? ("age2 is largest "+age2): ("age3 is largest "+age3)) ;
	
	System.out.println(txt);
	}

}