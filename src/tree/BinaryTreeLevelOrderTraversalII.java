package tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalII {
	public List<List<Integer>> levelOrder(TreeNode root) {

		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if (root == null) {
			return list;
		}
		Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
		int count = 1;
		queue.offer(root);
		List<Integer> currentLevel = new LinkedList<Integer>();
		while (queue.size() != 0) {
			int newcount = 0;
			currentLevel = new LinkedList<Integer>();
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
			list.add(0,currentLevel);
			count = newcount;
		}
		return list;
	}
}
