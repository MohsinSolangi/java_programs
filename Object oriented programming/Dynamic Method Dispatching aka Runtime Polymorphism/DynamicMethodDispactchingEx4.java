class Car{
	void carName(){
		System.out.println("Car Name ");
	}
	
	void companyName(){
		System.out.println("Company name ");
	}
	
	void engine(){
		System.out.println("Engine cc : 1800cc");
	}
	
	void engineType(){
		System.out.println("Engine type : Petrol");
	}
	
	void transmission(){
		System.out.println("Transmission : Manual");
	}
	
	void breaks(){
		System.out.println("Breaks : front disk");
	}
	
	void gear(){
		System.out.println("Gear : 5");
	}
	
	void seats(){
		System.out.println("Seats : 5");
	}
	
	void safety(){
		System.out.println("air bags : 2");
	}
	
	void PowerSteering(){
		System.out.println("PowerSteering ");
	}

}

class Mehran extends Car{
	
	void carName(){
		System.out.println("Car : Mehran");
	}
	
	void companyName(){
		System.out.println("Company name : Suzuki");
	}
	
	void gear(){
		System.out.println("Gear : 4");
	}
	
	void engine(){
		System.out.println("Engine : 800cc");
	}
	
	void PowerSteering(){
		System.out.println("PowerSteering : NO");
	}
	
}

class Cultus extends Car{
	
	void carName(){
		System.out.println("Car : Cultus");
	}
	
	void companyName(){
		System.out.println("Company name : Suzuki");
	}
	
	void engine(){
		System.out.println("Engine : 1500cc");
	}
	
	void PowerSteering(){
		System.out.println("PowerSteering : Yes");
	}
		
}

class Alto extends Car{
	
	void carName(){
		System.out.println("Car : Alto");
	}
	
	void companyName(){
		System.out.println("Company name : Suzuki");
	}
	
	void transmission(){
	System.out.println("Transmission : Auto");
	}
	
	void engine(){
		System.out.println("Engine : 1200cc");
	}
	
	void PowerSteering(){
		System.out.println("PowerSteering : Yes");
	}
		
}

class City extends Car{
	
	void carName(){
		System.out.println("Car : City");
	}
	
	void companyName(){
		System.out.println("Company name : Honda");
	}
	
	void transmission(){
	System.out.println("Transmission : Auto");
	}
	
	void engine(){
		System.out.println("Engine : 1800cc");
	}
	
	void safety(){
		System.out.println("4 air bags");
	}
	
	void PowerSteering(){
		System.out.println("PowerSteering : Yes");
	}
}
