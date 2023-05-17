package edu.kis.vh.nursery.list;

/**
 * Linked List implementation for integer values.
 */
public class IntLinkedList {

    /**
     * The value that informs if the Linked List is empty.
     */
    public static final int EMPTY = -1;
    /**
     * The Node at the end of Linked List.
     */
    private Node last;
    /**
     * Temporaty value
     */
    private int i;

    /**
     * Adds given number at the end of Linked List.
     * @param i Number that is added to the Linked List.
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Returns the information if the Linked List is empty.
     * @return The information if the Linked List is empty.
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Returns the information if the Linked List is full.
     * @return The information if the Linked List is full.
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Returns the last element of the Linked List (it doesn't remove it)
     * If the list is empty returns information about it
     * @return The number at the end of Linked List or information that the List is empty
     */
    public int top() {
        if (isEmpty())
            return EMPTY;
        return last.getValue();
    }

    /**
     * Returns the last element of the Linked List and removes it
     * @return The number at the end of Linked List or information that the List is empty
     */
    public int pop() {
        if (isEmpty())
            return EMPTY;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
