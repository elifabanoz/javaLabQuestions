import java.util.Arrays;
import java.util.Stack;
public class Tree {
    public static void printTree(Node root) {
        int height = getHeight(root);
        int width = (int) Math.pow(2, height) * 2 - 1;

        char[][] result = new char[height][width];
        for (char[] row : result) {
            Arrays.fill(row, ' ');
        }

        fillArray(root, result, 0, 0, width / 2);

        for (char[] row : result) {
            System.out.println(row);
        }
    }

    private static void fillArray(Node node, char[][] result, int level, int left, int right) {
        if (node == null) {
            return;
        }

        int mid = (left + right) / 2;
        result[level][mid] = node.data;

        if (node.left != null) {
            fillArray(node.left, result, level + 1, left, mid - 1);
        }
        if (node.right != null) {
            fillArray(node.right, result, level + 1, mid + 1, right);
        }
    }

    private static int getHeight(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }

    public static Node buildTree(String postfix) {
        Stack<Node> stack = new Stack<>();

        for (char c : postfix.toCharArray()) {
            Node node = new Node(c);
            if (isOperator(c)) {
                node.right = stack.pop();
                node.left = stack.pop();
            }
            stack.push(node);
        }

        return stack.pop();
    }

    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    public static void main(String[] args) {
        Node root1 = buildTree("12+34-*");
        printTree(root1);

        Node root2 = buildTree("12+356/-*");
        printTree(root2);

        Node root3 = buildTree("12+3+578/-*");
        printTree(root3);
    }
}