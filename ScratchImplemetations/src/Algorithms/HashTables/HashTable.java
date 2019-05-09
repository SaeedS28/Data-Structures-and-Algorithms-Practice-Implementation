package Algorithms.HashTables;

import java.util.LinkedList;

public class HashTable<K, V> {

	private LinkedList<Pair<K,V>>[] array;
	
	
	public HashTable(int size) {
		array=(LinkedList<Pair<K,V>>[])new LinkedList[size];
	}
	
	
}
