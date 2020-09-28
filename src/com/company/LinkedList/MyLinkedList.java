
package com.company.LinkedList;

/*
SUCCESS!!
This was definitely the hardest leetcode question so far. This website helped a lot: http://www.pythontutor.com/java.html#mode=edit
I'm pretty happy with myself after this.

        MyLinkedList j = new MyLinkedList();
        j.addAtHead(4);
        j.get(1);
        j.addAtHead(1);
        j.addAtHead(5);
        j.deleteAtIndex(3);
        j.addAtHead(7);
        j.get(3);
        j.get(3);
        j.get(3);
        j.addAtHead(1);
        j.deleteAtIndex(4);
*/

public class MyLinkedList {

    private Node head;
    private Node tail;
    private int size = 0;

    public MyLinkedList(){
    }


/** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */

    public int get(int index) {
        if(index>=size){
            System.out.println("int at index "+index + " is invalid");
            this.printLinkedList();

            return -1;
        }
        Node cursor = head;
        for (int i = 0; i < index; i++) {
            cursor = cursor.next;
        }
        System.out.println("int at index "+index + " is "+cursor.value);
        this.printLinkedList();
        return cursor.value;
    }


/** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if(size == 0){
//          newNode.next = null;
            head = newNode;
            tail = newNode;
            System.out.println("head and tail created");
        } else {
            newNode.next = head;
            head = newNode;

            System.out.println("new head");
        }
        size++;
        this.printLinkedList();
    }

/** Append a node of value val to the last element of the linked list. */

    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if(size == 0){
//          newNode.next = null;
            head = newNode;
            tail = newNode;
            System.out.println("head and tail created");
        } else {
            tail.next = newNode;
            tail = newNode;
            System.out.println("new tail");
        }
        size++;
        this.printLinkedList();
    }


/** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */

    public void addAtIndex(int index, int val) {
        if(index>size){
            return;
        }else if(index == size){
            addAtTail(val);
            return;
        }else if(index == 0){
            addAtHead(val);
            return;
        }
        Node newNode = new Node(val);

        Node cursor = head;
        for (int i = 0; i < index-1; i++) {
            cursor = cursor.next;
        }
        newNode.next = cursor.next;
        cursor.next = newNode;
        size++;

        System.out.println("added "+val+" at index ");
        this.printLinkedList();
    }


/** Delete the index-th node in the linked list, if the index is valid. */

    public void deleteAtIndex(int index) {
        if(index>=size){

            System.out.println("index greater than size");
            this.printLinkedList();
            return;
        }else if(index == 0){
            head = head.next;
            size--;

            System.out.println("deleted at index "+index);
            this.printLinkedList();
            return;
        }
        Node cursor = head;
        while (index !=1 ) {
            cursor = cursor.next;
            index--;
        }
        if(tail == cursor.next){
            tail = cursor;
        }
        cursor.next = cursor.next.next;
        size--;

        System.out.println("deleted at index "+index);
        this.printLinkedList();
    }

    class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void printLinkedList(){
        Node temp = head;
        for(int i = 0; i < size ; i++){
            System.out.print(temp.value+ "  ");
            temp = temp.next;
        }
        System.out.println();
    }
}


