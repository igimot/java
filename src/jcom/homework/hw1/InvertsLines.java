package com.homework.hw1;

import java.util.Scanner;

/**
 * Написать метод, принимающий в качестве параметра строку. Возвращающий перевернутую строку. (3 способа)
 *  Created by Oleg on 07.07.2016.
 */
public class InvertsLines {
    public static void main (String[] args) {
        System.out.println("Введите что-то .");
        Scanner wordsLine = new Scanner(System.in); // запустили сканер и ввели что-то
        String lineW = wordsLine.nextLine(); // присвоили предложению имя lineW
        StringBuilder wr = new StringBuilder(lineW);
        System.out.println(wr.reverse());

    }


     
}
