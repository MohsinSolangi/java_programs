interface Test{
	void a();
}
interface Hellow{
	void a();
}
class ABC implements Test,Hellow{
	public void a(){
		System.out.println("a() is the implementation of Both Test & Hellow ");
	}
}

class InterfaceOverriding{
	public static void main(String args[]){
	ABC abc = new ABC();
	
	abc.a();
	}
}