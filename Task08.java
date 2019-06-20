package by.trafimovich.lesson2;

import java.util.Random;

public class Task08 {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt();
        switch(number%10){
            case 1:
                System.out.printf(number+" "+"рубль");
                break;
            case 2:
            case 3:
            case 4:
                System.out.printf(number+" "+"рубля");
                break;
                default:
                    System.out.printf(number+" "+"рублей");

        }

    }
}
