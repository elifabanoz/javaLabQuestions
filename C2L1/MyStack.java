package lab1;

public class MyStack<Type> {
	DLinkedList <Type> Mystack;
	public MyStack() {
		this.Mystack= new DLinkedList<>();
	}
	void push(Type data) {
		Mystack.addLast(data);
	}
	Type pop() {
		return Mystack.removeLast();
	}

}
