package Algorithms.HashTables;

public class HashTableMain {
	public static void main(String[] args) {
		Pair<Integer> entry=new Pair<>("Saad",999);
		Pair<Integer> entry2=new Pair<>("Memes",999);
		HashTable<Integer> ht=new HashTable<>(5);
		
		//add pair into table
		ht.insertPair(entry);
		ht.insertPair(entry2);
		ht.insertPair(new Pair<Integer>("Sam",222));
		ht.insertPair(new Pair<Integer>("Toronto",666));
		ht.insertPair(new Pair<Integer>("Java",0));
		ht.insertPair(new Pair<Integer>("C++",222));
		System.out.println(ht.toString());
	}
}
