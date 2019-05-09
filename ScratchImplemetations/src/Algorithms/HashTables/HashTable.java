package Algorithms.HashTables;

import java.util.LinkedList;

public class HashTable<V> {

	private LinkedList<Pair<V>>[] array;
	
	
	public HashTable(int size) {
		array=(LinkedList<Pair<V>>[])new LinkedList[size];
	}
	
	
	public boolean insertPair(Pair<V> pair) {
		//calculating the hash function
		boolean isAdded=false;
		int keyHash=0;
		char toChar[]=pair.getKey().toCharArray();
		
		for(int i=0;i<toChar.length;i++) {
			keyHash=keyHash+(int)toChar[i];
		}
		
		keyHash = keyHash%array.length;
		System.out.println("Hash Index= "+keyHash);
		
		if(array[keyHash].equals(null)) {
			array[keyHash]=new LinkedList<Pair<V>>();
			array[keyHash].add(pair);
			isAdded=true;
		}
		else {
			int counter=-1;
			for(int i=0;i<array[keyHash].size();i++) {
				if(array[keyHash].get(i).equals(pair)) {
					counter=i;
					break;
				}
			}
			if(counter==-1) {
				array[keyHash].addLast(pair);
				isAdded=true;
			}else {
				array[keyHash].get(counter).setValue(pair.getValue());			
			}
		}
		System.out.println(isAdded);
		return isAdded;
	}
	
	public V retrieve(String key){
		int keyHash=0;
		char toChar[]=key.toCharArray();
		
		for(int i=0;i<toChar.length;i++) {
			keyHash=keyHash+(int)toChar[i];
		}
		
		keyHash = keyHash%array.length;
		System.out.println("Hash Index= "+keyHash);
		
		if(array[keyHash].equals(null)) {
			return null;
		}
		else {
			for(int i=0;i<array[keyHash].size();i++) {
				if(array[keyHash].get(i).getKey().equals(key)){
					return array[keyHash].get(i).getValue();
				}
			}
		}
		return null;
	}
	
	public String toString() {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<array.length;i++) {
			sb.append("|--- ");
			for(int j=0;j<array[i].size();j++) {
				sb.append(array[i].get(j));
			}
			sb.append(" ---|");
		}
		return sb.toString();
	}
}