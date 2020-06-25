package com.company;


import com.company.LinkedList.MyLinkedList;
import com.company.arrayandstring.LongestCommonPrefix;
import com.company.arrayandstring.ReverseString;

public class Main {

    public static void main(String[] args) {
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

    }
}
