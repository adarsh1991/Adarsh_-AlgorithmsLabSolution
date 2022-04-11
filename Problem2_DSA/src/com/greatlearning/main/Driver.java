package com.greatlearning.main;

import com.greatlearning.traveler.TravelerDenomination;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of currency denominations array");
        int size = scanner.nextInt();

        int[] denominations = new int[size];
        System.out.println("Enter the currency denominations");
        for (int i = 0; i < size; i++) {
            denominations[i] = scanner.nextInt();

        }

        System.out.println("Enter the amount you want to pay");
        int amount = scanner.nextInt();

        TravelerDenomination td = new TravelerDenomination();
        td.compute(denominations, amount);
        scanner.close();
    }
}
