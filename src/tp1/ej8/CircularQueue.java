package tp1.ej8;

public class CircularQueue<T> extends Queue<T> {
	
	public T shift() {
		T info = this.dequeue();
		enqueue(info);
		return info;
	}
}
