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

	class Display{
	static void add(Box	ob){
		
		System.out.println(ob.feet+ ob.inch);
	}
	
	static void mul(Box ob){
		
		System.out.println(ob.feet*ob.inch);
		
	}
}


class ThisKeywordDisplay{
	
	public static void main(String args []){
		
		Box obj1 = new Box(60,39);
		Box obj2 = new Box(23,12);
		
		obj1.show();
		obj2.show();
		
		
		Display.add(obj1);
		Display.mul(obj1);
		
		Display.add(obj2);
		Display.mul(obj2);
		
		
		
	}
} 