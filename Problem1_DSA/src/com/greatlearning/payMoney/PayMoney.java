package com.greatlearning.payMoney;

public class PayMoney {
    public void check(int[] arr, int target) {
        long sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum = sum + arr[i];
            if (sum >= target) {
                System.out.println("Target achieved after " + (i + 1) + " transactions");
                break;
            }
            i++;
        }
        if (i == arr.length && target > sum)
            System.out.println("Given target is not achieved");
    }
}
