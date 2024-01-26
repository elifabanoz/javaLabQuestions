package lab6;

public class Node<Type extends Comparable<Type>> {
	Type value;
	Node <Type> left,right;
	
	public Node(Type value) {
		this.value=value;
		left=right=null;
		
	}
	}
	


