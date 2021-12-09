package com.company.two;

class DoubleLinkedList {

    protected DoubleLinkedListItem start;
    protected DoubleLinkedListItem end;
    public int size;

    /* Constructor */
    public DoubleLinkedList() {
        start = null;
        end = null;
        size = 0;
    }

    public Integer findFirstItem(){
        if (size == 0) {
            System.out.print("empty\n");
            return null;
        }
        return start.getData();
    }

    public Integer findLastItem(){
        if (size == 0) {
            System.out.print("empty\n");
            return null;
        }
        return end.getData();
    }

    public DoubleLinkedListItem getFirst(){
        return start;
    }

    public DoubleLinkedListItem getLast(){
        return end;
    }

    /* Function to check if list is empty */
    public boolean isEmpty() {
        return start == null;
    }

    /* Function to get size of list */
    public int getSize() {
        return size;
    }

    /* Function to insert element at begining */

    public void insertAtStart(int val) {
        DoubleLinkedListItem nptr = new DoubleLinkedListItem(val, null, null);
        if (start == null) {
            start = nptr;
            end = start;
        } else {
            start.setPrev(nptr);
            nptr.setNext(start);
            start = nptr;
        }
        size++;
    }

    /* Function to insert element at end */

    public void insertAtEnd(int val)

    {

        DoubleLinkedListItem nptr = new DoubleLinkedListItem(val, null, null);

        if (start == null) {
            start = nptr;
            end = start;
        } else {
            nptr.setPrev(end);
            end.setNext(nptr);
            end = nptr;
        }
        size++;
    }

    /* Function to insert element at position */

    public void insertAtPos(int val, int pos) {
        DoubleLinkedListItem nptr = new DoubleLinkedListItem(val, null, null);
        if (pos == 1) {
            insertAtStart(val);
            return;
        }

        DoubleLinkedListItem ptr = start;
        for (int i = 2; i <= size; i++) {
            if (i == pos) {
                DoubleLinkedListItem tmp = ptr.getNext();
                ptr.setNext(nptr);
                nptr.setPrev(ptr);
                nptr.setNext(tmp);
                tmp.setPrev(nptr);
            }
            ptr = ptr.getNext();
        }
        size++;
    }

    /* Function to delete node at position */

    public void deleteAtPos(int pos) {
        if (pos == 1) {
            if (size == 1) {
                start = null;
                end = null;
                size = 0;
                return;
            }

            start = start.getNext();
            start.setPrev(null);
            size--;
            return;
        }

        if (pos == size) {
            end = end.getPrev();
            end.setNext(null);
            size--;
        }

        DoubleLinkedListItem ptr = start.getNext();

        for (int i = 2; i <= size; i++) {
            if (i == pos) {
                DoubleLinkedListItem p = ptr.getPrev();
                DoubleLinkedListItem n = ptr.getNext();
                p.setNext(n);
                n.setPrev(p);
                size--;
                return;
            }

            ptr = ptr.getNext();
        }
    }

    /* Function to display status of list */
    public void display() {
        System.out.print("\nDoubly Linked List = ");

        if (size == 0) {
            System.out.print("empty\n");
            return;
        }

        if (start.getNext() == null) {
            System.out.println(start.getData());
            return;
        }

        DoubleLinkedListItem ptr = start;
        System.out.print(start.getData() + " <-> ");
        ptr = start.getNext();

        while (ptr.getNext() != null) {
            System.out.print(ptr.getData() + " <-> ");
            ptr = ptr.getNext();
        }
        System.out.print(ptr.getData() + "\n");
    }
}
