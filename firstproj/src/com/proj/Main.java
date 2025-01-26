package com.proj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //ПРИВЕТ
        String name;
        int speed;
        String color;

        Autopark autopark = new Autopark();
        for (int i = 0; i >= 0; i++) {

            System.out.println("Добавить машину/удалить машину/просмотреть автопарк/заменить машину(добавить/удалить/автопарк/заменить)");
            String answerManage = sc.nextLine();

            if (answerManage.equals("добавить")) {

                for (int a = 0; a >= 0; a++){

                    System.out.println("Введи марку машины: ");
                    name = sc.nextLine();
                    System.out.println("Введи скорость машины: ");
                    speed = sc.nextInt();
                    System.out.println("Введи цвет машины: ");
                    sc.nextLine();
                    color = sc.nextLine();
                    autopark.addNewCar(name, speed, color);
                    System.out.println("Машину добавили, желаете ли еще добавить?(да/нет)");
                    answerManage = sc.nextLine();

                    if (answerManage.equals("нет")) {
                        System.out.println("Вот ваш автопарк");
                        autopark.checkPark();
                        break;

                    }
                }

            } else if (answerManage.equals("удалить")) {

                System.out.println("Необходимо ли вывести Ваш автопарк?(да/нет)");
                answerManage = sc.nextLine();

                if (answerManage.equals("да")) {
                    autopark.checkPark();
                }

                System.out.println("Выбери какую машину");
                int id = sc.nextInt();
                autopark.deleteCar(id);

            } else if (answerManage.equals("автопарк")) {
                autopark.checkPark();

            } else if (answerManage.equals("заменить")) {

                autopark.checkPark();

                System.out.println("Выберите id машины");
                int id = sc.nextInt();

                System.out.println("Выберите марку машины");
                sc.nextLine();
                String nameNew = sc.nextLine();

                System.out.println("Выберите скорость машины");
                int speedNew = sc.nextInt();

                System.out.println("Выберите цвет машины");
                sc.nextLine();
                String colorNew = sc.nextLine();

                autopark.updateCar(id, nameNew, speedNew, colorNew);

                autopark.checkPark();

            } else if (answerManage.equals("дальше")) {
                Cyclepark cyclepark = new Cyclepark();
                System.out.println("Добавляем велик");
                System.out.println("Введите максимальный вес");
                int maxWeight = sc.nextInt();
                System.out.println("Введите вес велосипеда");
                int weight = sc.nextInt();
                System.out.println("Введите цвет велосипеда");

                String colorCycle = sc.nextLine();
                System.out.println("ПРИВЕТ");
                cyclepark.addNewCycle(maxWeight, weight, colorCycle);
                System.out.println("Добавили");
                sc.nextLine();
                System.out.println("Добавляем велик");
                System.out.println("Введите максимальный вес");
                int maxWeight1 = sc.nextInt();
                System.out.println("Введите вес велосипеда");
                int weight1 = sc.nextInt();
                System.out.println("Введите цвет велосипеда");
                sc.nextLine();
                String colorCycle1 = sc.nextLine();
                System.out.println("ПРИВЕТ");
                cyclepark.addNewCycle(maxWeight1, weight1, colorCycle1);
                cyclepark.printCycles();

            }
        }
    }
}
