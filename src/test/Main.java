package test;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Random;

/**
 * Main class 입니다.
 */

public class Main {
    /**
     * mian메서드 입니다.
     *
     * @param args input 인자
     */

    public static void main(String[] args) {
        Random r = new Random();
        int random1 = r.nextInt(6) + 1;
        int random2 = r.nextInt(6) + 1;

        Dice dice1 = new Dice(random1);
        Dice dice2 = new Dice(random2);

        System.out.println("주사위 합 = " + DiceCalculator.addDice(dice1, dice2));

        String str = "adcdefg";


        int val = (r.nextInt() * str.length());
        System.out.println(DiceCalculator.getIndexOf(str, val));

        int random4 = r.nextInt(6) + 1;
        Dice dice = new Dice(random4);
        System.out.println("주사위 눈이 홀수 : " + DiceCalculator.odd(dice));


        Library library = new Library(5);

        library.add("뇌");
        library.add("백야");

        library.delate("뇌");
        library.add("뇌");

        library.find("백야");
        library.add("java1");
        library.add("java2");
        library.add("java3");
        library.add("java4");

        library.finAll();

    }
}