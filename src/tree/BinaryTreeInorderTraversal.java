package tree;


import java.util.ArrayList;
import java.util.Stack;
/**
 * 中序遍历的递归和非递归算法
 * @author luo
 *
 */
public class BinaryTreeInorderTraversal {
	public ArrayList<Integer> inorderTraversal(TreeNode root) {

		ArrayList<Integer> list=new ArrayList<Integer>();
		if(root!=null)
			inorder(root,list);
		return list;
	}
	
	public void inorder(TreeNode root,ArrayList<Integer> list){
		if(root!=null){
			inorder(root.left,list);
			list.add(root.val);
			inorder(root.right,list);
		}
	}
	
	public ArrayList<Integer> inorderTraversalIterator(TreeNode root) {

		ArrayList<Integer> list=new ArrayList<Integer>();
		Stack<TreeNode> stack=new Stack<TreeNode>();
		if(root==null)
			return list;
		while(root!=null||!stack.empty()){
			while(root!=null){
				stack.push(root);
				root=root.left;
			}
			root=stack.pop();
			list.add(root.val);
			root=root.right;
		}
		return list;
	}
}
