class PhysicsAndTech{
	
	public void computerTech(){
		System.out.println("3 years ComputerTech");
	}
	public void electorics(){
		System.out.println("3 years electroinics"); 
	}
	public void telecom(){
		System.out.println("3 years telecom");
	}	
}
class IIT extends PhysicsAndTech{
	
	public void it(){
		System.out.println("4 years IT");
	}
	public void electorics(){
		System.out.println("4 years electroinics"); 
	}
	public void telecom(){
		System.out.println("4 years telecom");
	}	
}
class IICT extends IIT{

	public void iICT(){
		System.out.println("4 years IICT");
	}	
}

 class OverridingPhysicsAndTech{
	public static void main (String args[]){
		IICT d = new IICT();
		d.computerTech();
		d.electorics();
		d.telecom();
		d.it();
		d.iICT();
	
	}
	
}