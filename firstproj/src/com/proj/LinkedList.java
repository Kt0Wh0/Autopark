package com.proj;

public class LinkedList {

    public Node head;

    public LinkedList() {

        head = null;


    }


    public class Node {

        Cycle data;
        int id;
        Node next;


        public Node(int id, Cycle data) {

            this.id = id;
            this.data = data;
            next = null;

        }
    }



    public void add(Cycle data) {

        Node newNode = new Node(0, data);

        if (head == null) {

            head = newNode;
            head.id = 1;

        } else {

            Node current = head;
            int maxId = head.id;

            while (current.next != null) {

                current = current.next;
                maxId = Math.max(maxId, current.id);

            }

            current.next = newNode;
            newNode.id = maxId + 1;

        }

    }

    public void delete(int id) {

        Node current = head;
        Node previous = null;

        while (current.next != null) {

            if (current.id == id) {

                if (current == head) {
                    System.out.println("Привет1");
                    head = current.next;

                } else {
                    System.out.println("Привет2");
                    previous.next = current.next;

                }
            }
            System.out.println("Не смогли удалить");
            previous = current;
            current = current.next;
        }
        if (current.id == id) {

            previous.next = null;

        }

    }

    public void print() {

        Node current = head;


        if (head != null) {
            System.out.println("ID: " + head.id);
            System.out.println(head.data);
        }

        while (current.next != null) {
            current = current.next;
            System.out.println("ID: "+ current.id + "\n" + current.data);
        }

    }

    public void update(int id, Cycle data) {
        Node current = head;

        while (current.next != null) {

            if (current.id == id) {
                current.data = data;
            }

            current = current.next;

        }

        if (current.id == id) {
            current.data = data;
        }

    }



}
