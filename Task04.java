package by.trafimovich.lesson2;


import java.util.Random;

public class Task04 {
    /**
     * Определить число, полученное выписыванием в обратном порядке цифр
     * любого 4-х значного натурального числа n.
     */
        public static void main(String[] args)
        {
            int number = new Random().nextInt(8999) + 1000;

            System.out.println(number);

            int first = number % 10;
            System.out.print(first);

            int second = ((number % 100) - first)/10;
            System.out.print(second);

            int third = (number % 1000 - number%100) / 100;
            System.out.print(third);

            int fourth = number/1000;
            System.out.println(fourth);

            int result = fourth + third*10 + second*100 + first*1000;
            System.out.println(result);
        }
    }


