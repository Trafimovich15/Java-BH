package by.trafimovich.lesson2;

import java.util.Random;

public class Task04my {
    /**
     * Определить число, полученное выписыванием в обратном порядке цифр
     * любого 4-х значного натурального числа n.
     */
    public static void main(String[] args)
    {
        int number = new Random().nextInt(8999) + 1000;

        System.out.println(number);

        int first = number / 1000;
        System.out.print(first);

        int second = number / 100 % 10;
        System.out.print(second);

        int third = number /10 % 10;
        System.out.print(third);

        int fourth = number%10;
        System.out.println(fourth);

        int result = fourth*1000 + third*100 + second*10 + first;
        System.out.println(result);
    }
}

