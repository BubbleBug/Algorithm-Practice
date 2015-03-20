package github.bubble.learn.linkedlist;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import github.bubble.learn.linkedlist.LinkedList;
import github.bubble.learn.linkedlist.ListNode;
import github.bubble.learn.linkedlist.Remove;

public class RemoveMiddleNodeTest {
	private Remove remove;
	private LinkedList linkedList;

	@Before
	public void setUp() {
		linkedList = new LinkedList();
		remove = new Remove();
	}

	@Test
	public void testRemoveNthNodeLostList() {

	}

	@Test
	public void testRemoveMiddleNodeFromNullList() {
		ListNode result = remove.removeMiddleNode(null);
		assertNull(result);
	}

	@Test
	public void testRemoveMiddleNodeFromSingleItemList() {
		ListNode head = linkedList.CreateIncList(1);
		ListNode result = remove.removeMiddleNode(head);
		assertNull(result);
	}

	@Test
	public void testRemoveMiddleNodeFromTwoItemList() {
		ListNode head = linkedList.CreateIncList(2);
		ListNode result = remove.removeMiddleNode(head);
		assertSame(head, result);
		assertNull(result.next);
	}

	@Test
	public void testRemoveMiddleNodeFromThreeItemList() {
		linkedList.addNodes(1,2,3);
		ListNode head = linkedList.GetHead();
		ListNode result = remove.removeMiddleNode(head);
		assertSame(head, result);
		assertEquals(3,result.next.vale);
	}

	@Test
	public void testRemoveMiddleNodeFromItemsList() {
		ListNode head = linkedList.CreateIncList(9);
		ListNode result = remove.removeMiddleNode(head);
		ListNode curNode = result;
		while(curNode!=null)
		{
			assertFalse(5==curNode.vale);
			curNode=curNode.next;
		}
	}
	@Test
	public void testRemoveMiddleNodeFromMoreItemsList() {
		ListNode head = linkedList.CreateIncList(999999);
		ListNode result = remove.removeMiddleNode(head);
		ListNode curNode = result;
		while(curNode!=null)
		{
			assertFalse(500000==curNode.vale);
			curNode=curNode.next;
		}
	}
}
