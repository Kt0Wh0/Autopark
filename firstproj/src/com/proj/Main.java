package com.proj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String name;
        int speed;
        String color;

        Autopark autopark = new Autopark();
        Cyclepark cyclepark = new Cyclepark();

        for (int i = 0; i >= 0; i++){

            System.out.println("Автопарк или велопарк?(автопарк/велопарк)");
            String answerManage = sc.nextLine();

            if (answerManage.equals("автопарк")){

                for (int a = 0; a >= 0; a++) {

                    System.out.println("Добавить машину/удалить машину/просмотреть автопарк/заменить машину/выход(добавить/удалить/автопарк/заменить/выход)");
                    String answerManageAuto = sc.nextLine();

                    if (answerManageAuto.equals("добавить")) {

                        for (int c = 0; c >= 0; c++) {

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

                    } else if (answerManageAuto.equals("удалить")) {

                        System.out.println("Необходимо ли вывести Ваш автопарк?(да/нет)");
                        answerManage = sc.nextLine();

                        if (answerManage.equals("да")) {
                            autopark.checkPark();
                        }

                        System.out.println("Выбери какую машину");
                        int id = sc.nextInt();
                        autopark.deleteCar(id);

                    } else if (answerManageAuto.equals("автопарк")) {
                        autopark.checkPark();

                    } else if (answerManageAuto.equals("заменить")) {

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
                    } else if (answerManageAuto.equals("выход")) {
                        break;
                    }
                }
            } else if (answerManage.equals("велопарк")) {

                for (int a = 0; a >= 0; a++) {

                    System.out.println("Добавить велосипед/удалить велосипед/просмотреть велопарк/заменить велосипед(добавить/удалить/велопарк/заменить/выход)");
                    String answerManageСycle = sc.nextLine();

                    if (answerManageСycle.equals("добавить")) {

                        for (int c = 0; c >= 0; c++) {

                            System.out.println("Введите максимальный вес");
                            int maxWeight = sc.nextInt();

                            System.out.println("Введите вес велосипеда");
                            int weight = sc.nextInt();

                            System.out.println("Введите цвет велосипеда");
                            sc.nextLine();
                            String colorCycle = sc.nextLine();

                            cyclepark.addNewCycle(maxWeight, weight, colorCycle);

                            System.out.println("Велосипед добавили, желаете ли еще добавить?(да/нет)");
                            answerManage = sc.nextLine();

                            if (answerManage.equals("нет")) {

                                System.out.println("Вот ваш велопарк");
                                cyclepark.printCycles();
                                break;

                            }
                        }

                    } else if (answerManageСycle.equals("велопарк")) {

                        cyclepark.printCycles();

                    } else if (answerManageСycle.equals("удалить")) {

                        cyclepark.printCycles();
                        System.out.println("Введи id велосипеда для удаления");
                        int id = sc.nextInt();
                        cyclepark.deleteCycle(id);

                    } else if (answerManageСycle.equals("заменить")) {

                        System.out.println("Введи id велосипеда для замены");
                        int id = sc.nextInt();

                        System.out.println("Введите максимальный вес");
                        int maxWeight = sc.nextInt();

                        System.out.println("Введите вес велосипеда");
                        int weight = sc.nextInt();

                        System.out.println("Введите цвет велосипеда");
                        sc.nextLine();
                        String colorCycle = sc.nextLine();

                        cyclepark.updateCycle(id, maxWeight, weight, colorCycle);
                        System.out.println("Заменили");
                        cyclepark.printCycles();

                    } else if (answerManageСycle.equals("выход")) {
                        break;
                    }
                }
            }


        }
    }
}
