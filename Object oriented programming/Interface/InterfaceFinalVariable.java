interface kb{
	public static final int A = 10;
	public static final int	B = 20;
	public static final int C = 30;
	public static final int D = 40;
	public static final int space = 50;
	public static final int esc = 60;
	public static final int a = 70;
	public static final int b = 80;
	public static final int c = 90;
	public static final int d = 100;

}

class InterfaceFinalVariable implements kb{
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