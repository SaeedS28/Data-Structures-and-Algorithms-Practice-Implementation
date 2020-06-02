package Algorithms.Threads;

public class Entity {
	private int counter;
	private boolean isSet;
	
	public Entity() {
		this.isSet = false;
	}

	// synchronized means that only one thread can call this method in any given time
	public synchronized void setCounter(int counter) {
		while(isSet) {
			try {
				wait();	// tells the calling thread to wait arount until another thread calls notify... Thread.sleep cannot be interrupted but wait can
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.counter = counter;
		System.out.println("Produced: " + this.counter);
		isSet = true;
		notify(); // tells the waiting thread to start executing again
	}
	
	public synchronized void seeCounter() {
		while(!isSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Consumer: " + this.counter);
		isSet = false;
		notify();
	}
}
