package ru.itgirl;

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
