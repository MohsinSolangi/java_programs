  class Vehicle{
	void tyre(){
		System.out.println("4 tyre");
	}
	void engine(){
		System.out.println("600cc engnie");
	}
	void engineType(){
		System.out.println("petrol");
	}

}

class Car extends Vehicle{
	void engine(){
		System.out.println("800cc engine");
		
	}
}

class Bike extends Vehicle {

	void tyre(){
		
		System.out.println("2 tyre");
	}
	void engine(){
		
		System.out.println("70cc engine");
	}
	
	

}

class Bus extends Vehicle{
	
	void tyre(){
		System.out.println("6 tyre");
	}
	
	void engine(){
		System.out.println("5660cc engine");
	}
	void engineType(){
	
	System.out.println("Diesel");
	}
	
}

class Truck extends Vehicle{
	
	void tyre(){
		System.out.println("10 tyre");
	}
	
	void engine(){
		System.out.println("6000cc engine");
	}
	void engineType(){
	
	System.out.println("Diesel");
	}
	
	
}

class Tractor extends Vehicle{
		
	void engine(){
		System.out.println("4000cc engine");
	}
	void engineType(){
	
	System.out.println("Diesel");
	}
	
	
}

class Trailer extends Vehicle{
		
	void tyre(){
		System.out.println("16 tyre");
	}
	
	void engine(){
		System.out.println("6500cc engine");
	}
	void engineType(){
	
	System.out.println("Diesel");
	}
	
	
}

class Van extends Vehicle{
		
	void engine(){
		System.out.println("800cc engine");
	}
}

class Rickshaw extends Vehicle{
		
	void tyre(){
		System.out.println("3 tyre");
	}
	
	void engine(){
		System.out.println("150cc engine");
	}
}

class Display{
	static void show(Vehicle v){
		v.tyre();
		v.engine();
		v.engineType();
	}
	
}


class DynamicMethodDispatchingDisplayEx3{
	public static void main (String args[]){
	
	Car car = new Car();
	Bike bike = new Bike();
	Bus bus = new Bus();
	Tractor tractor = new Tractor();
	Truck truck = new Truck();
	Trailer trailer = new Trailer();
	Van van = new  Van();
	
	Display.show(car);
	Display.show(bike);
	Display.show(bus);
	Display.show(tractor);
	Display.show(truck);
	Display.show(trailer);
	Display.show(van);
	
	}
}

