package jcom.homework.hw1;

import java.util.Scanner;

/**
 *
 * Задача 3. Написать программу состоящую из методов:
 - метод, считывает с консоли строку и возвращает ее
 - метод, считывает с консоли символ и возращает его
 - метод, принимает строку и символ, делает поиск символа в строке, возвращает индекс последнего вхождения символа в строке
 - главный метод, только вызовы методов.
 *
 * Created by Oleg on 07.07.2016.
 */
public class CallMethod {

    public static void main(String[] args) {

        method1();
        method2();

    }

    public static String method1() {
        System.out.println("Введите строку из букв");
        Scanner scanWord= new Scanner(System.in);

        System.out.println("Вы ввели "+scanWord);


    }
    public static void method2() {
        System.out.println("Введите символ");
        Scanner scanWord= new Scanner(System.in);
        System.out.println("Вы ввели "+scanWord);

    }
    public static void method3() {

    }

}
