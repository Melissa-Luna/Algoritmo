package com.melissaluna.java;

public class SerieFibonacci {

    public int[] f = new int[100];
    public int var = 1, a = 0, b = 0;

    public void ImprimirSerie(){

        for (int f = 0; f<100; f++){

            System.out.print(String.valueOf(b)+ ",");
            a=b;
            b = var;
            var = a + b;

        }

    }

}
