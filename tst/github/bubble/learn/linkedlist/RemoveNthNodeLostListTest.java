package github.bubble.learn.linkedlist;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import github.bubble.learn.linkedlist.LinkedList;
import github.bubble.learn.linkedlist.ListNode;
import github.bubble.learn.linkedlist.Remove;

public class RemoveNthNodeLostListTest {
	private Remove remove;
	private LinkedList linkedList;
	
	@Before
	public void setUp() {
		linkedList = new LinkedList();
		remove = new Remove();
	}

	@Test
	public void testRemoveNthNodeLostListFromNullList() {
		ListNode result = remove.removeNthNodeLostList(null,0);
		assertNull(result);
	}
	
	
	@Test
	public void testRemoveFirstNodeLostListFromSingleNodeList() {
		ListNode head = linkedList.CreateIncList(1);
		ListNode result = remove.removeNthNodeLostList(head,1);
		assertNull(result);
	}
	
	@Test
	public void testRemoveFirstNodeLostListFromTwoNodeList() {
		linkedList.addNodes(1,2);
		ListNode head = linkedList.GetHead();
		ListNode result = remove.removeNthNodeLostList(head,1);
		assertSame(head, result);
		assertNull(result.next);
		assertEquals(1,result.vale);
	}
	@Test
	public void testRemoveSecondNodeLostListFromTwoNodeList() {
		linkedList.addNodes(1,2);
		ListNode head = linkedList.GetHead();
		ListNode result = remove.removeNthNodeLostList(head,2);
		assertFalse(head.equals(result));
		assertNull(result.next);
		assertEquals(2,result.vale);
	}
	@Test
	public void testRemoveFirstNodeLostListFromThreeNodeList() {
		linkedList.addNodes(1,2,3);
		ListNode head = linkedList.GetHead();
		ListNode result = remove.removeNthNodeLostList(head,1);
		assertSame(head, result);
		assertNull(result.next.next);
		assertEquals(1,result.vale);
	}
	@Test
	public void testRemoveSecondNodeLostListFromThreeNodesList() {
		linkedList.addNodes(1,2,3);
		ListNode head = linkedList.GetHead();
		ListNode result = remove.removeNthNodeLostList(head,2);
		assertSame(head, result);
		assertNotNull(head.next);
		assertEquals(3,head.next.vale);
	}
	@Test
	public void testRemoveThirdNodeLostListFromThreeNodesList() {
		linkedList.addNodes(1,2,3);
		ListNode head = linkedList.GetHead();
		ListNode result = remove.removeNthNodeLostList(head,3);
		assertFalse(head.equals(result));
		assertEquals(2,result.vale);
		assertNull(result.next.next);
	}
	@Test
	public void testRemoveFirstNodeLostListFromMoreNodesList() {
		ListNode head = linkedList.CreateIncList(1000000);
		ListNode result = remove.removeNthNodeLostList(head,1);
		assertSame(head, result);
		assertNull(linkedList.GetTail().next);
		assertEquals(1,result.vale);
	}

}
