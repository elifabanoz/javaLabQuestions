package lab1;

public class MyQueue <Type>{
	DLinkedList <Type> Myqueue;
	public MyQueue() {
		this.Myqueue=new DLinkedList<>();
	}
     
	 void enqueue(Type data){
		 Myqueue.addLast(data);
	 }
	Type dequeue() {
		return Myqueue.removeFirst();
	}
	

}
