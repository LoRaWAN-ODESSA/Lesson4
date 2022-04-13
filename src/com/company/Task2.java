package com.company;

public class Task2 {
    byte byteNum;
    short shortNum;
    int intNum;
    long longNum;
    float floatNum;
    double doubleNum;
    char charVal;

    public void printFirstResult() {
        shortNum = byteNum;
        intNum = shortNum;
        longNum = intNum;
        System.out.println("\nЗадание 2:");
        System.out.println("Первое преобразование byte->short->int->long:");
        System.out.println("byte = " + byteNum);
        System.out.println("short = " + shortNum);
        System.out.println("int = " + intNum);
        System.out.println("long = " + longNum);
    }

    public void printSecondResult() {
        doubleNum = intNum;
        System.out.println("\nВторое преобразование int->double:");
        System.out.println("int = " + intNum);
        System.out.println("double = " + doubleNum);
    }

    public void printThirdResult() {
        floatNum = shortNum;
        doubleNum = floatNum;
        System.out.println("\nТретье преобразование short->float->double:");
        System.out.println("short = " + shortNum);
        System.out.println("float = " + floatNum);
        System.out.println("double = " + doubleNum);
    }

    public void printFourthResult() {
        intNum = charVal;
        System.out.println("\nЧетвертое преобразование char->int:");
        System.out.println("char = " + charVal);
        System.out.println("int = " + intNum);
    }

}
