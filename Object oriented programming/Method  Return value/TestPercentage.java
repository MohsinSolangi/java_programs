import java.util.*;

class Percentage{
	
	double per;
	
	double percentage(int obtain ,int total){
	
		per = (obtain*100.0)/total;
		
		return per;
	}

	String grade(){
		
		if(per>=100.0){
			return "overflow";	
		}
		else if(per>=90.0){
			return "grade A1";
		}
		else if(per>=80.0){
			return "grade A";
		}
		else if(per>=70.0){
			return "grade B";
		}
		else if(per>=60.0){
			return "grade C";
		}
		else if(per>=50.0){
			return "grade D";
		}
		return "fail";
	}
}

class TestPercentage{

	public static void main (String args[]){
	
	Percentage perobj = new Percentage();
	
		perobj.percentage(250,500);
		String grade = perobj.grade();
		System.out.print(grade);
	}
}