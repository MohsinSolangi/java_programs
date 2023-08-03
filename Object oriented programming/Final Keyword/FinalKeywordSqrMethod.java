final class Calc{
	double sqr(int num){
	return num*num;
	}

}

class FinalKeywordSqrMethod{
	public static void main(String args []){
		Calc calc = new Calc();
		
		System.out.println("squre " +calc.sqr(7));
		
		
	  
	}
}