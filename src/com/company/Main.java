package com.company;

public class Main {

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.x1 = 4;
        task1.x2 = 2;
        task1.printInfo();

        Task2 task2 = new Task2();
        task2.byteNum = 4;
        task2.printFirstResult();
        task2.intNum = 2_457_807;
        task2.printSecondResult();
        task2.shortNum = 15_470;
        task2.printThirdResult();
        task2.charVal = 'A';
        task2.printFourthResult();

        Task3 task3 = new Task3();
        task3.intNum = 2_147_483_647;
        task3.printResult();

        Task4 task4 = new Task4();
        task4.byteNum = 127;
        task4.printByte();
    }
}
