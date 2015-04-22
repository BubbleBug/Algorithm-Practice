package github.bubble.learn.linkedlist;

/**
 * Created by wangshuang on 2015/4/20.
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 */
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1,ListNode l2){
        if(l1==null && l2==null)return null;
        if(l1==null)return l2;
        if(l2==null)return l1;
        ListNode node=new ListNode(0);
        ListNode curnode=node;
        while (l1!=null && l2!=null){
            if(l1.vale<l2.vale){
                curnode.next=l1;
                l1=l1.next;
            }else {
                curnode.next=l2;
                l2=l2.next;
            }
            curnode=curnode.next;
        }
        if(l2!=null)curnode.next=l2;
        if(l1!=null)curnode.next=l1;
        return node.next;
    }
}
