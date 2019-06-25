package by.trafimovich.lesson3;

import java.util.Random;

public class Task09 {
    public static void main(String[] args) {
       double factsum = 1;
       double n = 0;
        Random rand = new Random();
        int x = rand.nextInt(100);
        System.out.println("Число" + " " + x);

        while (x > 0) {
            factsum *= x--;
            n++; }
        System.out.println("Факториал" + " " + factsum);}

}
