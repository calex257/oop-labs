package lab3.problema3;

public class MyQueue {
	private MyArray arr;
	final int Infinit = 9500;
	private int head, tail;
	private int size;
	
	public MyQueue() {
		arr = new MyArray();
		tail=-1;
		head=0;
		size=0;
	}

	public int getSize() {
		return tail-head+1;
	}
	
	public void enqueue(int value) {
		this.tail++;
		arr.set(this.tail, value);
		this.size++;
	}
	
	public int dequeue() {
		int elm = arr.get(this.head);
		this.head++;
		this.size--;
		return elm;
	}
	
	boolean isEmpty() {
		return this.size==0;
	}
	
	public String toString() {
		String str = "";
		for(int i=this.head;i<=this.tail;i++) {
			str+=arr.get(i)+" ";
		}
		return str;
	}
}
