package by.trafimovich.lesson3;

/** имеется целое число, определит является ли это число простым,
 *  т.е. делится без остатка только на 1 и себя.
 *
 */

public class Task11 {
    public static void main(String[] args) {
        boolean prostoe;
        int num = (int)(Math.random()*20);
        System.out.println("Число "+num);

        if(num < 2) prostoe = false;
        else prostoe = true;

        for(int i=2; i <= num/i; i++){
            if((num%i)==0){
                prostoe = true;}
                else {prostoe = false;}
                break;
         }
        if (prostoe) System.out.println("Число простое");
        else System.out.println("Не простое число");
    }
}