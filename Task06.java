package by.trafimovich.lesson2;
/** Создайте число.
 * Определите, является ли число трехзначным.
 * Определите, является ли его последняя цифра семеркой.
 * Определите, является лм число четных.
 */

import java.util.Random;

public class Task06 {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt();
        System.out.println(number);
        int x = number%10;
        if(x==7){ System.out.println("Последняя цифра является 7 ");
        }
          if(100<=number & number<=999){
           System.out.println("Число является трехзначным");
        } else {
            System.out.println("Число не является трехзначным");}

        if(number%2==0){
            System.out.println("Число"+" "+number+" "+"является четным");
        }else{
            System.out.println("Число"+" "+number+" "+"является нечетным");
        }
}}
