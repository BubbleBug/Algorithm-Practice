package github.bubble.learn.linkedlist;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = null;
		ListNode newNode = null;
		int v1 = 0;
		int v2 = 0;// 存储节点值
		int n = 0;// 节点和十位上的值
		while (l1 != null || l2 != null) {
			if (l1 == null)
				v1 = 0;
			else
				v1 = l1.vale;
			if (l2 == null)
				v2 = 0;
			else
				v2 = l2.vale;
			int val = (v1 + v2 + n) % 10;// 节点和个位上的值
			n = (v1 + v2 + n) / 10;

			if (head == null) {
				head = new ListNode(val);
				newNode = head;
			} else {
				ListNode curNode = new ListNode(val);
				newNode.next = curNode;
				newNode = curNode;
			}
			if (l1 != null)
				l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;

		}
		if (n == 1) {
			ListNode curNode = new ListNode(n);
			newNode.next = curNode;
			newNode = curNode;
		}
		return head;
	}
}
