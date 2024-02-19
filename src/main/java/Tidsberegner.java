import java.util.Scanner;

public class Tidsberegner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("hvor mange hele timer er der gået?");
        int hours = scanner.nextInt();
        System.out.println("hvor mange minutter er der gået?");
        int minutes = scanner.nextInt();
        System.out.println("hvor mange sekunder er der gået?");
        int seconds = scanner.nextInt();

        int secondsSinceMidnight = hours * 60 * 60 + minutes * 60 + seconds;
        System.out.println("Siden midnat er der gået " + secondsSinceMidnight + " sekunder");
    }
}
