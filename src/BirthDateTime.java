import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int year;
        int month;
        int day;
        int hours;
        int minutes;
        int maxDays;

        year = SafeInput.getRangedInt(in,
                "Enter your birth year", 1950, 2015);

        month = SafeInput.getRangedInt(in,
                "Enter your birth month", 1, 12);

        switch(month)
        {
            case 2:
                maxDays = 29;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                maxDays = 30;
                break;

            default:
                maxDays = 31;
                break;
        }

        day = SafeInput.getRangedInt(in,
                "Enter your birth day", 1, maxDays);

        hours = SafeInput.getRangedInt(in,
                "Enter the hour you were born", 1, 24);

        minutes = SafeInput.getRangedInt(in,
                "Enter the minute you were born", 1, 59);

        System.out.println("\nYour birth date and time is:");
        System.out.println(month + "/" + day + "/" + year
                + " at " + hours + ":" + minutes);
    }
}
