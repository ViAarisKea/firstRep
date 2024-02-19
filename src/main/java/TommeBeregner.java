import java.util.Locale;
import java.util.Scanner;

public class TommeBeregner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.println("Please provide a value to convert from inches to centimeters:");
        double inches = scanner.nextDouble();
        double centimeters = inches * 2.54;
        System.out.printf("%f inches = %f centimeters", inches, centimeters);
    }
}
