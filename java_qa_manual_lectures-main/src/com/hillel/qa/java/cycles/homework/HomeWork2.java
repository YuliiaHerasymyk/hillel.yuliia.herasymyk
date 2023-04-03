package com.hillel.qa.java.cycles.homework;

import java.util.Scanner;

public class HomeWork2 {
    /**
     * <p style="font-size:12px">
     * Напишемо програму, в яку потрібно вводити з клавіатури цілі числа й рахувати їх суму,
     * якщо користувач введе слово "Exit", закінчуємо програму. Вивести на екран отриману суму й завершити програму.
     * Використовуйте цикл while().
     * </p>
     * <br>
     * <h2>Підказка</h2>
     *
     * @see <a href="https://www.w3schools.blog/string-to-int-java">String To Int In Java</a>
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int sum = 0;

        System.out.println("Введіть цілі числа або Exit для підрахунку суми та завершення програми:");

        while (true) {
            if (in.hasNextInt()) {
                String str = in.next();
                sum += Integer.parseInt(str); }
             else {
                String str = in.next();
                if (str.equalsIgnoreCase("Exit")) {
                    break; }
                else {
                    System.out.println("Ви ввели некоректні дані. Введіть ціле число або Exit");
                }
            }
        }
        System.out.println("Сума: " + sum);
        in.close();
    }
}





