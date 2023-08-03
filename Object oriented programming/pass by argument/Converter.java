import java.util.*;

class Converter{

	public static void main (String args []){

	Unitconvert  unit = new Unitconvert();
	
	unit.dayToYear(500);
	unit.dayToWeek(15);
	unit.dayToHour(3);
	unit.dayToMinute(5);
	unit.dayToSecond(2);
	
	}
	
}


class Unitconvert{
	
	
	
	
	
	void dayToHour(int day){
	int hour =  day*24;
		System.out.println("days is "+day+" hour will be :" + hour);
		
	}
	
	void dayToMinute(int day){
		
	int minute =  day*1440;
	
		System.out.println("days is "+day+" minute will be :" + minute);
	}
	
	void dayToSecond(int day){
	int second =  day*86400;
	
	System.out.println("days is "+day+" Second will be :" + second);
	
	}

	void dayToWeek(int day){
	
	int week =  day/7;
	
	System.out.println("days is "+day+" week will be :" + week);		
		
	}
	
	
	void dayToYear(int day){
	int year =  day/365;
		System.out.println("days is "+day+" year will be :" + year);
	
	}
	
	
	}
	