

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        practica1();
        practica2();
        practica3();
    }

    public static void practica1() {
        final int CURRENT_YEAR = 2026;
        System.out.println("введите ваш год рождения");
        Scanner in = new Scanner(System.in);
        int birthYear = in.nextInt();
        int age = CURRENT_YEAR - birthYear;
        if (birthYear > CURRENT_YEAR) {
            System.out.println("чо куда, неправильный год, еще раз введи(только честно): ");
            birthYear = in.nextInt();
        }
        System.out.println("ваш возраст: " + age);
        if (age < 18) {
            System.out.println("вы несовершеннолетний");
        } else if (age >= 18 && age < 65) {
            System.out.println("вы взрослый");
        } else {
            System.out.println("вы пенсионер");
        }
    }

    public static void practica2() {
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int sum = 0;
            int count = 0;
            System.out.println(Arrays.toString(numbers));

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    sum += numbers[i];
                } else {
                    count += 1;
                }

            }
            System.out.println("сумма четных чисел: " + sum);
            System.out.println("количество нечетных чисел: " + count);

        }

    public static void practica3() {
        for (int i = 1; i <= 5; i++) {
            for (int o = 1; o <= 5; o++) {
                System.out.print(i + " * " + o + " = " + i * o + "  ");
            }
            System.out.println();
        }
    }
}




