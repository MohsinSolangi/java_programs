interface Car {
	void name();
	void companyName();
	void powerSteering();
	void gear();
	void transmission();
	
}

class Mehran implements Car {
	public void name(){
		System.out.println("Mehran");
	}
	public void companyName(){
		System.out.println("Suzuki");
	}
	public void powerSteering(){
		System.out.println("PowerSteering : no");
	}
	public void gear(){
		System.out.println("4 gears");
	}
	public void transmission(){
		System.out.println("manual");
	}
}

class Cultus implements Car{
	public void name(){
		System.out.println("Cultus");
	}
	public void companyName(){
		System.out.println("Suzuki");
	}
	public void powerSteering(){
		System.out.println("PowerSteering : yes");
	}
	public void gear(){
		System.out.println("5 gears");
	}
	public void transmission(){
		System.out.println("manual");
	}
}

class Alto implements Car{
	public void name(){
		System.out.println("alto");
	}
	public void companyName(){
		System.out.println("Suzuki");
	}
	public void powerSteering(){
		System.out.println("PowerSteering : yes");
	}
	public void gear(){
		System.out.println("4 gears");
	}
	public void transmission(){
		System.out.println("auto");
	}
}

class City implements Car{
	public void name(){
		System.out.println("City");
	}
	public void companyName(){
		System.out.println("Honda");
	}
	public void powerSteering(){
		System.out.println("PowerSteering : yes");
	}
	public void gear(){
		System.out.println("4 gears");
	}
	public void transmission(){
		System.out.println("auto");
	}
}

class A6 implements Car{
	public void name(){
		System.out.println("Audi A6");
	}
	public void companyName(){
		System.out.println("Audi");
	}
	public void powerSteering(){
		System.out.println("PowerSteering : yes");
	}
	public void gear(){
		System.out.println("6 gears");
	}
	public void transmission(){
		System.out.println("auto");
	}
}
	
class Display{
	static void show(Car car){
	car.name();
	car.companyName();
	car.powerSteering();
	car.gear();
	car.transmission();
	}
}

class InterfaceCar{
	
	public static void main (String args[]){
		
	Mehran m = new Mehran();
	Cultus c = new Cultus();
	Alto a = new Alto();
	City city = new City();
	A6 a6 = new A6();
	
	
	Display.show(m);
	Display.show(c);
	Display.show(a);
	Display.show(city);
	Display.show(a6);
	
	}
}