package string;

import java.util.Stack;

public class SimplifyPath {
	public String simplifyPath(String path) {
		String[] a = path.split("/");
		Stack<String> stack = new Stack<String>();

		for (int i = 0; i < a.length; i++) {
			if (a[i].length() > 0) {
				if (a[i].equals("..")) {
					if(!stack.empty())stack.pop();
				} else if (a[i].equals(".")) {
					continue;
				} else {
					stack.push(a[i]);
				}

			}
		}
		String result = "";
		if(stack.empty())
			return "/";
		while (!stack.empty()) {
			result = "/" + stack.pop() + result;
		}
		return result;
	}

	public static void main(String[] args) {
		String s = "/../";
		System.out.println(new SimplifyPath().simplifyPath(s));
	}
}
