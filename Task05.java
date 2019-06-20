package by.trafimovich.lesson2;

import java.util.Random;
/**Дано любое 4-х значное число.
 * Верно ли, что все цифры числа разные.
 */


public class Task05 {

        public static void main(String[] args) {
            int number = new Random().nextInt(8999) + 1000;

            System.out.println(number);

            int first = number / 1000;
            System.out.println(first);

            int second = number / 100 % 10;
            System.out.println(second);

            int third = number / 10 % 10;
            System.out.println(third);

            int fourth = number % 10;
            System.out.println(fourth);

            int result = fourth * 1000 + third * 100 + second * 10 + first;
            System.out.println(result);

            if(first==second | first==third | first==fourth | second==third | second==fourth | third==fourth) {
                System.out.println("Имеются одиноковые числа");
            }
            else
                System.out.println("Все цифры числа различны");
        }}
