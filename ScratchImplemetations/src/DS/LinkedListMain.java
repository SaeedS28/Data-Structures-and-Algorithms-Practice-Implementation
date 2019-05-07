package DS;

public class LinkedListMain {

	public static void main(String[] args) {
		DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
		
		System.out.println(list.toString());
		
		list.addFirst(12);
		list.addFirst(13);
		list.addFirst(155);
		System.out.println(list.toString());
		
		list.addLast(22);
		list.addLast(222);
		list.addFirst(12111);
		//list.addAt(0, 42);
		list.addAt(5, 26);
		System.out.println(list.toString()+" "+list.length());
		
	}

}
