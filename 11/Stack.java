
public class Stack {

	public Node initialNode;
	
	public Stack() {
		initialNode = null;
	}
	
	public void push(int val) {
		
		Node node = new Node(val);
		if(initialNode==null) {
			initialNode = node;
		}else {
			Node curr= initialNode;
			while(curr.next != null) {
				curr= curr.next;
			}
			curr.next=node;
		}
	}
	
	public int pop() {
		
		if(initialNode==null) {
			return -1;
		}else if(initialNode.next==null) {
			int value= initialNode.value;
			initialNode=null;
			return value;
		}else {
			Node curr= initialNode;
			Node precdNode= null;
			while(curr.next !=null) {
				precdNode=curr;
				curr=curr.next;
			}
			precdNode.next=null;
			return curr.value;
		}
	}
	
	public String toString() {
		Node current = initialNode;
		String msg = "Stack contains elements: ";
		while(current != null) {
			msg += current.value + " ";
			current = current.next;
		}
		return msg;
	}
	
}
