package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to be transferred(usd)");
        int money = scanner.nextInt();

        int trans = money * 23000;
        System.out.println("=> " + trans + " VND");
    }
}
