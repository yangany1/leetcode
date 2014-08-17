package tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/**
 * 层序遍历
 * @author luo
 *
 */
public class BinaryTreeLevelOrderTraversal {
	//迭代的方法
	public List<List<Integer>> levelOrder(TreeNode root) {

		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if (root == null) {
			return list;
		}
		Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
		int count = 1;
		queue.offer(root);
		List<Integer> currentLevel = new ArrayList<Integer>();
		while (queue.size() != 0) {
			int newcount = 0;
			currentLevel = new ArrayList<Integer>();
			for (int i = 0; i < count; i++) {
				TreeNode t = queue.poll();
				currentLevel.add(t.val);
				if (t.left != null) {
					queue.offer(t.left);
					newcount++;
				}
				if (t.right != null) {
					queue.offer(t.right);
					newcount++;
				}
			}
			list.add(currentLevel);
			count = newcount;
		}
		return list;
	}
	
	//递归的方法
	public List<List<Integer>> levelOrderRecursive(TreeNode root) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		traverse(root,1,list);
		return list;
	}
	
	public void traverse(TreeNode root,int level,List<List<Integer>> list){
		if(root==null)
			return;
		if(level>list.size())
			list.add(new ArrayList<Integer>());
		list.get(level-1).add(root.val);
		traverse(root.left,level+1,list);
		traverse(root.right,level+1,list);
		
	}
	
	public static void main(String[] args){
		TreeNode t1=new TreeNode(1);
		TreeNode t2=new TreeNode(2);
		TreeNode t3=new TreeNode(3);
		t1.left=t2;
		t1.right=t3;
		List<List<Integer>> list=new BinaryTreeLevelOrderTraversal().levelOrderRecursive(t1);
		System.out.println(Arrays.toString(list.toArray()));
		
		
		
	}
}
