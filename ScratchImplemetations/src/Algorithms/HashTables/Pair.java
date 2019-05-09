package Algorithms.HashTables;

public class Pair<V> {
	
	private String key;
	private V value;
	
	public Pair(String key, V value) {
		this.setKey(key);
		this.setValue(value);
	}
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
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
			Pair<V> other=(Pair<V>) o;
			if(other.getKey().equals(this.getKey())) {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		return ("("+this.getKey().toString()+","+this.getValue().toString()+")");
	}
}
