package com.czm.orderservice.test;

import java.util.Optional;

public class SortDemo {
    static int[] arrayInt = {1,6,7,3,4,2,5};

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt.length-1-i; j++) {
                if (arrayInt[j] < arrayInt[j+1]) {
                    a = arrayInt[j];
                    arrayInt[j] = Optional.ofNullable(arrayInt[j+1]).orElse(null);
                    arrayInt[j+1] = a;
                }
            }
        }
        for (int i : arrayInt) {
            System.out.println(i);
        }
    }
}
