import java.util.Locale;
import java.util.Scanner;

public class BMIBeregner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("In order to calculate your BMI, we need your height and weight.\nInsert your height in meters:");
        double height = scanner.nextDouble();
        System.out.println("Insert your weight in kilos:");
        double weight = scanner.nextDouble();

        double BMI = weight / (height*height);

        if(BMI < 18.5){
            System.out.println("You're underweight with BMI = " + BMI);
        } else if(BMI >= 18.5 && BMI < 25){
            System.out.println("Your weight is normal, BMI = " + BMI);
        } else if(BMI >= 25 && BMI < 30){
            System.out.println("You're overweight with BMI = " + BMI);
        } else{
            System.out.println("You're heavily overweight with BMI = " + BMI);
        }
    }
}
