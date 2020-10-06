package com.melissaluna.java;

public class NumeroPrimo {

    public int[] n = new int[100];


    public void ImpNumPri() {

        for (int n = 0; n < 100; n++) {
            if (n % 2 == 0) {
                continue;
            }
            System.out.print(String.valueOf(n) + ",");
        }
    }
}
