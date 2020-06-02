package Algorithms.Threads;

public class Producer implements Runnable {
	private Entity en;
	
	public Producer(Entity en) {
		this.en = en;
		Thread thread = new Thread(this, "Consumer");
		thread.start();
	}
	
	@Override
	public void run() {
		int i=0;
		
		while(true) {
			en.setCounter(i++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
