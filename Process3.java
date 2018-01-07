package lab8;

public class Process3 extends Thread{
	public Process3(String name) {
		super(name);
	}
	@Override
	public void run(){
		do { 
			petersen_Algo.flag[2] = true;
			petersen_Algo.turn = 0;
			while ((petersen_Algo.flag[0] || petersen_Algo.flag[1]) && petersen_Algo.turn == 0){
	            //busy waiting
	        }
			System.out.println("=>   "+this.getName()+" is in critical section and using shared resource");
			petersen_Algo.flag[1] = false; 
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
