package com.proj;

public class Node {
    private Cycle data;
    private int id;
    private Node next;

    public Node(int id, Cycle data) {

        this.id = id;
        this.data = data;
        next = null;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setData(Cycle data) {
        this.data = data;
    }

    public Cycle getData() {
        return data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }




}
