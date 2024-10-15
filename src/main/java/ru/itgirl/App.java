package ru.itgirl;

import java.util.Scanner;

import static ru.itgirl.Weekday.translate;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day name in English: ");
        String inputDay = scanner.nextLine();
        String russianDay = translate(inputDay);
        System.out.println(russianDay);
    }
}
