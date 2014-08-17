package linkedlist;

public class ReverseNodesinkGroup {
	public ListNode reverseKGroup(ListNode head, int k) {
		if(k==1)
			return head;
		if(head==null||head.next==null)
			return head;
		ListNode dummy=new ListNode(0);
		dummy.next=head;
		
		for(ListNode prev=dummy,end=head;end!=null;end=prev.next){
			for(int i=1;i<k&&end!=null;i++){
				end=end.next;
			}
			if(end==null)
				break;
			prev=reverse(prev,prev.next,end);
		}
		return dummy.next;
		
	}
	
	public ListNode reverse(ListNode prev,ListNode begin,ListNode end){
		ListNode end_next=end.next;
		ListNode p=begin;
		ListNode cur=p.next;
		ListNode next=cur.next;
		for(;cur!=end_next;p=cur,cur=next,next=(next!=null)?next.next:null){
			cur.next=p;
		}
		begin.next=end_next;
		prev.next=end;
		return begin;
	}
}
