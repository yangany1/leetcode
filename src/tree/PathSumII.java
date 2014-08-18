package tree;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if (root == null)
			return list;
		List<Integer> currentList = new ArrayList<Integer>();
		pathRec(root, sum, list, currentList);
		return list;
	}

	public void pathRec(TreeNode root, int sum, List<List<Integer>> list,
			List<Integer> currentList) {
		if (root == null)
			return;
		if (root.left == null && root.right == null && root.val == sum) {
			List<Integer> newList = new ArrayList<Integer>();
			newList.addAll(currentList);
			newList.add(root.val);
			list.add(newList);
		}
		currentList.add(root.val);
		pathRec(root.left, sum - root.val, list, currentList);
		pathRec(root.right, sum - root.val, list, currentList);
		currentList.remove(currentList.size() - 1);

	}
}
