package stackqueue;

import java.util.Stack;

public class ValidParentheses {
	public boolean isValid(String s) {
		Stack<String> stack=new Stack<String>();
		for(int i=0;i<s.length();++i){
			String cur=s.charAt(i)+"";
			if(cur.equals("(")||cur.equals("[")||cur.equals("{"))
				stack.push(cur);
			else if(cur.equals(")")){
				if(!stack.empty()&&stack.peek().equals("(")){
					stack.pop();
				}else{
					return false;
				}
			}else if(cur.equals("]")){
				if(!stack.empty()&&stack.peek().equals("[")){
					stack.pop();
				}else{
					return false;
				}
			}else if(cur.equals("}")){
				if(!stack.empty()&&stack.peek().equals("{")){
					stack.pop();
				}else{
					return false;
				}
			}else{
				return false;
			}
		}
		if(stack.empty())
			return true;
		return false;
	}
	
	public static void main(String[] args){
		System.out.print(new ValidParentheses().isValid(""));
	}
}
