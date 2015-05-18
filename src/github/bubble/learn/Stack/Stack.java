package github.bubble.learn.Stack;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by wangshuang on 2015/5/18.
 *
 *  A generic stack, implemented using a singly-linked list.
 *  Each stack element is of type Item.
 *
 */
public class Stack<Item> implements Iterable<Item> {
    private Node first;
    private int N;
    public class Node{
        Item item;
        Node next;
    }
    public Stack() {
       first = null;
       N = 0;
    }
    //adds the item to this stack
    public void push(Item item){
        Node node=first;
        first=new Node();
        first.item=item;
        first.next=node;
        N++;
    }
    //delete first node
    public Item pop(){
        Item item=first.item;
        first=first.next;
        N--;
        return item;
    }

    public boolean isEmpty(){
        return N==0;
    }

    public int size(){
        return N;
    }

    public Item peek(){
        if(isEmpty())throw new NoSuchElementException("Stack underflow.");
        return first.item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }
    private class ListIterator implements Iterator<Item>{
        private  Node current=first;
        @Override
        public boolean hasNext() {
            return current!=null;
        }

        @Override
        public Item next() {
            if(!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }


}
