abstract class Animal {
	
	abstract void sound();

	void legs(){
	
		System.out.println("4 legs ");
		
	}

	void eyes(){
		System.out.println("2 Eyes");
	
	}
}

class Cat extends Animal{


	void sound(){
		System.out.println(" Meeoow Meeoow ");
	}
}

class Dog extends Animal{
	
	void sound(){
		System.out.println("bhow bhow");
	}
	
}

class Human extends Animal{
	void sound(){
		System.out.println("Natural language");
	}
	
	void legs(){
	System.out.println("2 legs");
	}
}

class Display{
	static void show(Animal a){
		a.legs();
		a.eyes();	
		a.sound();
		
	}
}

class AbstractDemo{
	
	public static void main(String args[]){
		
		Cat c = new Cat();
		Dog d = new Dog();
		Human h = new Human();
		
		Display.show(c);
		Display.show(d);
		Display.show(h);
		
	}
	
}