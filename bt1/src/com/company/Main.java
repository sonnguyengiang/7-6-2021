package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int number = scanner.nextInt();



        if  (number <= 10) {
               switch (number) {
                   case 1:
                       System.out.println("one");
                       break;
                   case 2:
                       System.out.println("two");
                       break;
                   case 3:
                       System.out.println("three");
                       break;
                   case 4:
                       System.out.println("four");
                       break;
                   case 5:
                       System.out.println("five");
                       break;
                   case 6:
                       System.out.println("six");
                       break;
                   case 7:
                       System.out.println("seven");
                       break;
                   case 8:
                       System.out.println("eight");
                       break;
                   case 9:
                       System.out.println("nine");
                       break;
                   case 10:
                       System.out.println("ten");
                       break;

           }
        } else if (number < 20 && number > 10) {
            int x = number % 10;
            switch (x) {
                case 1:
                    System.out.println("eleven");
                    break;
                case 2:
                    System.out.println("twelve");
                    break;
                case 3:
                    System.out.println("threeteen");
                    break;
                case 4:
                    System.out.println("fourteen");
                    break;
                case 5:
                    System.out.println("fiveteen");
                    break;
                case 6:
                    System.out.println("sixteen");
                    break;
                case 7:
                    System.out.println("seventeen");
                    break;
                case 8:
                    System.out.println("eighteen");
                    break;
                case 9:
                    System.out.println("nineteen");
                    break;
                case 10:
                    System.out.println("twenty");
                    break;
            }
        }
        else {
            int a,b,c;
            a = number/100;
            b = (number%100)/10;
            c = (number%100)%10;

            switch (a) {
                case 1:
                    System.out.println("one hundred");
                    break;
                case 2:
                    System.out.println("two hundred");
                    break;
                case 3:
                    System.out.println("three hundred");
                    break;
                case 4:
                    System.out.println("four hundred");
                    break;
                case 5:
                    System.out.println("five hundred");
                    break;
                case 6:
                    System.out.println("six hundred");
                    break;
                case 7:
                    System.out.println("seven hundred");
                    break;
                case 8:
                    System.out.println("eight hundred");
                    break;
                case 9:
                    System.out.println("nine hundred");
                    break;
            }

            switch (b) {
                case 1:
                    System.out.println("eleven");
                    break;
                case 2:
                    System.out.println("twelve");
                    break;
                case 3:
                    System.out.println("threeteen");
                    break;
                case 4:
                    System.out.println("fourteen");
                    break;
                case 5:
                    System.out.println("fiveteen");
                    break;
                case 6:
                    System.out.println("sixteen");
                    break;
                case 7:
                    System.out.println("seventeen");
                    break;
                case 8:
                    System.out.println("eighteen");
                    break;
                case 9:
                    System.out.println("nineteen");
                    break;
                case 10:
                    System.out.println("twenty");
                    break;
            }

            switch (c) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 10:
                    System.out.println("ten");
                    break;

            }
        }
    }
}
