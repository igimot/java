package jcom.homework.hw1;

import java.util.Scanner;

/**
 *
 * Ввести с консоли строку с символами и пробелами. Посчитать количество слов в предложении.
 *
 *
 * Created by Oleg on 07.07.2016.
 */
public class CalcWord {

    public static void main (String[] args){
        System.out.println("Введите предложение для подсчета слов.");
        Scanner wordsLine = new Scanner(System.in); // запустили сканер и ввели предложение
        String lineW=wordsLine.nextLine(); // присвоили предложению имя lineW
        int n = 0; // инициализировали новую переменную n
        int p = 0; // инициализировали новую переменную p
        while(p != -1) // запустили цикл
        {
            p = lineW.indexOf(' ',p);
            if(p != -1)
            {
                p++;
                n++;
            }
        }
        System.out.println("Количество слов в предложении: " + n);


    }

}


