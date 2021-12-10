package com.company.two;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* Creating object of linkedList */
        DoubleLinkedList<Integer> list = new DoubleLinkedList();
        System.out.println("Doubly Linked List Test\n");
        char ch;

        /* Perform list operations */

        do {
            System.out.println("\nDoubly Linked List Operations\n");
            System.out.println("1. insert at begining");
            System.out.println("2. insert at end");
            System.out.println("3. insert before");
            System.out.println("4. insert after");
            System.out.println("5. insert at position");
            System.out.println("6. delete at position");
            System.out.println("7. check empty");
            System.out.println("8. get size");
            System.out.println("9. get first item");
            System.out.println("10. get last item");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter integer element to insert");
                    list.insertAtStart(scan.nextInt());
                    break;

                case 2:
                    System.out.println("Enter integer element to insert");
                    list.insertAtEnd(scan.nextInt());
                    break;

                case 3:
                    System.out.println("Enter integer element to insert");
                    int insertNum = scan.nextInt();
                    System.out.println("Enter insert value before");
                    int valBefore = scan.nextInt();
                    list.insertBefore(valBefore, insertNum);
                    break;

                case 4:
                    System.out.println("Enter integer element to insert after");
                    int insertAfter = scan.nextInt();
                    System.out.println("Enter insert value after");
                    int valAfter = scan.nextInt();
                    list.insertAfter(valAfter, insertAfter);
                    break;

                case 5:
                    System.out.println("Enter integer element at position");
                    int data = scan.nextInt();
                    System.out.println("Enter position");
                    int pos = scan.nextInt();
                    if (pos < 1 || pos > list.getSize())
                        System.out.println("Invalid position\n");
                    else
                        list.insertAtPos(data, pos);
                    break;

                case 6:
                    System.out.println("Enter position");
                    int p = scan.nextInt();
                    if (p < 1 || p > list.getSize())
                        System.out.println("Invalid position\n");
                    else
                        list.deleteAtPos(p);
                    break;

                case 7:
                    System.out.println("Empty status = " + list.isEmpty());
                    break;

                case 8:
                    System.out.println("Size = " + list.getSize() + " \n");
                    break;

                case 9:
                    System.out.println("first item = " + list.findFirstItem());
                    break;

                case 10:
                    System.out.println("last item = " + list.findLastItem());
                    break;

                default:
                    System.out.println("Wrong Entry \n ");
                    break;

            }

            /* Display List */
            list.display();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);

        } while (ch == 'Y' || ch == 'y');
    }
}
