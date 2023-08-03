class Animal{
	void sound(){
	System.out.println("Sound");
	}
	void legs(){
	System.out.println("4 legs");
	}
	void eyes(){
	System.out.println("2 Eyes");
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

class TestGeneralization{
	
	public static void main (String args []){
		
	Cat c = new Cat();
	Dog d = new Dog();
	Human h = new Human();
	
	Animal a = c;
	
	a.sound();
	a.eyes();
	a.legs();
	
	a=d;
	
	a.sound();
	a.eyes();
	a.legs();
	
	
	a=h;
	
	a.sound();
	a.eyes();
	a.legs();
	
	
	}

}
