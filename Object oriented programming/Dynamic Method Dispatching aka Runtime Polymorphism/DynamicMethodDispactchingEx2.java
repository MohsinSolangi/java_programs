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
	//override
	System.out.println("Meeoow Meeoow");
	
	}
}

class Dog extends Animal{
	void sound(){
	//override
	System.out.println("wao wao ");
	}
}

class Lion extends Animal {
	void sound(){
	//override
	System.out.println("Roar");
	}
}

class Goat extends Animal{
	void sound(){
	//override
	System.out.println("maaa maaa");
	}
 }

class Donkey extends Animal{
	void sound(){
	//override
	System.out.println("Dhoo chee Dho chee");
	}
}

class Monkey extends Animal{
	void sound(){
	//override
	System.out.println("woo chaa woo chaa");
	
	}
	void legs(){
	//override
	System.out.println("2 legs");
	}
}

class Elephant extends Animal {
	void sound(){
	//override
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
	//override
	System.out.println("Natural language");
	
	}
	
	void legs(){
	// override
	System.out.println("2 legs");
	
	}
}

class DynamicMethodDispactchingEx2{
	
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
	
	Animal a = c;
	
	a.sound();
	a.eyes();
	a.legs();
	
	a=d;
	
	a.sound();
	a.eyes();
	a.legs();
	
	a=l;
	
	a.sound();
	a.eyes();
	a.legs();
	
	a=g;
	
	a.sound();
	a.eyes();
	a.legs();
	
	a=don;
	
	a.sound();
	a.eyes();
	a.legs();
	
	a=m;
	
	a.sound();
	a.eyes();
	a.legs();
	
	a=e;
	
	a.sound();
	a.eyes();
	a.legs();
	
	a=ant;
	
	a.sound();
	a.eyes();
	a.legs();
	
	a=h;
	
	a.sound();
	a.eyes();
	a.legs();
	
	
	}

}
