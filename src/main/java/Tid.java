import java.sql.SQLOutput;

public class Tid {

    public static void main(String[] args) {
        int secondsStart = 3;
        int minutesStart = 15;
        int hoursStart = 11;

        int secondsSinceMidnight = hoursStart * 60 * 60 + minutesStart * 60 + secondsStart;
        System.out.println("Siden midnat er der gået " + secondsSinceMidnight + " sekunder");

        int secondsInADay = 24 * 60 * 60;
        int secondsLeftToday = secondsInADay - secondsSinceMidnight;
        System.out.println("Der er " + secondsLeftToday + " sekunder tilbage i dag");

        int secondsFinish = 52;
        int minutesFinish = 21;
        int hoursFinish = 11;

        System.out.printf("It took %d hours, %d minutes and %d seconds to do the exercise", hoursFinish-hoursStart,
                minutesFinish-minutesStart, secondsFinish-secondsStart);

    }
}
