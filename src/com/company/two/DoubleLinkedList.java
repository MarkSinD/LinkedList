package com.company.two;

class DoubleLinkedList<T extends Comparable<T>> {

    protected DoubleLinkedListItem<T> start;
    protected DoubleLinkedListItem<T> end;
    public int size;

    /* Constructor */
    public DoubleLinkedList() {
        start = null;
        end = null;
        size = 0;
    }

    public T findFirstItem(){
        if (size == 0) {
            System.out.print("empty\n");
            return null;
        }
        return start.getData();
    }

    public T findLastItem(){
        if (size == 0) {
            System.out.print("empty\n");
            return null;
        }
        return end.getData();
    }

    public DoubleLinkedListItem<T> getFirst(){
        return start;
    }

    public DoubleLinkedListItem<T> getLast(){
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
    public void insertAtStart(T val) {
        DoubleLinkedListItem<T> nptr = new DoubleLinkedListItem<>(val);
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
    public void insertAtEnd(T val) {
        DoubleLinkedListItem<T> nptr = new DoubleLinkedListItem<T>(val);

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

    public void insertAtPos(T val, int pos) {
        DoubleLinkedListItem<T> nptr = new DoubleLinkedListItem<T>(val);
        if(pos == 1){
            insertAtStart(val);
        }

        DoubleLinkedListItem<T> ptr = start;
        for (int i = 1; i <= size; i++) {
            if (i == pos) {
                DoubleLinkedListItem<T> tmp = ptr.getNext();
                ptr.setNext(nptr);
                nptr.setPrev(ptr);
                nptr.setNext(tmp);
                tmp.setPrev(nptr);
                System.out.println();
            }
            ptr = ptr.getNext();
        }
        size++;
    }

    /* Function to insert element at position */
    public void insertAfter(T valAfter, T data) {
        DoubleLinkedListItem<T> nptr = new DoubleLinkedListItem<T>(valAfter);

        DoubleLinkedListItem<T> ptr = start;
        for (int i = 1; i <= size; i++) {
            if(i == size && ptr.data == valAfter){
                insertAtEnd(data);
                size++;
                return;
            }
            else if (ptr.getNext() != null && ptr.data == valAfter) {
                DoubleLinkedListItem<T> tmp = ptr.getNext();
                ptr.setNext(nptr);
                nptr.setPrev(ptr);
                nptr.setNext(tmp);
                tmp.setPrev(nptr);
                size++;
                return;
            }
            else if (i == size){
                System.out.println("Invalid insert");
                return;
            }
            ptr = ptr.getNext();
        }
    }

    public void insertBefore(T valBefore, T data) {
        DoubleLinkedListItem<T> nptr = new DoubleLinkedListItem<T>(data);

        DoubleLinkedListItem<T> ptr = start;
        for (int i = 1; i <= size; i++) {
            System.out.println("ptr.data data " + ptr.data + " " + valBefore);

            if(i == 1 && ptr.data == valBefore){
                insertAtStart(data);
                size++;
                return;
            }
            else if (ptr.getPrev() != null && ptr.data == valBefore) {
                DoubleLinkedListItem<T> tmp = ptr.getPrev();
                tmp.setNext(nptr);
                nptr.setNext(ptr);
                ptr.setPrev(nptr);
                nptr.setPrev(tmp);
                size++;
                return;
            }
            else if(i == size){
                System.out.println("Invalid insert");
                return;
            }
            ptr = ptr.getNext();
        }
    }

    public void insertBeforeByItem(DoubleLinkedListItem<T> ptr, T data){
        DoubleLinkedListItem<T> nptr = new DoubleLinkedListItem<>(data);

        if(ptr.getPrev() == null){
            insertAtStart(data);
        }
        else {
            DoubleLinkedListItem<T> tmp = ptr.getPrev();
            tmp.setNext(nptr);
            nptr.setNext(ptr);
            ptr.setPrev(nptr);
            nptr.setPrev(tmp);
        }
    }

    public void insertAfterByItem(DoubleLinkedListItem<T> ptr, T data){
        DoubleLinkedListItem<T> nptr = new DoubleLinkedListItem<>(data);

        if(ptr.getNext() == null){
            insertAtEnd(data);
        }
        else {
            DoubleLinkedListItem<T> tmp = ptr.getNext();
            ptr.setNext(nptr);
            nptr.setNext(tmp);
            tmp.setPrev(nptr);
            nptr.setPrev(ptr);
        }
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

        DoubleLinkedListItem<T> ptr = start.getNext();

        for (int i = 2; i <= size; i++) {
            if (i == pos) {
                DoubleLinkedListItem<T> p = ptr.getPrev();
                DoubleLinkedListItem<T> n = ptr.getNext();
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

        DoubleLinkedListItem<T> ptr = start;
        System.out.print(start.getData() + " <-> ");
        ptr = start.getNext();

        while (ptr.getNext() != null) {
            System.out.print(ptr.getData() + " <-> ");
            ptr = ptr.getNext();
        }
        System.out.print(ptr.getData() + "\n");
    }
}
