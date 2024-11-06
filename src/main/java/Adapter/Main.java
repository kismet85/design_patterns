package Adapter;

import java.util.Calendar;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        NewDateInterface newDate = new CalendarToNewDateAdapter(Calendar.getInstance());
        System.out.println("Today's date: " + newDate.getDay() + "/" + newDate.getMonth() + "/" + newDate.getYear());

        Random random = new Random();
        int randomDay = random.nextInt(30) + 1;

        newDate.advanceDays(randomDay);
        System.out.println("Date after " + randomDay + " days: " + newDate.getDay() + "/" + newDate.getMonth() + "/" + newDate.getYear());

        newDate.setDay(1);
        newDate.setMonth(1);
        newDate.setYear(2025);
        System.out.println("Date at the start of next year: " + newDate.getDay() + "/" + newDate.getMonth() + "/" + newDate.getYear());
    }
}