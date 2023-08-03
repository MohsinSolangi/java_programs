import java.util.*;

class Marksheet{

	int java,database,php,hr,cpp;
	
	int obtainMarks;
	int per;
	
	
	void set(int a, int b , int c ,int d, int e){
	java = a;
	database = b;
	php = c;
	hr=d;
	cpp=e;
	
	}

	void obtain(){
	obtainMarks = java+database+php+hr+cpp;
	System.out.println("obtain marks"+obtainMarks);
	}
	
	void percentage(){
	per = (obtainMarks*100)/500;
	System.out.println("percentage is "+per+"%");
	
	}
	
	void grade(){		
		if(per>=100){
		System.out.println("overflow ");
		}
		else if(per>=90){
		System.out.println("grade A1");
		}
		else if(per>=80){
		System.out.println("grade A");
		}
		else if(per>=70){
		System.out.println("grade B");
		}
		else if(per>=60){
		System.out.println("grade C");
		}
		else if(per>=50){
		System.out.println("grade D");
		}
		else{
			System.out.println("fail");
		}
	}
	

}

class InstanceMethodEx7{

	public static void main (String args[]){
	
	Marksheet std1 = new Marksheet();
	Marksheet std2 = new Marksheet();
	Marksheet std3 = new Marksheet();
	
	std1.set(80,78,67,89,88);
	std2.set(90,75,84,88,79);
	std3.set(83,89,77,68,80);
	
	std1.obtain();
	std1.percentage();
	std1.grade();
	
	std2.obtain();
	std2.percentage();
	std2.grade();
	
	std3.obtain();
	std3.percentage();
	std3.grade();
	
	
	}
}