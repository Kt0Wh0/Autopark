package com.proj;

public class LinkedList {

    public Node head;

    public LinkedList() {

        head = null;
    }

    private class Node {

        Cycle data;
        Node next;   // не совсем понимаю как работает такой тип данных. он как бы принимает тип данных данного класса или как?


        public Node(Cycle data) {

            this.data = data;
            next = null;

        }
    }



    public void add(Cycle data) {

        Node newNode = new Node(data);
        Node current = head;

        if (head == null) {

            head = newNode;

        } else {
            //то что выше, ну если head = нул понятно(хотя про сам head было бы славно подробнее узнать)
            //то что ниже, опишу как понял. мы пробегаемся, по всем объекта(?) если следующий не равен нулю то меняет текущий на следующий
            //дальше мы просто следующему объекту присваиваем необходимое значение
            //так же я не совсем понял про next, это по сути просто метод? но если это просто метод то зачем мы ему даем тип данных Node(если я правильно понял что это)
            while (current.next != null) {

                current = current.next;

            }

            current.next = newNode;
        }
    }

    public void delete(Cycle data) {

        Node current = head;
        Node previous = null;

        while (current.next != null) {

            if (current.data == data) {

                if (current == head) {

                    head = current.next;

                } else {

                    previous.next = current.next;

                }
            }

            previous = current;
            current = current.next;
        }

    }

    public void print() {

        Node current = head;


        if (head != null) {
            System.out.println("СУЧКА");
            System.out.println(head.data);
        }

        while (current.next != null) {
            current = current.next;
            System.out.println(current.data);
        }

    }



}
