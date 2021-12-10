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
        DoubleLinkedListItem<T> nptr = new DoubleLinkedListItem(val);
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
        DoubleLinkedListItem<T> nptr = new DoubleLinkedListItem(val);

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
        // Создаем элемент
        DoubleLinkedListItem<T> nptr = new DoubleLinkedListItem(val);
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

    public void insertAfter(int val, T data) {
        // Создаем элемент
        DoubleLinkedListItem<T> nptr = new DoubleLinkedListItem(val);

        DoubleLinkedListItem<T> ptr = start;
        for (int i = 1; i <= size; i++) {
            if(i == size && ptr.data == data){
                insertAtEnd(data);
            }
            else if (ptr.data == data) {
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

    public void insertBefore(int valBefore, T data) {
        DoubleLinkedListItem<T> nptr = new DoubleLinkedListItem(valBefore);

        DoubleLinkedListItem<T> ptr = start;
        for (int i = 1; i <= size; i++) {
            System.out.println("ptr.data data " + ptr.data + " " + data);

            if (ptr.data == data) {
                if(i == 1){
                    insertAtStart(data);
                    return;
                }
                DoubleLinkedListItem<T> tmp = ptr.getPrev();
                nptr.setNext(ptr);
                ptr.setPrev(nptr);
                nptr.setPrev(tmp);
                nptr.setNext(nptr);
            }
            else {
                System.out.println("Invalid insert");
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
