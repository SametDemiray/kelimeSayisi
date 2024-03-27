package org.example;

// Klavyeden girilen bir cümlede kaç tane kelime olduğunu bulan program
// Bilgisayar,elektronik bir makinedir. -> 4

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i,j,say=0;
        String c;
        char[] is = {' ',',',';',':','-'};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Cümleyi Giriniz : ");
        c = scanner.nextLine();

        for (i=0; i<c.length(); i++){
            for (j=0; j<5; j++)
                if (is[j]==c.charAt(i)){
                    say++;
                    break;
                }
        }
        System.out.println("\nCümlede "+(say+1)+" tane kelime vardır.");
    }
}