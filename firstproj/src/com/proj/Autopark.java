package com.proj;

// TODO: я тебе здесь убрал все пустые строчки, код смотрится лаконичнее. Не оставляй нахуй пустые строчки там, где это не надо.
// TODO: у тебя методы на две строчки кода и ты въебываешь еще две пустые. Если файл будет на 100 функций, то заебешься листать
public class Autopark {

    // TODO: память под массив должна выделяться при создании объекта. У тебя может вообще не будет вызван этот класс, а зачем тогда выделяем память под массив? В конструктор перенеси
    // TODO: тебе идея не подсказывает на []? Массив объявялется Car[] cars вот так бро
    private Car cars[] = new Car[2];

    // TODO: работать будет, но лучше использовать цикл while, break оператор - не лучший тон
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

    // TODO: это чо такое?
    public void parkCarsss(int id) {

        int i = 0;
        while (i < cars.length) {



        }

    }
}
