public class BinarySearchTree {
    public Node root;
    private class Node {
        String word;
        int count;
        Node left, right;

        public Node(String value) {
            this.word = value;
            this.count = 1;
            this.left = this.right = null;
        }
    }

        public void insert(String word) {
            root = insertHelper(root,word);
        }
        private Node insertHelper(Node root,String word){
            if(root==null){
                return new Node(word);
            }
            int compare=word.compareTo(root.word);

            if(compare<0){
                root.left=insertHelper(root.left,word);
            }else if(compare>0){
                root.right=insertHelper(root.right,word);
            }else{
                root.count++;
            }
            return root;
        }
        public void printFrequencies(){
            printInOrder(root);
        }

    private void printInOrder(Node root) {
        if(root!=null){
            printInOrder(root.left);
            System.out.println(root.word + ":" + root.count);
            printInOrder(root.right);
        }
    }


}

