package github.bubble.learn.linkedlist;

public class RemoveDuplicatesNodes {

	// Given a sorted linked list, delete all duplicates such that each element
	// appear only once.
	public ListNode deleteDuplicates1(ListNode head) {
		if (head == null)
			return null;
		ListNode cur = head;
		ListNode pre = head.next;

		while (pre != null) {
			if (cur.vale == pre.vale)
				cur.next = pre.next;
			else
				cur = cur.next;
			pre = pre.next;
		}

		return head;

	}
}
