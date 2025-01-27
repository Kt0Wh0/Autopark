package com.proj;

public class Autopark {

    private Car[] cars;

    public Autopark() {
        cars = new Car[2];
    }

    public Car[] addNewCar(String name, int speed, String color) {
        for (int i = 0; i < cars.length; i++) {
            if(cars[i] == null) {
                cars[i] = new Car(name, speed, color);
                break;
            } else if(i == cars.length-1) {
                Car[] carsSecond = new Car[i + 3];
                System.arraycopy(this.cars, 0, carsSecond, 0, cars.length);
                this.cars = carsSecond;
            }
        }
        return cars;
    }

    public void checkPark() {
        for (int i = 0; i < cars.length; i++) {
            if(cars[0] == null && cars[1] == null) {
                System.out.println("Парк пуст");
                break;
            } else {
                if (cars[i] != null) {
                    int num = i + 1;
                    System.out.println("ID:))) авто: " + num + "\n" + cars[i]);
                }
            }
        }
    }

    public void deleteCar(int id) {
        cars[id - 1] = null;
        System.out.println("Авто удален");
    }

    public void updateCar (int id, String name, int speed, String color) {
        cars[id - 1].setCar(name, speed, color);
        System.out.println("Авто заменен");

    }
}
