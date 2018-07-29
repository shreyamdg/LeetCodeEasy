package arraysAndstrings;
import java.util.Stack;

public class ValidParentheses {

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)
				return false;
		}
		return stack.isEmpty();
	}

	public static boolean isValidSecondSolution(String s) {
		if (s.length() % 2 != 0)
			return false;
		char[] brackets = new char[s.length()];
		int i = 0;
		for (char c : s.toCharArray()) {
			if (c == '(' || c == '[' || c == '{') {
				brackets[i] = c;
				i++;
			} else if (c == ')' && i != 0) {
				i--;
				if (brackets[i] != '(')
					return false;
			} else if (c == ']' && i != 0) {
				i--;
				if (brackets[i] != '[')
					return false;
			} else if (c == '}' && i != 0) {
				i--;
				if (brackets[i] != '{')
					return false;
			}
		}
		return i == 0;
	}

	public static void main(String[] args) {
		System.out.println(isValid("(]"));
	}

}
