package part2;
import java.util.Scanner;
import java.util.Stack;

public class Calc {
    private Stack<Integer> stack;

    public Calc() {
        stack = new Stack<>();
    }

    public void inputEntry(String input) {
        try {
            int operand = Integer.parseInt(input);
            stack.push(operand);
        } catch (NumberFormatException e) {
            if (input.equals("+")) {
                operations('+');
            } else if (input.equals("-")) {
                operations('-');
            } else if (input.equals("*")) {
                operations('*');
            } else if (input.equals("/")) {
                operations('/');
            } else if (input.equals("E")) {
                System.exit(0);
            } else {
                System.out.println("Invalid operator");
            }
        }
    }

    private void operations(char operator) {
        if (stack.size() >= 2) {
            int operand2 = stack.pop();
            int operand1 = stack.pop();
            int result = 0;

            switch (operator) {
                case '+':
                    result = operand1 + operand2;
                    break;
                case '-':
                    result = operand1 - operand2;
                    break;
                case '*':
                    result = operand1 * operand2;
                    break;
                case '/':
                    if (operand2 != 0) {
                        result = operand1 / operand2;
                    } else {
                        System.out.println("Error: Division by zero");
                        return;
                    }
                    break;
            }

            stack.push(result);
            System.out.println("Result is " + result);
        } else {
            System.out.println("Error: Insufficient operands for operation");
        }
    }

    public static void main(String[] args) {
        Calc calculator = new Calc();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a command: ");
            String input = scan.next();
            calculator.inputEntry(input);
        }
    }
}