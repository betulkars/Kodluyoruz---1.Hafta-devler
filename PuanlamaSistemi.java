package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        90-100	AA
//        85-89  	BA
//        80-84  	BB
//        75-79	    CB
//        70-74	    CC
//        65-69  	DC
//        60-64   	DD
//        50-59 	FD
//        49 ve aşağısı
        int notdegeri;
        Scanner  not = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz:");
        notdegeri = not.nextInt();
        if(90 <= notdegeri && notdegeri<= 100){
            System.out.println("Notunuz : AA. Tebrikler!");
        }else if (85<=notdegeri && notdegeri<=89){
            System.out.println("Notunuz : BA. Tebrikler!");
        }else if (80<=notdegeri && notdegeri<=84) {
            System.out.println("Notunuz : BB. Tebrikler!");
        }else if (75<=notdegeri && notdegeri<=79) {
            System.out.println("Notunuz : CB. Tebrikler!");
        }else if (70<=notdegeri && notdegeri<=74) {
            System.out.println("Notunuz : CC. Tebrikler!");
        }else if (65<=notdegeri && notdegeri<=69) {
            System.out.println("Notunuz :DC. Tebrikler!");
        }else if (60<=notdegeri && notdegeri<=64) {
            System.out.println("Notunuz : DD. Tebrikler!");
        }else if (50<=notdegeri && notdegeri<=59) {
            System.out.println("Notunuz : FD. Tebrikler!");
        }else {
            System.out.println("Notunuz : FF.Başarısız.");
        }


    }
    }