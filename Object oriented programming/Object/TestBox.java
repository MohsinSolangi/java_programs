import java.util.*;

class Box{

int feet;
int inch;


}

class TestBox{
	public static void main(String args[]){

	Box obj1 = new Box();
	Box obj2 = new Box();
	Box obj3 = new Box();
	Box obj4 = new Box();
	Box obj5 = new Box();
	
	obj1.feet = 5;
	obj1.inch = 10;
	
	obj2.feet = 10;
	obj2.inch = 15;
	
	obj3.feet = 20;
	obj3.inch = 25;
	
	obj4.feet = 30;
	obj4.inch = 40;
	
	obj5.feet = 50;
	obj5.inch = 40;
	
	
	System.out.println("Addition of feet "+ (obj1.feet+ obj2.feet+ obj3.feet+ obj4.feet+ obj5.feet));
	
	System.out.println("Addition of inch "+ (obj1.inch+ obj2.inch+ obj3.inch+ obj4.inch+ obj5.inch  ));
	
	
	
	}
}