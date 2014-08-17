package stackqueue;
import java.util.Stack;
/**
 * Created by luo on 2014/7/17.
 */
public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        Stack<String> stack=new Stack<String>();
        for(int i=0;i<tokens.length;i++){
            String cur=tokens[i];
            if(cur.equals("+")){
                int oper2=Integer.parseInt(stack.pop());
                int oper1=Integer.parseInt(stack.pop());
                int result=oper1+oper2;
                stack.push(String.valueOf(result));
            }else if(cur.equals("-")){
                int oper2=Integer.parseInt(stack.pop());
                int oper1=Integer.parseInt(stack.pop());
                int result=oper1-oper2;
                stack.push(String.valueOf(result));
            }else if(cur.equals("*")){
                int oper2=Integer.parseInt(stack.pop());
                int oper1=Integer.parseInt(stack.pop());
                int result=oper1*oper2;
                stack.push(String.valueOf(result));
            }else if(cur.equals("/")){
                int oper2=Integer.parseInt(stack.pop());
                int oper1=Integer.parseInt(stack.pop());
                int result=oper1/oper2;
                stack.push(String.valueOf(result));
            }else{
            	stack.push(cur);
            }
        }
        return Integer.parseInt(stack.pop());
    }

    public static void main(String[] args){
        String[] s={"4", "13", "5", "/", "+"};
        System.out.println(new EvaluateReversePolishNotation().evalRPN(s));
    }

}
