package github.bubble.learn.linkedlist;

import static org.junit.Assert.*;
import github.bubble.learn.linkedlist.LinkedList;
import github.bubble.learn.linkedlist.ListNode;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void testCreateNullIncList() {
		LinkedList linkedList=new LinkedList();
		assertNull(linkedList.GetHead());
	}
	@Test
	public void testCreateOneIncList() {
		LinkedList linkedList=new LinkedList();
		linkedList.CreateIncList(1);
		ListNode head=linkedList.GetHead();
		assertNull(head.next);
		assertNull(linkedList.GetPrev());
		assertEquals(head,linkedList.GetTail());
		assertEquals(1,linkedList.GetHead().vale);
		assertListLength(head,1);
	}
	
	@Test
	public void testCreateTwoIncList() {
		LinkedList linkedList=new LinkedList();
		linkedList.CreateIncList(2);
		ListNode head=linkedList.GetHead();
		assertNull(linkedList.GetTail().next);
		assertEquals(head.next,linkedList.GetTail());
		assertEquals(head,linkedList.GetPrev());
		assertListLength(head,2);
	}
	
	
	@Test
	public void testCreateThreeIncList() {
		LinkedList linkedList=new LinkedList();
		linkedList.CreateIncList(3);
		ListNode head=linkedList.GetHead();
		assertNull(linkedList.GetTail().next);
		assertEquals(head.next.next,linkedList.GetTail());
		assertEquals(head.next,linkedList.GetPrev());
		assertEquals(linkedList.GetTail(),linkedList.GetPrev().next);
		assertListLength(head,3);
	}
	@Test
	public void testCreateMoreIncList() {
		LinkedList linkedList=new LinkedList();
		linkedList.CreateIncList(1000000);
		ListNode head=linkedList.GetHead();
		assertListLength(head,1000000);
	}
	
	@Test
	public void testAddOneNodeInList() {
		LinkedList linkedList=new LinkedList();
		linkedList.addNode(1);
		ListNode head=linkedList.GetHead();
		assertNull(head.next);
		assertNull(linkedList.GetPrev());
		assertEquals(head,linkedList.GetTail());
		assertListLength(head,1);
	}
	
	@Test
	public void testAddTwoNodesInList() {
		LinkedList linkedList=new LinkedList();
		linkedList.addNodes(1,2);
		ListNode head=linkedList.GetHead();
		assertNull(linkedList.GetTail().next);
		assertEquals(head.next,linkedList.GetTail());
		assertEquals(head,linkedList.GetPrev());
		assertListLength(head,2);
	}
	
	@Test
	public void testAddThreeNodesInList() {
		LinkedList linkedList=new LinkedList();
		linkedList.addNodes(1,2,3);
		ListNode head=linkedList.GetHead();
		assertNull(linkedList.GetTail().next);
		assertEquals(head.next.next,linkedList.GetTail());
		assertEquals(head.next,linkedList.GetPrev());
		assertEquals(linkedList.GetTail(),linkedList.GetPrev().next);
		assertListLength(head,3);
	}
	
	
	
	private void assertListLength(final ListNode head,final int expectedLength)
	{
		int length=0;
		ListNode currentNode=head;
		
		while(currentNode!=null)
		{
			length++;
			currentNode=currentNode.next;
		}
		assertEquals(length,expectedLength);
	}

}
