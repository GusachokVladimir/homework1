package com.company;

public class Main {

    public static void main(String[] args) {
        // Задание 1

        String admin;
        String name = "Ivan";


        admin = name;
        System.out.println(admin);

        // Задание 2
        double grade = 10;
        grade += 5;
        System.out.println("grade пользователя " + admin + " равен " + grade );

        String admin2 = "Dima";
        double grade2 = grade / 2;
        System.out.println("grade пользователя " + admin2 + " равен " + grade2 );

        // Задание 3
        double x = 6;
        double y = 7;

        double z = x / y;
        System.out.println(z);

        // Задание 4
        int z2 = 2147483647;
        z2++;
        System.out.println(z2);

        // Задание 5
        int priceA = 1000;
        int priceB = 500;
        double discountValue = 0.1;
        double discount;
        double totalPrice;

        discount = (priceA + priceB) * discountValue;
        totalPrice = priceA + priceB - discount;
        System.out.println("Сумма со скидкой = " + totalPrice);
        System.out.println("Скидка = " + discount);

        // Задание 6a
        int priceProductA = 200;
        int amountA = 10;
        double discountValueA = 0.15;

        int priceProductB = 30;
        int amountB = 2;


        double totalDiscountA = amountA * priceProductA * discountValueA;
        double totalPriceA = amountA * priceProductA - totalDiscountA;

        double totalPriceB = amountB * priceProductB;
        totalPrice = totalPriceA + totalPriceB;

        System.out.println("Итоговая ценаA = " + totalPrice);

        // Задание 6b
        priceProductA = 500;
        amountA = 7;
        discountValueA = 0.5;

        priceProductB = 50;
        amountB = 1;


        totalDiscountA = amountA * priceProductA * discountValueA;
        totalPriceA = amountA * priceProductA - totalDiscountA;

        totalPriceB = amountB * priceProductB;
        totalPrice = totalPriceA + totalPriceB;

        System.out.println("Итоговая ценаB = " + totalPrice);

        // Задание 6c
        priceProductA = 300;
        amountA = 2;
        discountValueA = 0.1;

        priceProductB = 20;
        amountB = 3;


        totalDiscountA = amountA * priceProductA * discountValueA;
        totalPriceA = amountA * priceProductA - totalDiscountA;

        totalPriceB = amountB * priceProductB;
        totalPrice = totalPriceA + totalPriceB;

        System.out.println("Итоговая ценаCcd = " + totalPrice);

    }


}
