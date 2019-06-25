package by.trafimovich.lesson3;

import java.util.Random;

/**Посчитать факториал числа от 10 до 15 (не используя рекурсию)

 */

public class Task10 {
    public static void main(String[] args) {
        double factsum = 1;
        double n = 0;
        int x = (int)(Math.random()*20);
        System.out.println("Число" + " " + x);
        if(x>=10 & x<=15){
        for ( n=0; 0<x ; n++){
            factsum *= x--;
             }
               System.out.println("Факториал" + " " + factsum);}
        else {
            System.out.println("Число выходит за границы от 10 до 15");
        }


    }
    }

