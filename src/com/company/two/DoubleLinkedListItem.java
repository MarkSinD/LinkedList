package com.company.two;

class DoubleLinkedListItem<T extends Comparable<T>> {

    protected T data;
    protected DoubleLinkedListItem<T> next = null, prev = null;

    /* Constructor */
    public DoubleLinkedListItem(T t) {
        data = t;
    }

    /* Function to set link to next node */

    public void setNext(DoubleLinkedListItem<T> n) {
        next = n;
    }

    /* Function to set link to previous node */

    public void setPrev(DoubleLinkedListItem<T> p) {
        prev = p;
    }

    /* Funtion to get link to next node */

    public DoubleLinkedListItem<T> getNext() {
        return next;
    }

    /* Function to get link to previous node */

    public DoubleLinkedListItem<T> getPrev() {
        return prev;
    }

    /* Function to set data to node */

    public void setData(T d) {
        data = d;
    }

    /* Function to get data from node */
    public T getData() {
        return data;
    }
}
