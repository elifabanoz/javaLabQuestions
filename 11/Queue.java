package labb11;

public class Queue {
	public NodeString initialNode;
	
	public Queue() {
		initialNode=null;
	}
	
	public void push(String val) {
		Node node= new Node(val);
		if(initialNode==null) {
			initialNode=node;
		}else {
			node.next=initialNode;
			initialNode=node;
		}
	}
	
	public String pop() {
		if(initialNode==null) {
			return null;
		}else if(initialNode.next==null) {
			String value= initialNode.value;
			initialNode=null;
			return value;
		}else {
			Node curr= initialNode;
			Node precdNode=null;
			while(curr.next!=null) {
				precdNode=curr;
				curr=curr.next;
			}
			precdNode.next=null;
			return curr.value;
		}
	}
	
	public String toString() {
		Node curr= initialNode;
		String msg="Queue contains elements: ";
		while(curr!= null) {
			msg+=curr.value + " ";
			curr=curr.next;
		}
		return msg;
	}

}
