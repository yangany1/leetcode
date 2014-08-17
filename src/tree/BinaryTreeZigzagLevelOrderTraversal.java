package tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if (root == null) {
			return list;
		}
		Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
		int count = 1;
		queue.offer(root);
		List<Integer> currentLevel = new LinkedList<Integer>();
		boolean leftToRight=true;
		while (queue.size() != 0) {
			int newcount = 0;
			currentLevel = new LinkedList<Integer>();
			for (int i = 0; i < count; i++) {
				TreeNode t = queue.poll();
				if(leftToRight)
					currentLevel.add(t.val);
				else
					currentLevel.add(0,t.val);
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
			leftToRight=!leftToRight;
		}
		return list;
	}
}
