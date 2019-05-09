package Algorithms.HashTables;

public class Pair<K, V> {
	
	private K key;
	private V value;
	
	public Pair(K key, V value) {
		this.setKey(key);
		this.setValue(value);
	}
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	public boolean equals(Object o) {
		if(this.getClass().equals(o.getClass())) {
			Pair<K,V> other=(Pair<K,V>) o;
			if(other.getKey().equals(this.getKey())) {
				return true;
			}
		}
		return false;
	}
}
