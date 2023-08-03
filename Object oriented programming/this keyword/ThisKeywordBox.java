class Box {
	int feet;
	int inch;
	
	Box (int feet,int inch){
		this.feet=feet;
		this.inch=inch;
		
	}

	void show(){
	System.out.println("feet " + feet);
	System.out.println("inch " + inch);
	
	}

}

class ThisKeywordBox{
	
	public static void main(String args []){
	
		Box obj1 = new Box (10,5);
		Box obj2 = new Box (100,50);
		
		obj1.show();
		obj2.show();
		
		
	}
}