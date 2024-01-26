class Node {
    char data;
    Node left, right;
    int level;
    int count;

    public Node(char item) {
        data = item;
        left = right = null;
        level = 0;
        count = 0;
    }
}