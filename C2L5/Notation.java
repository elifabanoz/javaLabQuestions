package lab5;
import java.util.Stack;

public class Notation {
	
	public static String prefixToInfix ( String formula ) {
		Stack<String> stack = new Stack<>();
		for(int i=formula.length()-1; i>=0; i--) {
			char element = formula.charAt(i);
			if(element== '+' || element=='-' || element=='/' || element=='*') {
				String firstOperand= stack.pop();
				String secondOperand= stack.pop();
				String result = "(" + firstOperand +element + secondOperand + ")";
				stack.push(result);
			}else {
				stack.push(String.valueOf(element));
			}
		}
		return stack.pop();
	}
	
	public static String postFixToInfix(String formula) {
		Stack<String> stack = new Stack<>();
		for(int i=0; i<formula.length(); i++) {
			char element= formula.charAt(i);
			if(element=='+' || element=='-' || element== '/' || element== '*') {
				String firstOperand = stack.pop();
				String secondOperand = stack.pop();
				String result = "(" + firstOperand + element + secondOperand + ")";
				stack.push(result);
			}else {
				stack.push(String.valueOf(element));
			}
		}
		return stack.pop();
	}
	


	public static void main(String[] args) {
		
		System.out.println(prefixToInfix( "+*342" ));
		System.out.println(prefixToInfix( "/+*3422" ));
		System.out.println(prefixToInfix( "+-*+-*+-*1234567891" ));
		
		System.out.println();
		
		System.out.println(postFixToInfix( "34*2+" ));
		System.out.println(postFixToInfix( "34+22*/" ));
		System.out.println(postFixToInfix("1234567891+-*+-*+-*"));
		
		//sondaki postFix in parantezleri sonda değil ama işlem doğruymuş hocayla bakmıştık hocam
	
		
		
		
		
		

	}

}
