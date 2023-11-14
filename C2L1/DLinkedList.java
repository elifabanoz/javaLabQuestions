package lab1;

public class DLinkedList<Type> {
	Node <Type> head;
	Node <Type> tail;
	int size;
	
	public DLinkedList() {
		this.head=null;
		this.tail=null;
		this.size=0;
	}
	public void SwapFirstSecond() {
		if(size>=2) {
			Node <Type> temp=head;
			head=head.next;
			temp.next=head.next;
			head.next=temp;
			head.next.prev=head;
			temp.prev=head;
		}else {
			System.out.println("Invalid size");
		}
		
	}
	
	public Type remove(int i) {
		if(i<0 || i>=size) {
			return null;
		}else {
			Node<Type> num= head;
			for(int sayi=0; sayi<i; sayi++) {
				num= num.next;
			}
			if(num==head) {
				return removeFirst();
			}else if(num==tail) {
				return removeLast();
			}else {
				num.prev.next=num.next;
				num.next.prev=num.prev;
				size--;
				return num.data;
			}
		}
		
	}
	
	public Type removeFirst() {
		if(size==0) {
			return null;
		}else {
			Type data=head.data;
			head=head.next;
		    head.prev=null;
			size--;
			return data;
		}
	}
	
	public Type removeLast() {
		Type data = tail.data;
		tail=tail.next;
		if(tail!=null) {
			tail.next=null;
		}else {
			head=null;
		}
		size--;
		return data;
		
		
		
	}
	
	public void duplicate(int i) {
		if(i<0 || i>=size) {
			System.out.println("Invalid");		
		}
		Node <Type> num = head;
		for(int sayi=0; sayi<i; sayi++) {
			num=num.next;
		}
		Node <Type> node= new Node<>(num.data);
		node.next=num.next;
		node.prev=num;
		if(num.next!=null) {
			num.next.prev=node;
		}
		num.next=node;
		size++;
		
	}
	
	public void addLast(Type data) {
		Node <Type> node = new Node<>(data);
		if(tail!=null) {
			tail.next=node;
			node.prev=tail;
		}else {
				head=node;
				}
		tail=node;
		size++;
			
			}
}


		
	


