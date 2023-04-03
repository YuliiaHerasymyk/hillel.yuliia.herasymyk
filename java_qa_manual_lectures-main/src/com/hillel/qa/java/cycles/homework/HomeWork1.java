package com.hillel.qa.java.cycles.homework;

import java.util.Scanner;

public class HomeWork1 {
    /**
     * <p style="font-size:12px">
     *     Ввести з клавіатури марку авто, використовуючи цикл while, 10 разів вивести: <марка> найкраще авто.
     * </p>
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введіть марку авто: ");

        String carBrand = in.nextLine();

        int a = 1;
        while (a <= 10) {
            System.out.println(carBrand + " найкраще авто");
            a++;
        } in.close();
    }
}
