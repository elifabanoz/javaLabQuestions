package lab1;

public class Node<Type> {
	Type data;
	Node<Type> next;
	Node<Type> prev;
	
	public Node(Type data) {
		this.data=data;
		this.next=null;
		this.prev=null;
	}
	

}
