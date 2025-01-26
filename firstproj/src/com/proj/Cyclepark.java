package com.proj;

public class Cyclepark {
    LinkedList list = new LinkedList();
    public void addNewCycle(int weightCycle, int maxWeight, String color) {

        Cycle cycle = new Cycle(weightCycle, maxWeight, color);
        list.add(cycle);

    }

    public void printCycles() {

        list.print();

    }

}
