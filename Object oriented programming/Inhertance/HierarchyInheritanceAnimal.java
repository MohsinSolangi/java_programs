class Animal {
	
	void walk(){
	System.out.println("walk");
	}
	
	void fourlegs(){
	System.out.println("fourlegs");
	}
	
	void tail(){
		System.out.println("tail");
	}
}

class Cat extends Animal{
	
	void meow(){
	System.out.println("Cat \nmeow");
	}
}

class Dog extends Animal{
	void bark(){
	System.out.println("dog \nbhow bhow");
	}
}
class HierarchyInheritanceAnimal{
	public static void main (String args[]){
	
	Cat cat = new Cat();
	Dog dog = new Dog();
	
	cat.meow();
	cat.fourlegs();
	cat.tail();
	cat.walk();
	
	dog.bark();
	dog.fourlegs();
	dog.tail();
	dog.walk();
	
	}
}