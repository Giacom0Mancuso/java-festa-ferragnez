package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

    public static void main(String[] args) {
        String[] inviti = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        boolean check = false;
        for (int i = 0; i < inviti.length; i++){
            Scanner scanner = new Scanner(System.in);
            String guest = scanner.nextLine();
            for (int j = 0; j < inviti.length; j++) {
                if (guest.equals(inviti[j])) {
                    System.out.println("prego può entrare");
                    check = true;
                }
            }
            if (!check){
                System.out.println("lei non è sulla lista");
            }
            if (check){
                check = false;
            }
        }
    }
}
