import java.util.*;

public class BalancedParenthesis {
    public static void main(String[] args) {
        String s = "]";
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.size() == 0 && (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')) {
                stack.push(s.charAt(i));
                continue;
            }
            if (s.charAt(i) == ')' && stack.peek() == '(') {
                stack.pop();
            } else if (s.charAt(i) == '}' && stack.peek() == '{') {
                stack.pop();
            } else if (s.charAt(i) == ']' && stack.peek() == '[') {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        if (stack.size() == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}