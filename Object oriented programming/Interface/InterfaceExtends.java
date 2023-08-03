interface A{
	void methodA();
}

interface B extends A{
	void methodB();
}

interface C extends B{
	void methodC();
}

class ABC implements C {
	
	public void methodA(){
		System.out.println("method A");
	}

	public void methodB(){
		System.out.println("method B");
	}

	public void methodC(){
		System.out.println("method C");
	}	
}

class InterfaceExtends{
	public static void main	(String args[]){
	ABC abc = new  ABC();
	
	abc.methodA();
	abc.methodB();
	abc.methodC();
	
	
	}
}