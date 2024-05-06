package hw45;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Home work 45");
        System.out.println("===============");
        System.out.println("*** Task #1 ***");
        System.out.println("===============");

        // Date now
        LocalDate dateNow = LocalDate.now();
        System.out.println("Today is: " + dateNow);
        // Year, month and date now
        System.out.println("Today is year: " + dateNow.getYear() + " month: " + dateNow.getMonth() + " and date: " + dateNow.getDayOfWeek());

        // Specific date
        LocalDate myBirthday = LocalDate.of(1985, Month.AUGUST, 11);
        System.out.println("I was born on " + myBirthday);

        LocalDate chrisHemsworthBirthday = LocalDate.of(1983, Month.AUGUST, 11);
        System.out.println("Chris Hemsworth was born on " + chrisHemsworthBirthday);

        // Compare two specific dates, if they are equal
        System.out.println("Was I born in one day with Chris Hemsworth?");
        System.out.println("Answer: " + chrisHemsworthBirthday.equals(myBirthday));

        System.out.println("What is the age difference between me and Chris Hemsworth?");
        System.out.println("Answer: " + chrisHemsworthBirthday.until(myBirthday, ChronoUnit.YEARS) + " years or " + chrisHemsworthBirthday.until(myBirthday, ChronoUnit.DAYS) + " days.");

        // Time now
        LocalDateTime timeNow = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String currentTime = timeNow.format(formatter);
        System.out.println("It is " + currentTime + " now");

        // Time now + 3h
        System.out.println("In 3 hours it will be " + timeNow.plusHours(3).format(formatter));

        System.out.println(" ");
        System.out.println("===============");
        System.out.println("*** Task #2 ***");
        System.out.println("===============");

        // List of dates
        LocalDate Anton = LocalDate.of(1985, Month.AUGUST, 11);
        LocalDate chrisHemsworth = LocalDate.of(1983, Month.AUGUST, 11);
        LocalDate mikhailBulgakov = LocalDate.of(1891, Month.MAY, 15);
        LocalDate williamShakespeare = LocalDate.of(1564, Month.APRIL, 23);
        LocalDate sigmundFreud = LocalDate.of(1856, Month.MAY, 6);

        // method
//        public static int dateBetween () {
//            Period period = Period.between(Anton, chrisHemsworth);
//            System.out.println(period.getYears() + " years " + period.getMonths() + " months " + period.getDays() + " days");
//        }
    }
}
