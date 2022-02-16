package com.example.optimistics;

public class ModularArithmetic {

    private ModularArithmetic(){}

    public static boolean checkCongruence(int a, int b, int n){
        if (n > 0) {
            int value = a-b;
            return value % n == 0;
        }
        return false;
    }

}
