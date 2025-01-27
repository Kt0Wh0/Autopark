package com.proj;

public class LinkedList {

    private Node head;

    public LinkedList() {
        head = null;
    }

    public void add(Cycle data) {

        Node newNode = new Node(0, data);

        if (head == null) {
            head = newNode;
            head.setId(1);
        } else {
            Node current = head;
            int maxId = head.getId();

            while (current.getNext() != null) {
                current = current.getNext();
                maxId = Math.max(maxId, current.getId());
            }

            current.setNext(newNode);
            newNode.setId(maxId + 1);
        }
    }

    public void delete(int id) {

        Node current = head;
        Node previous = null;

        if (head == null) {
            System.out.println("Нечего удалять");
        } else {
            while (current.getNext() != null) {

                if (current.getId() == id) {

                    if (current == head) {
                        head = current.getNext();

                    } else {
                        previous.setNext(current.getNext());
                    }
                }
                System.out.println("Не смогли удалить");
                previous = current;
                current = current.getNext();
            }
            if (current.getId() == id) {
                if (current == head) {
                    head = null;
                } else {
                    previous.setNext(null);
                }
            }
        }
    }

    public void print() {

        Node current = head;

        if (head == null) {
            System.out.println("Велопарк пуст");
        } else {
            System.out.println("ID: "+ current.getId() + "\n" + current.getData());
            while (current.getNext() != null) {
                current = current.getNext();
                System.out.println("ID: "+ current.getId() + "\n" + current.getData());
            }
        }
    }

    public void update(int id, Cycle data) {
        Node current = head;

        while (current.getNext() != null) {

            if (current.getId() == id) {
                current.setData(data);
            }

            current = current.getNext();

        }

        if (current.getId() == id) {
            current.setData(data);
        }

    }
}
