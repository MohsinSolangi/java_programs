abstract interface kb{
	 int A = 10;
	 int B = 20;
	 int C = 30;
	 int D = 40;
	 int space = 50;
	 int esc = 60;
	 int a = 70;
	 int b = 80;
	 int c = 90;
	 int d = 100;

}

class Test implements kb{
	public static void main (String args[]){
	
	System.out.println(kb.A); 
	System.out.println(kb.B); 
	System.out.println(kb.C); 
	System.out.println(kb.D); 
	System.out.println(kb.space); 
	System.out.println(kb.esc); 
	System.out.println(kb.a); 
	System.out.println(kb.b); 
	System.out.println(kb.c); 
	System.out.println(kb.d); 
	}
}