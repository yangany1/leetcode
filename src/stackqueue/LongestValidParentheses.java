package stackqueue;

import java.util.Stack;

public class LongestValidParentheses {
	public int longestValidParentheses(String s) {
		Stack<Integer> stack = new Stack<Integer>();
		int max_len = 0;
		int last = -1;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(')
				stack.push(i);
			else {
				if (stack.empty()) {
					last = i;
				} else {
					stack.pop();
					if (stack.empty()) {
						max_len = Math.max(max_len, i - last);
					} else {
						max_len = Math.max(max_len, i - stack.peek());
					}
				}
			}
		}
		return max_len;
	}
	
	public static void main(String[] args){
		System.out.print(new LongestValidParentheses().longestValidParentheses("()()"));
	}
}
