package com.ekjot;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter temperature in C:");
        float TempC = in.nextFloat();

        float TempF = ((TempC*9)/5 + 32);
        System.out.println(TempF);
    }
}
