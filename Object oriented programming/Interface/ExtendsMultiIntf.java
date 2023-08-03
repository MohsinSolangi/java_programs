interface X{
	void x();
}

interface Y{
	void y();
}

interface Z{
	void z();
}
interface XYZIntf extends X,Y,Z{
	void xyz();
}

class InterfaceClass implements XYZIntf{
	
	public void x(){
		System.out.println("method x()");
		}
	public void y(){
		System.out.println("method y()");
		}
	public void z(){
		System.out.println("method z()");
		}
	public void xyz(){
		System.out.println("method xyz()");
		}
	
}

class ExtendsMultiIntf {
	public static void main(String args[]){
	
		InterfaceClass intfClass = new InterfaceClass();
		
		intfClass.x();
		intfClass.y();
		intfClass.z();
		intfClass.xyz();
		
	}
}