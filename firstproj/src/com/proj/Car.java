package com.proj;



public class Car {

    private String name;
    private int speed;
    private String color;

    public Car(String name, int speed, String color){

        this.name = name;
        this.speed = speed;
        this.color = color;

    }

    public void setCar(String name, int speed, String color) {

        this.name = name;
        this.speed = speed;
        this.color = color;

    }

    public void setCarName(String name) {
        this.name = name;
    }

    public void setCarSpeed(int speed) {
        this.speed = speed;
    }

    public void setCarColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }



    @Override
    public String toString(){
        return "Марка: " + name + " \nМаксимальная скорость: " + speed + "\nЦвет: " + color +"\n";
    }






}
