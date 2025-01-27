package com.proj;

public class LinkedList {

    // TODO: Node head - это тоже поле, должно быть private
    public Node head;

    // TODO: я запрещу тебе enter'ом пользоваться
    public LinkedList() {

        head = null;


    }

    // TODO: Давай договоримся что это я не видел, public class если пишешь, то создавать отдельный файл для этого надо.
    // TODO: Забудь что можно создавать класс внутри класса, это нужно в 1% случаях и не в ближайшие 3 года точно
    public class Node {

        // TODO: где модицифкаторы доступа? Объявляешь поле - сразу private пишешь, а потом уже начинаешь думать
        Cycle data;
        int id;
        Node next;


        public Node(int id, Cycle data) {

            this.id = id;
            this.data = data;
            next = null;

        }
    }


    // TODO: Далее во всех методах жесткая ошибка связанная с доступом к данным.
    // TODO: Вынеси Node в отдельный файл и сделай приватные поля, ты сразу увидишь о какой ошибке я говорю


    public void add(Cycle data) {

        // TODO: Ну указывать 0, тк не знаешь пока айдишник - это сомнительно. Можешь написать конструктор без id, который только data принимает, а айдишник потом сетить отдельно, когда посчитаешь его
        Node newNode = new Node(0, data);

        // TODO: ниже убрал лишние пробелы, но некоторые оставил - допустимо так, если хочешь разделить визуально

        if (head == null) {
            head = newNode;
            head.id = 1;
        } else {
            Node current = head;
            int maxId = head.id; // переменные отделил от следующего цикла

            while (current.next != null) {
                current = current.next;
                maxId = Math.max(maxId, current.id);
            }

            current.next = newNode; // от цикла тоже отступил, чтобы визуально его отгородить от последующих вычислений
            newNode.id = maxId + 1;
        }
    }


    // TODO: Подумай что будет если в списке 1 элемент и ты его удаляешь
    // TODO: как будто здесь айдишники слетят на единицу после удаляемого элемента
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

            // TODO: вот здесь NPE (Null pointer exception) ошибка, у тебя previous пустое, а ты к нему обращаешься. Обращение к пустому объекту (Пизда если 1 элемент в списке и его же удаляешь)
            previous.next = null;

        }

    }

    public void print() {

        Node current = head;


        if (head != null) {
            System.out.println("ID: " + head.id);
            System.out.println(head.data);
        }

        // TODO: тебе опять идея подсказывает что NPE может вылететь
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
