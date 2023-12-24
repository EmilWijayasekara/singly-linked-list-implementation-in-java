package com.linkedlistimplementation;

public class LinkedListApplication {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(18);
        list.insert(23);
        list.insert(43);
        list.insertAtStart(12);
        list.insertAt(2,99);

        list.show();
    }
}