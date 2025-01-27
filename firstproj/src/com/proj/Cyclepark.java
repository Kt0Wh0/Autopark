package com.proj;

public class Cyclepark {
    LinkedList list = new LinkedList();
    public void addNewCycle(int weightCycle, int maxWeight, String color) {

        Cycle cycle = new Cycle(weightCycle, maxWeight, color);
        list.add(cycle);

    }

    public void deleteCycle(int id) {

        list.delete(id);

    }

    public void printCycles() {

        list.print();

    }

    public void updateCycle(int id, int weightCycle, int maxWeight, String color) {

        Cycle cycle = new Cycle(weightCycle, maxWeight, color);
        list.update(id, cycle);

    }


}
