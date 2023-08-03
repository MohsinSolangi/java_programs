import java.util.*;

class Age{

	int age1;
	int age2;
	int age3;
	int age4;
	
	String ageComp2;
	String ageComp3;
	String ageComp4;
	
	Age(int a,int b ){
	age1 =a; 
	age2= b;
	
	 ageComp2 = age1>age2?"age1 is largest " +age1:"age2 is largest " +age2;
	}
	
	Age(int a ,int b, int c ){
	
	age1=a;
	age2 = b;
	age3 = c;
	
	 ageComp3 = (age1>age2 && age1>age3) ? ("age1 is largest " + age1) : ((age2>age1 && age2>age3)? ("age2 is largest "+age2): ("age3 is largest "+age3)) ;
	
	}
	
	Age(int a, int b, int c, int d ){

	age1 = a;
	age2 = b;
	age3 = c;
	age4 = d;
	
	ageComp4 = (age1>age2) ? ((age1>age3) ? ((age1>age4)? ("age 1 is largest " +age1):("age 4 is largest " +age4)) : ((age3>age4)? ("age 3 is largest" +age3):( "age 4 is largest"+age4))) : ((age2>age3)? ((age2>age4) ? ("age 2 is largest" + age2):("age 4 is largest"+age4)) : ((age3>age4) ? ("age 3 is largest" +age3):("age 4 is largest" +age4) ));
	
	}
	


	void show(){
	
	System.out.println(ageComp2);
	System.out.println(ageComp3);
	System.out.println(ageComp4);
	
	}

}


class AgeCompare{

	public static void main(String args[]){
	
	Age obj1 = new Age(22,44);
	Age obj2 = new Age(22,44,77);
	Age obj3 = new Age(22,44,33,66);
	
	obj1.show();
	System.out.println("\n \n");
	obj2.show();
	System.out.println("\n \n");
	  obj3.show();
	
	
	}
	
}