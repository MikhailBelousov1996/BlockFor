package ru.netology.sqr;

import javax.swing.plaf.IconUIResource;

public class SQRService {
    public int calculateSQRT(int minNumber, int maxNumber) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minNumber) {
                if (i * i <= maxNumber) {
                    counter = counter + 1;
                }
//                return i;
            }
        }
        System.out.println(counter);
        return counter;
    }
}
