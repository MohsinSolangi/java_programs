import java.util.*;

class TestReturn3{

	public static void main (String args[]){

		RtnMethods3 methods = new RtnMethods3();
		
		
		int pico =  methods.picoTonano(5000);
		int nano =  methods.nanoTomicro(5000);
		int micro =  methods.microTomili(5000);
		int mili = methods.miliTosec(5000);
		int sec =  methods.secTomin(5000);
		
		
		System.out.println("pico To nano sec " +pico);
		System.out.println("nano To micro sec" +nano);
		System.out.println("micro To mili sec "+micro);
		System.out.println("mili To sec " +mili);
		System.out.println("sec To min  " + sec);
	}
}

class RtnMethods3{

	int picoTonano(int pico){
		
			int nano =  pico/1000;
			
			return nano;
	}
	
	int nanoTomicro(int nano){
		
			int micro =  nano/1000;
			return micro;
			
	}
	
	int microTomili(int micro){
		
		int mili =  micro/1000;
		
		return mili;
		
	}
	
	int miliTosec(int  mili){
		
			int sec =  mili/1000;
			
			return sec;
			
	}
	
	
	int secTomin(int sec){
		
		int min =  sec/60;
		
		return min;
	}
	
	
}