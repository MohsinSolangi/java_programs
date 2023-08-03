interface Animal {
	
	void name();
	void legs();
	void eyes();
	void sound();

}


class Cat implements Animal{
	
	public void name(){
		System.out.println("Cat");
	}

	public void legs(){
		System.out.println("4 legs");
	}

	public void eyes(){
		System.out.println("2 eyes");
	}
	
	public void sound(){
		
		System.out.println("Meoow Meoow");
	}
	
}

class Dog implements Animal{
	
	public void name(){
		System.out.println("Dog");
	}

	public void legs(){
		System.out.println("4 legs");
	}

	public void eyes(){
		System.out.println("2 eyes");
	}
	
	public void sound(){
		
		System.out.println("Bhow Bhow");
	}
	
}

class Goat implements Animal{
	
	public void name(){
		System.out.println("Goat");
	}

	public void legs(){
		System.out.println("4 legs");
	}

	public void eyes(){
		System.out.println("2 eyes");
	}
	
	public void sound(){
		
		System.out.println("maaa maaa ");
	}
	
}
class Human implements Animal{
	
	public void name(){
		System.out.println("Human");
	}

	public void legs(){
		System.out.println("2 legs");
	}

	public void eyes(){
		System.out.println("2 eyes");
	}
	
	public void sound(){
		
		System.out.println("Natural Language");
	}
	
}

class Display{
	static void show(Animal a){
	a.name();
	a.legs();
	a.eyes();
	a.sound();

	}
}

class InterfaceAnimal{
	
	public static  void main (String agrs[]){
		
		Cat c = new Cat();
		Dog d = new Dog();
		Goat g = new Goat();
		Human h = new Human();
		
		
		Display.show(c);
		Display.show(d);
		Display.show(g);
		Display.show(h);
		
		
	}
	
}