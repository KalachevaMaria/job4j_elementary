package ru.job4j.ru.job4j.calculator;

public class Fit {

     static double manWeight(short height) {
        double rsl = height - 100;
        double rsl1 = (rsl * 1.15);
        return rsl1;
    }

     static double womanWeight(short height2) {
        double rsl = ( height2 - 100 ) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 187;
        short height2 = 175;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height2);
        System.out.println("Man 187 is " + man);
        System.out.println("Man 175 is " + woman);
    }

}