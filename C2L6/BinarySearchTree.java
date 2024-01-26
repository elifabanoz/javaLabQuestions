package lab6;

public class BinarySearchTree<Type extends Comparable<Type>> {
	Node<Type> root;
	public BinarySearchTree() {
		this.root=null;
	}
	public void insert(Type value) {
		root= insertHelper(root,value);
	}
	private Node<Type> insertHelper(Node<Type> root, Type value) {
		if(root==null) {
			root= new Node<Type>(value);
			return root;
		}
		if(value.compareTo(root.value)<0) 
			root.left=insertHelper(root.left,value);
		else if(value.compareTo(root.value)>0) 
			root.right=insertHelper(root.right,value);
		return root;
		
	}
		
	public boolean search(Type value) {
			return searchHelper(root,value);
		}
	private boolean searchHelper(Node<Type> root, Type value) {
		if(root==null) 
		    return false;
		
		if(value.equals(root.value))
			return true;
		
		if(value.compareTo(root.value)<0)
			return searchHelper(root.left,value);
		else
			return searchHelper(root.right,value);
	}
	public int countNodes() {
		return countNodesHelper(root);
	}
	private int countNodesHelper(Node<Type> root) {
		if(root==null)
		   return 0;
		
		return 1 + countNodesHelper(root.left) + countNodesHelper(root.right);
	}
	
	public boolean checkBST() {
		return checkBSTHelper(root,null,null);
	}
	private boolean checkBSTHelper(Node<Type> root, Type min, Type max) {
		if(root==null)
		  return true;
		if((min!=null && root.value.compareTo(min)<=0) || (max!=null && root.value.compareTo(max)>=0)){
			return false;
		}
		return checkBSTHelper(root.left,min,root.value) && checkBSTHelper(root.right,root.value,max) ;
	}
		
	}


