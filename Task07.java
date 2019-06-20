package by.trafimovich.lesson2;

import java.util.Scanner;

/** Имеется прямоугольное отверстие размерами a и b
 * определить можно ли его полностью закрыть круглой картонкой радиусом r
 */

public class Task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:a");
        int a = sc.nextInt();
        System.out.println("Введите число:b");
        int b = sc.nextInt();
        System.out.println("Введите число:r");
        int r = sc.nextInt();
        double c=Math.sqrt((a*a)+(b*b));
        int d = 2*r;

        if(d>=c) {System.out.println("Закроет");
        }
else
    System.out.println("Незакроет");
    }
}