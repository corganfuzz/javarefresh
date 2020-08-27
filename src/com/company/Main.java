package com.company;

import java.util.Scanner;

public class Main {

    static void FirstMethod() {
        double radius = 20;
        double area = radius * radius * 3.14159;
        System.out.println(("the radius is " + radius + " and the area is " + area));
        System.out.print("Enter a double value: ");
        Scanner input = new Scanner(System.in);
        double d = input.nextDouble();
        System.out.println("The number is " + d);
    }

    static void TempConverter() {
        System.out.print("Enter degrees in fahrenheit: ");
        Scanner input = new Scanner(System.in);
        double fahrenheit = input.nextDouble();
        double celsius = (5F / 9F) * (fahrenheit - 32);
        System.out.println("The temperature in celsius is " + celsius);
    }

    static void Casting() {
        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myInt);
        System.out.println(myDouble);

        double iDouble = 9.78;
        int iInt = (int) iDouble;
        System.out.println(iDouble);
        System.out.println(iInt);
    }

    static void CastingAug() {
        int sum = 0;
        sum += 4.5;
        System.out.println(sum);
    }

    public static void main(String[] args) {
//      TempConverter();
//      Casting();
        CastingAug();
    }


}
