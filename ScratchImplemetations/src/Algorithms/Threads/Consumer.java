package Algorithms.Threads;

public class Consumer implements Runnable {
	private Entity en;
	
	public Consumer(Entity en) {
		this.en = en;
		Thread thread = new Thread(this, "Consumer");
		thread.start();
	}
	
	@Override
	public void run() {
		while(true) {
			en.seeCounter();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}
