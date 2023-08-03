import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MazeRunner implements KeyListener,ActionListener{


	Frame f = new Frame("Maze Runner");
	Label lab1 = new Label();
	Label lab2 = new Label();
	Label lab3 = new Label();
	Label lab4 = new Label();
	Label lab5 = new Label();
	Label lab6 = new Label();
	Label lab7 = new Label();
	Label lab8 = new Label();
	Label lab9 = new Label();
	Label lab10 = new Label();
	Label lab11 = new Label();
	Label lab12 = new Label();
	Label fuelBarlab = new Label();
	Label decrementfuellab = new Label();
	Label lifeLine = new Label();
	Label lostLife = new Label();
	Label movlab1 = new Label();
	Label movlab2 = new Label();
	Label movlab3 = new Label();
	Label movlab4 = new Label();
	Label movlab5 = new Label();
	Label hero = new Label();
	int life = 1300;
	int fuel =1300;
	int xAxis=10;
	int yAxis=30;

	
	LabThread1 labThread1 =new LabThread1();
	LabThread2 labThread2 =new LabThread2();
	LabThread3 labThread3 =new LabThread3();
	LabThread4 labThread4 =new LabThread4();
	LabThread5 labThread5 =new LabThread5();
	
	

	MazeRunner(){
		
		f.setSize(1366,768);
		f.setLayout(null);
		f.setBackground(Color.darkGray);
		f.addKeyListener(this);
		f.show();
		
		lab1.setBounds(-10,80,500,50);
		lab1.setBackground(Color.gray);
		f.setLayout(null);
		f.add(lab1);
		
		lab2.setBounds(540,80,850,50);
		lab2.setBackground(Color.blue);
		f.setLayout(null);
		f.add(lab2);
		
		
		lab3.setBounds(-10,180,200,50);
		lab3.setBackground(Color.orange);
		f.setLayout(null);
		f.add(lab3);
		
		lab4.setBounds(240,180,1100,50);
		lab4.setBackground(Color.pink);
		f.setLayout(null);
		f.add(lab4);
		
		
		lab5.setBounds(60,280,500,50);
		lab5.setBackground(Color.green);
		f.setLayout(null);
		f.add(lab5);
		
		
		lab6.setBounds(610,280,900,50);
		lab6.setBackground(Color.white);
		f.setLayout(null);
		f.add(lab6);
		
		
		lab7.setBounds(10,380,800,50);
		lab7.setBackground(Color.blue);
		f.setLayout(null);
		f.add(lab7);
		
		
		lab8.setBounds(860,380,600,50);
		lab8.setBackground(Color.red);
		f.setLayout(null);
		f.add(lab8);
		
		lab9.setBounds(10,480,100,50);
		lab9.setBackground(Color.lightGray);
		f.setLayout(null);
		f.add(lab9);
		
		lab10.setBounds(160,480,1100,50);
		lab10.setBackground(Color.white);
		f.setLayout(null);
		f.add(lab10);
		
		lab11.setBounds(10,580,500,50);
		lab11.setBackground(Color.pink);
		f.setLayout(null);
		f.add(lab11);
		
		lab12.setBounds(560,580,800,50);
		lab12.setBackground(Color.red);
		f.setLayout(null);
		f.add(lab12);
		
		fuelBarlab.setBounds(10,680,1300,30);
		fuelBarlab.setBackground(Color.white);
		f.setLayout(null);
		f.add(fuelBarlab);
		
		decrementfuellab.setBounds(10,680,1300,30);
		decrementfuellab.setBackground(Color.red);
		f.setLayout(null);
		f.add(decrementfuellab);
		
		lifeLine.setBounds(10,730,1300,30);
		lifeLine.setBackground(Color.black);
		f.setLayout(null);
		f.add(lifeLine);
		
		lostLife.setBounds(10,730,1300,30);
		lostLife.setBackground(Color.white);
		f.setLayout(null);
		f.add(lostLife);
		
		movlab1.setBounds(10,130,50,50);
		movlab1.setBackground(Color.red);
		f.setLayout(null);
		f.add(movlab1);
		
		movlab2.setBounds(10,185,50,50);
		movlab2.setBackground(Color.blue);
		f.setLayout(null);
		f.add(movlab2);
		
		movlab3.setBounds(10,255,50,50);
		movlab3.setBackground(Color.yellow);
		f.setLayout(null);
		f.add(movlab3);
		
		movlab4.setBounds(10,325,50,30);
		movlab4.setBackground(Color.pink);
		f.setLayout(null);
		f.add(movlab4);
		
		movlab5.setBounds(10,395,50,50);
		movlab5.setBackground(Color.orange);
		f.setLayout(null);
		f.add(movlab5);
		
		hero.setBounds(xAxis,yAxis,50,50);
		hero.setBackground(Color.cyan);
		f.add(hero);
		
		
		labThread1.start();
		labThread2.start();
		labThread3.start();
		labThread4.start();
		labThread5.start();
		
	
	}
	
	public void keyPressed(KeyEvent e){
	
	int code = e.getKeyCode();
	
	if(code==37) {
		if(fuel>0){
		if(xAxis==490&&yAxis==80||xAxis==190&&yAxis==180||xAxis==10&&yAxis==280||xAxis==560&&yAxis==280||xAxis==810&&yAxis==380||xAxis==110&&yAxis==480||xAxis==1260&&yAxis==480||xAxis==510&&yAxis==580){
				//do nothing
			}else {
				xAxis-=10;
				fuelBar();
				}
		}
	}
		
	if(code==39) {
		if(fuel>0){
			
		
		if(xAxis==490&&yAxis==80||xAxis==190&&yAxis==180||xAxis==10&&yAxis==280||xAxis==560&&yAxis==280||xAxis==810&&yAxis==380||xAxis==110&&yAxis==480||xAxis==1260&&yAxis==480||xAxis==510&&yAxis==580){
			//do nothing
		}
		else {
			xAxis+=10;
			fuelBar();
			}
			
		}
	}
	if(code==38) {
		if(fuel>0){
		if(xAxis==490&& yAxis==130 || xAxis==490&& yAxis==80)yAxis-=50;
		
		if(xAxis==190&& yAxis==230 || xAxis==190 && yAxis==180)yAxis-=50; 
		
		if(xAxis==10&& yAxis==330||xAxis==10&& yAxis==280)yAxis-=50;
		
		if(xAxis==560&& yAxis==330||xAxis==560&& yAxis==280)yAxis-=50;
		
		if(xAxis==810&& yAxis==430||xAxis==810&& yAxis==380)yAxis-=50;
		
		if(xAxis==110&& yAxis==530||xAxis==110&& yAxis==480)yAxis-=50;
		
		if(xAxis==1260&& yAxis==530||xAxis==1260&& yAxis==480)yAxis-=50;
		
		if(xAxis==510&& yAxis==630||xAxis==510&& yAxis==580)yAxis-=50;
		winGame();
		fuelBar();
		}
	}
	
	if(code==40){ 
		if(fuel>0){
		if(xAxis==490&& yAxis==30 || xAxis==490&& yAxis==80)yAxis+=50;
		
		if(xAxis==190&& yAxis==130||xAxis==190&& yAxis==180)yAxis+=50;
		
		if(xAxis==10&& yAxis==230||xAxis==10&& yAxis==280)yAxis+=50;
		
		if(xAxis==560&& yAxis==230||xAxis==560&& yAxis==280)yAxis+=50;
		
		if(xAxis==810&& yAxis==330||xAxis==810&& yAxis==380)yAxis+=50;
		
		if(xAxis==110&& yAxis==430||xAxis==110&& yAxis==480)yAxis+=50;
		
		if(xAxis==1260&& yAxis==430||xAxis==1260&& yAxis==480)yAxis+=50;
		
		if(xAxis==510&& yAxis==530||xAxis==510&& yAxis==580)yAxis+=50;
		
		winGame();
		fuelBar();
		}
	}

	if(yAxis<30)yAxis=30;		
	
	if(xAxis<10)xAxis=1260;
	else if(xAxis>1260)xAxis=10;
	
	hero.setLocation(xAxis,yAxis);
	f.setTitle("MAZE RUNNER");
	
	}
	
	public void keyReleased(KeyEvent e){
		
	}

	public void keyTyped(KeyEvent e){
		
	}
	
	public void actionPerformed(ActionEvent e){
		
		}


	private void lifeLineBar(){
		
	lifeLine.setSize(life,30);
		life-=30;
	}

	private void fuelBar(){
		
		fuelBarlab.setSize(fuel,30);
		fuel-=4;
	}
		
private void checkAccident(){
	
	
	
	if(movlab1.getX()==hero.getX() && movlab1.getY()==hero.getY()){
		lifeLineBar();
	}
	

	if(movlab2.getX()==hero.getX() && movlab2.getY()==hero.getY()){
		lifeLineBar();
	}
	
	
	if(movlab3.getX()==hero.getX() && movlab3.getY()==hero.getY()){
		lifeLineBar();
	}
	

	if(movlab4.getX()==hero.getX() && movlab4.getY()==hero.getY()){
		lifeLineBar();
	}
	

	if(movlab5.getX()==hero.getX() && movlab5.getY()==hero.getY()){
		lifeLineBar();
	}
	

}

	private void winGame(){
		if(xAxis ==510&& yAxis ==630){
		JOptionPane.showMessageDialog(null,"you won the game");
		}
	}
	
class LabThread1 extends Thread{
		public void run(){  
		try{
			do{	
				for(int i =10; i<=1250;i++){
					movlab1.setBounds(i,130,50,50);
					Thread.sleep(5);
					checkAccident();
			 	}
				
			
				
			
				for(int i=1250;i>=10;i--){
					movlab1.setBounds(i,130,50,50);	
					Thread.sleep(5);
					checkAccident();
				}				
				
			  }while(true);
		
		}catch(Exception e){
			e.printStackTrace();
			}
		
			
		}//end run
		
	}//end labThread1 inner class 	
	
	class LabThread2 extends Thread{
		public void run(){  
		try{
			do{
					
				for(int i =10; i<=1250;i++){
					movlab2.setBounds(i,230,50,50);
					Thread.sleep(3);
					checkAccident();
			 		}
				
					
				for(int i=1250;i>=10;i--){
					movlab2.setBounds(i,230,50,50);	
					Thread.sleep(3);
					checkAccident();
					}	
					
				}while(true);
	
		}catch(Exception e){
				e.printStackTrace();
			}
				
			
		}//end run
		
	}//end labThread2 inner class 	
	
	class LabThread3 extends Thread{
		public void run(){  
		try{
			do{
					
				for(int i =10; i<=1250;i++){
					movlab3.setBounds(i,330,50,50);
					Thread.sleep(4);
			 		checkAccident();
					}		
					
				for(int i=1250;i>=10;i--){
					movlab3.setBounds(i,330,50,50);	
					Thread.sleep(4);
					checkAccident();
					}	
			}while(true);
				
		}catch(Exception e){
			e.printStackTrace();
			}
				
			
		}//end run
		
	}//end labThread3 inner class 	
	
	class LabThread4 extends Thread{
		public void run(){  
		try{
			do{
					
				for(int i =10; i<=1250;i++){
					movlab4.setBounds(i,430,50,50);
					Thread.sleep(6);
			 		checkAccident();
					}
					
				for(int i=1250;i>=10;i--){
					movlab4.setBounds(i,430,50,50);	
					Thread.sleep(6);
					checkAccident();
					}	
			}while(true);
	
		}catch(Exception e){
			e.printStackTrace();
			}
				
			
		}//end run
		
	}//end labThread4 inner class 	
	
	class LabThread5 extends Thread{
		public void run(){  
		try{
			do{			
				for(int i =10; i<=1250;i++){
					movlab5.setBounds(i,530,50,50);
					Thread.sleep(5);
					checkAccident();			 	
				}
					
					
				for(int i=1250;i>=10;i--){
					movlab5.setBounds(i,530,50,50);	
					Thread.sleep(5);
					checkAccident();
				}	
					
					
			}while(true);
			
		}catch(Exception e){
			e.printStackTrace();
				}
			
		}//end run
		
	}//end labThread5 inner class 	
	
	
	

	public static void main (String[] args) {
		
		MazeRunner maze = new MazeRunner();
	
		
	}// main method end 

}//MazeRunner class end
 