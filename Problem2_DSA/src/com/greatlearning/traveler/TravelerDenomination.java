package com.greatlearning.traveler;

import com.greatlearning.helpers.QuickSort;

public class TravelerDenomination {
    public void compute(int[] denominations, int amount) {

        // Sort in descending order.
        QuickSort quickSort = new QuickSort();
        quickSort.Sort(denominations, 0, denominations.length - 1);

        int[] notes = new int[denominations.length];
        boolean flag = true;
        for (int i = 0; i < denominations.length; i++) {
            notes[i] = amount / denominations[i];
            amount = amount % denominations[i];
        }
        if (amount % denominations[denominations.length - 1] != 0) {
            System.out.println("Exact amount cannot be tendered");
        } else {
            System.out.println("Your payment approach in order to give minimum no of notes will be");
            for (int i = 0; i < denominations.length; i++) {
                if (notes[i] != 0)
                    System.out.println(denominations[i] + ":" + notes[i]);
            }
        }
    }
}
