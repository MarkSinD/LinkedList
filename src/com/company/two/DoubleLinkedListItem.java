package com.company.two;

class DoubleLinkedListItem {

    protected int data;
    protected DoubleLinkedListItem next, prev;

    /* Constructor */
    public DoubleLinkedListItem() {
        next = null;
        prev = null;
        data = 0;
    }

    /* Constructor */
    public DoubleLinkedListItem(int d, DoubleLinkedListItem n, DoubleLinkedListItem p) {
        data = d;
        next = n;
        prev = p;
    }

    /* Function to set link to next node */

    public void setNext(DoubleLinkedListItem n) {
        next = n;
    }

    /* Function to set link to previous node */

    public void setPrev(DoubleLinkedListItem p) {
        prev = p;
    }

    /* Funtion to get link to next node */

    public DoubleLinkedListItem getNext() {
        return next;
    }

    /* Function to get link to previous node */

    public DoubleLinkedListItem getPrev() {
        return prev;
    }

    /* Function to set data to node */

    public void setData(int d) {
        data = d;
    }

    /* Function to get data from node */
    public int getData() {
        return data;
    }
}
