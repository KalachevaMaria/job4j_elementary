package ru.job4j;

 class Converter {
     public static int rubleToEuro(int value) {
         int rsl = value / 70;
         return rsl;
     }

     public static int rubleToDollar(int value) {
         int rsl = value / 60; /* формула перевода рублей в доллоры. */
         return rsl;
     }

     public static void main(String[] args) {
         int euro = Converter.rubleToEuro(140);
         int dollar = Converter.rubleToDollar(1230);
         System.out.println("140 rubles are " + euro + " euro.");
         System.out.println("1230 rubles are " + dollar + " dollar");
     }
 }