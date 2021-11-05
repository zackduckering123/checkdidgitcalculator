package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your barcode");

        int[] barcode = new int[14];
        for (int i = 0; i < 14; i++) {
            barcode[i] = input.nextInt();
            int stepTwoTotal=0;
            if ((i % 2) > 1) {
                stepTwoTotal = i + i + i + i + i + i;

            }
            System.out.println(stepTwoTotal);

        }


    }
}
