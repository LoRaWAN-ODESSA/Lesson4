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
        System.out.println("\n������� 2:");
        System.out.println("������ �������������� byte->short->int->long:");
        System.out.println("byte = " + byteNum);
        System.out.println("short = " + shortNum);
        System.out.println("int = " + intNum);
        System.out.println("long = " + longNum);
    }

    public void printSecondResult() {
        doubleNum = intNum;
        System.out.println("\n������ �������������� int->double:");
        System.out.println("int = " + intNum);
        System.out.println("double = " + doubleNum);
    }

    public void printThirdResult() {
        floatNum = shortNum;
        doubleNum = floatNum;
        System.out.println("\n������ �������������� short->float->double:");
        System.out.println("short = " + shortNum);
        System.out.println("float = " + floatNum);
        System.out.println("double = " + doubleNum);
    }

    public void printFourthResult() {
        intNum = charVal;
        System.out.println("\n��������� �������������� char->int:");
        System.out.println("char = " + charVal);
        System.out.println("int = " + intNum);
    }

}
