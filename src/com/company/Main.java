package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int birthDay;
        boolean isError = false;
        String cinBurcu = "";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen doğum yılınızı giriniz = ");
        birthDay = scanner.nextInt();

        if (birthDay%12==0){
            cinBurcu = "Maymun";
        }else if (birthDay%12==1){
            cinBurcu = "Horoz";
        }else if (birthDay%12==2){
            cinBurcu = "Köpek";
        }else if (birthDay%12==3){
            cinBurcu = "Domuz";
        }else if (birthDay%12==4){
            cinBurcu = "Fare";
        }else if (birthDay%12==5){
            cinBurcu = "Öküz";
        }else if (birthDay%12==6){
            cinBurcu = "Kaplan";
        }else if (birthDay%12==7){
            cinBurcu = "Tavşan";
        }else if (birthDay%12==8){
            cinBurcu = "Ejderha";
        }else if (birthDay%12==9){
            cinBurcu = "Yılan";
        }else if (birthDay%12==10){
            cinBurcu = "At";
        }else if (birthDay%12==11){
            cinBurcu = "Koyun";
        }else {
            isError = true;
        }

        if (isError){
            System.out.println("Lütfen geçerli bir toğum tarihi girin");
        }else {
            System.out.println("Çin takvimine göre çin zodyağı burcunuz = "+cinBurcu);
        }
    }
}
