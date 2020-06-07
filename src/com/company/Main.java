package com.company;


/**
 * LinkedList.java
 *
 **/



/**
 * Main.java
 *
 **/

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        System.out.println("Current Size of the list is: "+list.getListSize());

        list.insertNode("test1");
        list.insertNode("test2");
        list.insertNode("test3");
        list.insertNode("test4");
        list.insertNode("test5");
        list.insertNode("test6");
        list.insertNode("test7");
        list.printNodes();

        System.out.println();

        System.out.println("Finding item test2 in the Linked list");
        list.findNode("test2");
        System.out.println("Finding item nonExist in the Lineked list");
        list.findNode("nonExist");

        System.out.println();

        System.out.println("Finding item at location 4");
        list.findNodeAt(4);

        System.out.println();
        System.out.println("Finding item at last location ");
        list.findLastNode();

        System.out.println();

        System.out.println("Current Size of the list is: "+list.getListSize());
        System.out.println("Adding test1st at start of the Node");
        list.insertFirst("test1st");
        list.printNodes();

        System.out.println();

        System.out.println("Current Size of the list is: "+list.getListSize());
        System.out.println("Adding testNth at 2nd Location");
        list.insertNth("testNth", 2);
        list.printNodes();

        System.out.println();

        System.out.println("Current Size of the list is: "+list.getListSize());
        System.out.println("Deleting first node");
        list.deleteFirstNode();
        list.printNodes();

        System.out.println();

        System.out.println("Current Size of the list is: "+list.getListSize());
        System.out.println("Deleting last node");
        list.deleteLastNode();
        list.printNodes();

        System.out.println();

        System.out.println("Current Size of the list is: "+list.getListSize());
        System.out.println("Deleting node from 4th location");
        list.deleteNthNode(4);
        list.printNodes();
    }

}

/**
 *  OUTPUT
 *
 *  	Current Size of the list is: 0
 Node test1 is at location 0
 Node test2 is at location 1
 Node test3 is at location 2
 Node test4 is at location 3
 Node test5 is at location 4
 Node test6 is at location 5
 Node test7 is at location 6

 Finding item test2 in the Linked list
 Item test2 was found at location 1 in the linked list
 Finding item nonExist in the Lineked list
 Item nonExist was not found in the Linked list

 Finding item at location 4
 Node item at location 4 is test5

 Finding item at last location
 Node item at last location is test7

 Current Size of the list is: 7
 Adding test1st at start of the Node
 Node test1st is at location 0
 Node test1 is at location 1
 Node test2 is at location 2
 Node test3 is at location 3
 Node test4 is at location 4
 Node test5 is at location 5
 Node test6 is at location 6
 Node test7 is at location 7

 Current Size of the list is: 8
 Adding testNth at 2nd Location
 Node test1st is at location 0
 Node test1 is at location 1
 Node testNth is at location 2
 Node test2 is at location 3
 Node test3 is at location 4
 Node test4 is at location 5
 Node test5 is at location 6
 Node test6 is at location 7
 Node test7 is at location 8

 Current Size of the list is: 9
 Deleting first node
 Node test1 is at location 0
 Node testNth is at location 1
 Node test2 is at location 2
 Node test3 is at location 3
 Node test4 is at location 4
 Node test5 is at location 5
 Node test6 is at location 6
 Node test7 is at location 7

 Current Size of the list is: 8
 Deleting last node
 Node test1 is at location 0
 Node testNth is at location 1
 Node test2 is at location 2
 Node test3 is at location 3
 Node test4 is at location 4
 Node test5 is at location 5
 Node test6 is at location 6

 Current Size of the list is: 7
 Deleting node from 4th location
 Node test1 is at location 0
 Node testNth is at location 1
 Node test2 is at location 2
 Node test3 is at location 3
 Node test5 is at location 4
 Node test6 is at location 5
 *
 **/