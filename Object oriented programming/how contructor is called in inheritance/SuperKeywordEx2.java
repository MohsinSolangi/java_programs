class Animal {
	
	Animal(){
	System.out.println("no arg constructor of class Animal");
	}
	
	Animal(String cat){
	System.out.println("one arg const of class Animal ");
	}
	
	Animal(String cat,String cat2){
		System.out.println("two arg const of class Animal");
	}
}

class Cat extends Animal{
	
	Cat(){
		System.out.println("no arg const of class Cat");
	}
	Cat(String cat){
		super(cat);
	System.out.println("one arg const of class Cat");
	}
	
	Cat(String cat , String cat2 ){
		super(cat,cat2);
	System.out.println("two arg const of class Cat");	
	}
}

class Dog extends Animal{
	Dog(){
		
	System.out.println("no arg const of class Dog");
	}
	Dog(String cat){
		super(cat);
	System.out.println("one arg const of class Dog");
	
	}
	
	Dog(String cat , String cat2 ){
		super(cat,cat2);
	System.out.println("two arg const of class Dog");	
	}
}
class SuperKeywordEx2{
	public static void main (String args[]){
		
	Cat cat1 = new Cat();
	Cat cat2 = new Cat("my cat");
	Cat cat3 = new Cat("my cat", "your cat");
	
	Dog dog1 = new Dog();
	Dog dog2 = new Dog("my dog");
	Dog dog3 = new Dog("my dog ","your dog ");
	
	}
}