package ru.clevertec;

public class App {
    public static void main(String[] args) {
        boolean result = Utils.isAllPositiveNumbers("12", "79");
        System.out.println("Are 12 and 79 positive numbers? It's " + result);
    }
}
