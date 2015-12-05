package com.company;

import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double a, b;
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Witaj w Skynet2.0. Jestem kalkulatorem");
        System.out.println("Podaj 1 liczbe");
        a = odczyt.nextDouble();
        odczyt.nextLine();
        System.out.println("Podaj co chcesz robic wpisz +,-,*,/");
        String znak = odczyt.nextLine();
        System.out.println("Podaj 2 liczbe");
        b = odczyt.nextDouble();
        switch(znak){
            case "+":
                System.out.println("a+b= "+(a+b));
                break;
            case "-":
                System.out.println("a-b= "+(a-b));
                break;
            case "*":
                System.out.println("a+b= "+(a*b));
                break;
            case "/":
                if (b==0)
                    System.out.println("Podales druga liczbe zero");
                else
                    System.out.println("a/b= "+(a/b));
                break;
            default:
                System.out.println("Podales niedozwolone dzialanie");
                break;
        }
    }
}
