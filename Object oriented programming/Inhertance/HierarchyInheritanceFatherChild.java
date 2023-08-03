class Father {
	
	void car(){
	System.out.println("Car");
	}
	
	void home(){
	System.out.println("home");
	}
	
	void money(){
		System.out.println("money");
	}
}

class Child1 extends Father{
	
	void bike(){
	System.out.println("Child1 in the bike ");
	}
}

class Child2 extends Father{
	void bike(){
	System.out.println("Child2 in the bike ");
	}
}
class HierarchyInheritanceFatherChild{
	public static void main (String args[]){
	
	Child1 c1 = new Child1();
	Child2 c2 = new Child2();
	
	c1.bike();
	c1.home();
	c1.car();
	c1.money();
	
	c2.bike();
	c2.home();
	c2.car();
	c2.money();
	}
}	