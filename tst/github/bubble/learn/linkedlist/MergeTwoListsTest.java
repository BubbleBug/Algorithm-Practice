package github.bubble.learn.linkedlist;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class MergeTwoListsTest {
    MergeTwoLists mergeTwoLists;
    @Before
    public void setUp() throws Exception {
        mergeTwoLists=new MergeTwoLists();
    }

    @Test
    public void testMergeTwoListsOfTwoNullList() throws Exception {
        ListNode listNode=mergeTwoLists.mergeTwoLists(null,null);
        assertNull(listNode);
    }

    @Test
    public void testMergeTwoListsOfOneNullList() throws Exception {
        ListNode listNode=mergeTwoLists.mergeTwoLists(new ListNode(1),null);
        assertNotNull(listNode);
        assertEquals(1,listNode.vale);
    }

    @Test
    public void testMergeTwoListsOfNotNullList() throws Exception {
        ListNode listNode=mergeTwoLists.mergeTwoLists(new ListNode(2),new ListNode(1));
        assertNotNull(listNode);
        assertEquals(1,listNode.vale);
        assertEquals(2,listNode.next.vale);
    }

    @Test
    public void testMergeTwoLists() throws Exception {
        LinkedList l1=new LinkedList();
        l1.addNodes(1,4,3,7);
        LinkedList l2=new LinkedList();
        l2.addNodes(2,9,3,0);
        LinkedList l3=new LinkedList();
        l3.addNodes(1,2,4,3,7,9,3,0);
        ListNode Node=l3.GetHead();
        ListNode listNode=mergeTwoLists.mergeTwoLists(l1.GetHead(),l2.GetHead());
        assertNotNull(listNode);
        while (listNode!=null){
            assertEquals(Node.vale,listNode.vale);
            Node=Node.next;
            listNode=listNode.next;
        }
    }
}