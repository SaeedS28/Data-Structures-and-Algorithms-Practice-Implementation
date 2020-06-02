package Algorithms.Threads;

public class ProducerConsumerMain {
	
	public static void main(String[] args) {
		Entity en = new Entity();
		
		new Producer(en);
		new Consumer(en);
	}

}
