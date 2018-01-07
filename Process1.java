package lab8;

public class Process1 extends Thread{
	public Process1(String name) {
		super(name);
	}
	@Override
	public void run(){
		do { 
			petersen_Algo.flag[0] = true;
			petersen_Algo.turn = 2;
			while ((petersen_Algo.flag[1] || petersen_Algo.flag[2]) && petersen_Algo.turn == 2){
	            //busy waiting
	        }
			System.out.println("=>   "+this.getName()+" is in critical section and using shared resource");
			petersen_Algo.flag[0] = false; 
			System.out.println();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// go to remainder section 
		} while (true); 

	}
}
