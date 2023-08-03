
class Hesco{
	int unit;
	
	void set(int a){
		unit = a;
	}
	
	void hescobill(){
		
		int result1 = 0;
				int result2 =0;
				int result3 = 0;
				int result4 = 0;
				int result5 = 0;
				int unit2 = unit;
				int unit4 = unit;
				int unit3 = unit -100;
				int unit5 = unit;
				int unit6 = unit;
				int unit7 = unit;
				int totalResult;
				
			if(unit2 > 1){
					if(unit2>100){unit2= unit2-unit3;}
				
				result1 = unit2*2;
				
			}
			
			if (unit4 >100 ){
				unit4 =unit-100;
				if(unit4>=1){  
					if(unit4>100){ unit4 = unit - unit3;}
				
				 result2 = unit4*4;
				
				}
			}
			
			
			if (unit5 >200 ){
				unit5 =unit-200;
					if(unit5 >=1){
					if(unit5>100){unit5= unit- unit3;}
						result3 = unit5*6;
			
				}
			}
			
			if (unit6 >300){
				unit6 =unit-300;
				if(unit6 >=1){
					if(unit6>100){unit6= unit- unit3;}
					
					result4 = unit6*8;
			
				}
			}

			if ( unit7 >=400 ){
				unit7 =unit-400;	
				if(unit7 >=1){	
					result5 = unit7*10;
				}
			}
			
			totalResult = result1+result2+result3+result4+result5;
			
			System.out.println(unit +" \n Total charges "+ totalResult);
	
		
	}
	
}

class InstanceMethodEx9{
	public static void main(String args[]){
	
		Hesco  hesco = new Hesco();
		
		hesco.set(250);

		hesco.hescobill();
		
}
}