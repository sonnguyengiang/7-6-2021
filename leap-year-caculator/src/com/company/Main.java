package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;

        System.out.println("eneter a year");
        year = scanner.nextInt();

        if (year%4==0) {
            if (year%100==0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is the leap year");
                }
                else {
                    System.out.println(year + " isn't the leap year");
                }
            } else {
                System.out.println(year + " isn't the leap year");
            }
        } else {
            System.out.println(year + " isn't the leap year");
        }
    }
}
