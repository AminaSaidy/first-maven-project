package ru.itgirl;

import java.util.Scanner;

import static ru.itgirl.App.Weekday.translate;

public class App {
    public enum Weekday {

        MONDAY("понедельник"),
        TUESDAY("вторник"),
        WEDNESDAY("среда"),
        THURSDAY("четверг"),
        FRIDAY("пятница"),
        SATURDAY("суббота"),
        SUNDAY("воскресенье");

        private final String russianDay;

        Weekday(String russianDay) {
            this.russianDay = russianDay;
        }

        public String getRussianDay() {
            return russianDay;
        }

        public static String translate(String day) {
            try {
                return Weekday.valueOf(day.toUpperCase()).getRussianDay();
            } catch (IllegalArgumentException e) {
                return "wrong day input";
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day name in English: ");
        String inputDay = scanner.nextLine();
        String russianDay = translate(inputDay);
        System.out.println(russianDay);
    }
}
