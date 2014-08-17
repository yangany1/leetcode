package linkedlist;

public class RemoveDuplicatesfromSortedListII {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null)
			return null;
		if (head.next == null)
			return head;
		ListNode l_head = new ListNode(0);
		ListNode new_current = l_head;
		ListNode current = head.next;
		ListNode before = head;
		if (before.val != current.val) {
			new_current.next = new ListNode(before.val);
			new_current = new_current.next;
		}
		while (current != null) {
			if (current.next != null) {
				if (current.val != before.val
						&& current.val != current.next.val) {
					new_current.next = new ListNode(current.val);
					new_current = new_current.next;
				}
			} else {
				if (current.val != before.val) {
					new_current.next = new ListNode(current.val);
					new_current = new_current.next;
				}
			}
			current = current.next;
			before = before.next;
		}
		return l_head.next;
	}

	public static void main(String[] args) {

	}

}
