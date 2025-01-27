package com.proj;



public class Cycle {

    private int weightCycle;
    private int maxWeight;
    private String color;

    public Cycle(int weightCycle, int maxWeight, String color){

        this.weightCycle = weightCycle;
        this.maxWeight = maxWeight;
        this.color = color;

    }

    public void setCycle(int weightCycle, int maxWeight, String color){
        this.weightCycle = weightCycle;
        this.maxWeight = maxWeight;
        this.color = color;
    }


    @Override
    public String toString(){
        return "Вес велосипеда: " + weightCycle + " \nМаксимально допустимый вес: " + maxWeight + "\nЦвет: " + color;
    }

}
