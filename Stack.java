package com.company;

public class Stack {

    Node top = null;

    void push(char data) {
        if(top == null) {
            top = new Node(data);
        } else {
            Node node = new Node(data);
            node.next = top;
            top = node;
        }
    }

    char show() {
        if(top != null) {
            char ch = top.data;
            return ch;
        }
        return '0';
    }

    char pop() {
        if(top != null) {
            char ch = top.data;
            top = top.next;
            return ch;
        }
        return '0';
    }

    boolean isEmpty() {
        return top == null;
    }

    class Node {
        Node next;
        char data;
        Node(char data) {
            this.data = data;
            next = null;
        }
    }
}