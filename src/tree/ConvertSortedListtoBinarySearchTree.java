package tree;

import linkedlist.ListNode;

public class ConvertSortedListtoBinarySearchTree {
	public TreeNode sortedListToBST(ListNode head) {
		return rec(head, null);
	}

	public static TreeNode rec(ListNode start, ListNode end) {
		if (start == end) {
			return null;
		}
		// 一次遍历找到中点的方法：快慢指针
		ListNode mid = start; // 该指针最终会指向中点
		ListNode probe = start; // 探针最终会到达end
		while (probe != end && probe.next != end) { // 探针完成搜索，注意停止条件是和end比较而不是和null比！
			mid = mid.next;
			probe = probe.next.next;
		}

		TreeNode root = new TreeNode(mid.val);
		root.left = rec(start, mid);
		root.right = rec(mid.next, end);
		return root;
	}
}
