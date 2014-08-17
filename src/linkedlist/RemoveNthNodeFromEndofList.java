package linkedlist;

public class RemoveNthNodeFromEndofList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if(head==null|head.next==null)
			return null;
		ListNode next=head;
		while((n--)!=0){
			if(next.next!=null)
				next=next.next;
			else{
				head=head.next;
				return head;
			}
		}
		
		ListNode t=head;
		while(next.next!=null){
			next=next.next;
			t=t.next;
		}
		t.next=t.next.next;
		return head;
	}
}
