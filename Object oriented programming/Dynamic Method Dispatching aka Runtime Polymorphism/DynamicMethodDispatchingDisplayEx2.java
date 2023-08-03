class Animal{
	void sound(){
	System.out.println("Sound");
	}
	void legs(){
	System.out.println("4 legs");
	}
	void eyes(){
	System.out.println("2 eyes");
	}
	
}

class Cat extends Animal{
	
	void sound(){
	
	System.out.println("Meeoow Meeoow");
	
	}
}

class Dog extends Animal{
	void sound(){
	
	System.out.println("wao wao ");
	}
}

class Lion extends Animal {
	void sound(){
	
	System.out.println("Roar");
	}
}

class Goat extends Animal{
	void sound(){
		
	System.out.println("maaa maaa");
	}
 }

class Donkey extends Animal{
	void sound(){
	
	System.out.println("Dhoo chee Dho chee");
	}
}

class Monkey extends Animal{
	void sound(){
	
	System.out.println("woo chaa woo chaa");
	
	}
	void legs(){
	
	System.out.println("2 legs");
	}
}

class Elephant extends Animal {
	void sound(){
	
	System.out.println("phooo phooo");	
	
	}
}

class Ant extends Animal{
	
	void legs(){
	System.out.println("6 legs");
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
		a.sound();
		a.legs();
		a.eyes();
		
		
	}
}

class DynamicMethodDispatchingDisplayEx2{
	
	public static void main (String args []){
		 
	Cat c = new Cat();
	Dog d = new Dog();
	Lion l = new Lion();
	Goat g = new Goat();
	Donkey don = new Donkey();
	Monkey m = new Monkey();
	Elephant e = new Elephant();
	Ant ant = new Ant();
	Human h = new Human();
	
	
	Display.show(c);
	Display.show(d);
	Display.show(l);
	Display.show(g);
	Display.show(don);
	Display.show(m);
	Display.show(e);
	Display.show(ant);
	Display.show(h);
	
	
	
	
	}

}
