package com.proj;

public class Cyclepark {

    // TODO: это ты чо исполнил? Где модицификатор доступа? И также выделение памяти слишком рано. Инициализация объекта в конструкторе.

    /* Смотри
    * private LinkedList list;
    *
    * public Cyclepark () {
    *   list = new LinkedList();
    * }
    * */
    LinkedList list = new LinkedList();
    // Здесь наоборот надо строчку пустую, чтобы разделить поля и функции
    public void addNewCycle(int weightCycle, int maxWeight, String color) {
//
        Cycle cycle = new Cycle(weightCycle, maxWeight, color);
        list.add(cycle);
//
    }

    public void deleteCycle(int id) {
//
        list.delete(id);
//
    }

    public void printCycles() {
//
        list.print();
//
    }

    public void updateCycle(int id, int weightCycle, int maxWeight, String color) {
//
        Cycle cycle = new Cycle(weightCycle, maxWeight, color);
        list.update(id, cycle);
//
    }
//

}
