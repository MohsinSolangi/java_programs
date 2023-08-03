 interface Vehicle{
	
	void engine();
	void tyre();
	void seats();
	void engineType();
	
}

class Car implements Vehicle{

	public void engine(){
		System.out.println("600 cc engine");
	}
	
	public void tyre(){
		System.out.println("4 tyre");
	}
	
	public void seats(){
		System.out.println("4 seats");
	}
	public void engineType(){
	System.out.println("petrol engine");
	}
}

class Bike implements Vehicle{

	public void engine(){
		System.out.println("70 cc engine");
	}
	
	public void tyre(){
		System.out.println("2 tyre");
	}
	
	public void seats(){
		System.out.println("2 seats");
	}
	public void engineType(){
	System.out.println("petrol engine");
	}
}

class Truck implements Vehicle{

	public void engine(){
		System.out.println("6000 cc engine");
	}
	
	public void tyre(){
		System.out.println("10 tyre");
	}
	
	public void seats(){
		System.out.println("3 seats");
	}
	public void engineType(){
	System.out.println("deisel engine");
	}
}

class Tractor implements Vehicle{

	public void engine(){
		System.out.println("4000 cc engine");
	}
	
	public void tyre(){
		System.out.println("4 tyre");
	}
	
	public void seats(){
		System.out.println("1 seats");
	}
	public void engineType(){
	System.out.println("petrol engine");
	}
}

class Van implements Vehicle{

	public void engine(){
		System.out.println("1500 cc engine");
	}
	
	public void tyre(){
		System.out.println("4 tyre");
	}
	
	public void seats(){
		System.out.println("6 seats");
	}
	public void engineType(){
	System.out.println("petrol engine");
	}
}

class Jeep implements Vehicle{

	public void engine(){
		System.out.println("1800 cc engine");
	}
	
	public void tyre(){
		System.out.println("4 tyre");
	}
	
	public void seats(){
		System.out.println("4 seats");
	}
	public void engineType(){
	System.out.println("petrol engine");
	}
}

class Bus implements Vehicle{

	public void engine(){
		System.out.println("5500 cc engine");
	}
	
	public void tyre(){
		System.out.println("8 tyre");
	}
	
	public void seats(){
		System.out.println("52 seats");
	}
	public void engineType(){
	System.out.println("deisel engine");
	}
}


class Display{
	static void show(Vehicle v){
	v.engine();
	v.tyre();
	v.seats();
	v.engineType();
		
	}
}

class InterfaceVehicle{
	
	public static void main (String args[]){
		
	Car c = new Car();
	Bike b = new Bike();
	Bus bus = new Bus();
	Tractor tractor = new Tractor();
	Van v = new Van();
	Truck t = new Truck();
	Jeep j = new Jeep();

	Display.show(c);
	Display.show(b);
	Display.show(bus);
	Display.show(tractor);
	Display.show(v);
	Display.show(t);
	Display.show(j);

	}
}