package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int armutkilo,elmakilo,domateskilo,muzkilo,patlicankilo;
        double toplamOdeme,toplam;
        Double armut = 2.14;
        Double elma = 3.67;
        Double domates = 1.11;
        Double muz = 0.95;
        Double patlican = 5.0;
        int kackilo;

        Scanner input = new Scanner(System.in);
        System.out.println("Armut kaç kilo ? ");
        armutkilo = input.nextInt();
        System.out.println("Elma kaç kilo ? ");
        elmakilo = input.nextInt();
        System.out.println("Domates kaç kilo ? ");
        domateskilo = input.nextInt();
        System.out.println("Muz kaç kilo ? ");
        muzkilo = input.nextInt();
        System.out.println("Patlıcan kaç kilo ? ");
        patlicankilo = input.nextInt();

        toplamOdeme = (armutkilo*armut) + (elmakilo*elma)+(domateskilo*domates)+(muzkilo*muz)+(patlicankilo*patlican);
        System.out.println("Toplam Ödeme Yapmanız Gereken Tutar: " +toplamOdeme +" TL'dir");


    }
}
