import java.util.*;

class OverLoadingEx3{
	
	public static void main (String args []){
	
	Age3 age3 = new Age3();
	
	age3.age3();
	age3.age3(55);
	age3.age3(44,77);
	age3.age3(33,22,11)	;
	}

}


class Age3{

	void age3(){
	
	int age1 = 11;
	int age2 = 22;
	int age3 = 33;

		String txt = (age1>age2 && age1>age3) ? ("age1 is largest " + age1) : ((age2>age1 && age2>age3)? ("age2 is largest "+age2): ("age3 is largest "+age3)) ;
	
	System.out.println(txt);
	
	}

	void age3(int age1){
	
	int age2 = 22;
	int age3 = 33;
	
	String txt = (age1>age2 && age1>age3) ? ("age1 is largest " + age1) : ((age2>age1 && age2>age3)? ("age2 is largest "+age2): ("age3 is largest "+age3)) ;
	
	System.out.println(txt);
	
	}
	
	void age3(int age1, int age2 ){
	
	int age3 = 33;
	
	String txt = (age1>age2 && age1>age3) ? ("age1 is largest " + age1) : ((age2>age1 && age2>age3)? ("age2 is largest "+age2): ("age3 is largest "+age3)) ;
	
	System.out.println(txt);
	
	}

	void age3(int age1 ,int age2, int age3 ){
	
	String txt = (age1>age2 && age1>age3) ? ("age1 is largest " + age1) : ((age2>age1 && age2>age3)? ("age2 is largest "+age2): ("age3 is largest "+age3)) ;
	
	System.out.println(txt);
	
	}
	
} 