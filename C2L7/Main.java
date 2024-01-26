public class Main {
    private static class Node {
        int data;
        Node next;
        public Node(int n){
            this.data = n;
            this.next = null;
        }
    }
    public static void main(String[] args) {

        Node head = new Node(9);
        head.next = new Node(9);
        head.next.next = new Node(9);
        head.next.next.next = new Node(9);
       // head.next.next.next = new Node(9); //çalışıyor
        //head = add( head, 8);
        head = add( head, 5 );
        printList( head );
    }

    private static Node add(Node node, int i) {
        Node temp;
        node =addHelp(node,i);
        if(node.data>9){
          node.data%=10;
            temp = new Node(1);
            temp.next = node;
            return temp;
        }
        return node;
    }

    private static Node addHelp(Node node, int i) {
        if(node.next==null){
            node.data+=i;
            return node;
        }
        node.next=addHelp(node.next, i);
        if(node.next.data>9){
            node.next.data%=10;
            node.data+=1;
        }
        return node;

    }



    public static void printList(Node node){
        while (node != null) {
            System.out.print(node.data);
            if(node.next != null) System.out.print("->");
            node = node.next;
        }
    }
}
