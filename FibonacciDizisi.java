package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sayi1 = 0;
        int sayi2 = 1;
        int yenisayi, n;

        Scanner input = new Scanner(System.in);
        System.out.println("İstediğiniz adım sayısını giriniz:");
        n = input.nextInt();
        System.out.println(sayi1);
        System.out.println(sayi2);

        for (int i = 2; i < n; ++i) {
            yenisayi = sayi1 + sayi2;
            System.out.println( yenisayi);
            sayi1 = sayi2;
            sayi2 = yenisayi;

        }
        System.out.println();
    }
}

