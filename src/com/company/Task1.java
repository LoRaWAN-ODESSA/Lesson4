package com.company;

public class Task1 {
    int x1;
    int x2;
    int perim1;
    int square1;
    int perim2;
    int square2;
    String text1 = "Периметр 1 квадрата равен площади: ";
    String text2 = "Периметр 2 квадрата равен площади: ";
    boolean isEqual1;
    boolean isEqual2;

    public void printInfo() {
        System.out.println("Задание 1:");
        System.out.println("Периметр 1 квадрата = " + (perim1 = x1 * 4));
        System.out.println("Площадь 1 квадрата = " + (square1 = x1 * x1));
        System.out.println("Периметр 2 квадрата = " + (perim2 = x2 * 4));
        System.out.println("Площадь 2 квадрата = " + (square2 = x2 * x2));
        System.out.println(text1 + (isEqual1 = perim1 == square1));
        System.out.println(text2 + (isEqual2 = perim2 == square2));
    }
}
