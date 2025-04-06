package tp1.ej8;

import java.util.ArrayList;
import java.util.List;

public class Queue <T> extends Sequence{

	protected List<T> info;
	
	public Queue() {
		info = new ArrayList<T>();
	}
	
	public void enqueue(T dato) {
		info.add(dato);
	}
	
	public T dequeue() {
		return info.remove(0);
	}
	
	public T head() {
		return info.get(0);
	}
	
	public boolean isEmpty() {
		return info.size() == 0;
	}
	
	public int size() {
		return info.size();
	}
	
	public String toString() {
		String str = "";
		for (T i:info) {
			str += i + ", ";
		}
		return str;
	}
}
