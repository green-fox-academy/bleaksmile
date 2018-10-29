package hu.greenfox.bleaksmile;

public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        int hours = 24;
        int minutes = 60;
        int seconds = 60;

        int remainingSeconds = (hours-currentHours-1)*3600 + (minutes-currentMinutes-1)*60 + (seconds-currentSeconds);
        System.out.println(remainingSeconds);
    }

}
