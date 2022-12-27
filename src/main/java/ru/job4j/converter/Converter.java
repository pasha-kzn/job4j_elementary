package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 420;
        float expectedDollar = 7;
        float expectedEuro = 6;
        float euro = Converter.rubleToEuro(420);
        boolean passed = expectedEuro == euro;
        System.out.println(in + " rubles are 6 euros. Test result : " + passed);
        float dollar = Converter.rubleToDollar(420);
        passed = expectedDollar == dollar;
        System.out.println(in + " rubles are 7 dollars. Test result : " + passed);
    }
}