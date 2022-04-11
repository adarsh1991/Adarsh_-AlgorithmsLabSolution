package com.greatlearning.main;

import com.greatlearning.payMoney.PayMoney;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of transaction array");

        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the values of array");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the total no of targets to be achieved");
        int n = scanner.nextInt();
        PayMoney payMoney = new PayMoney();
        while (n > 0) {
            System.out.println("Enter the value of target");
            int target = scanner.nextInt();
            payMoney.check(arr, target);
            n--;
        }
        scanner.close();
    }
}
