package lab6;

public class Main {

	public static void main(String[] args) {
		BinarySearchTree<Integer> tree = new BinarySearchTree<>();
		int[] insertTo = {3,5,7,2,8,9,1};
		for(int value: insertTo) {
			tree.insert(value);
		}
		System.out.println(tree.search(8));
		System.out.println(tree.search(10));
		System.out.println(tree.checkBST());
		System.out.println(tree.countNodes());

	}

}
