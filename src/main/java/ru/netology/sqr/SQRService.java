package ru.netology.sqr;

public class SQRService {
    public int multiplication(int minRange, int maxRange){
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            double sqr = Math.pow(i, 2);
            if (sqr >= minRange && sqr <= maxRange) {
                counter++;
            }
        }
        return counter;
    }
}