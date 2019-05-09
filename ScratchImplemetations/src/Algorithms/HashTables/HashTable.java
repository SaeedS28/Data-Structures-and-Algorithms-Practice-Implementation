package Algorithms.HashTables;

import java.util.LinkedList;

public class HashTable<K, V> {

	private LinkedList<Pair<K,V>>[] array;
	
	
	public HashTable(int size) {
		array=(LinkedList<Pair<K,V>>[])new LinkedList[size];
	}
	
	
	public boolean insertPair(Pair<K,V> pair) {
		//calculating the hash function
		boolean isAdded=false;
		int keyHash=Integer.decode(Integer.toHexString(pair.hashCode()));
		keyHash = keyHash%array.length;
		
		if(array[keyHash].equals(null)) {
			array[keyHash]=new LinkedList<Pair<K,V>>();
			array[keyHash].add(pair);
			isAdded=true;
		}
		
	}
	
}
