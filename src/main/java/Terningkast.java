import java.util.Random;

public class Terningkast {

    public static void main(String[] args) {
        Random rand = new Random();
        int sum = 0;
        while(sum != 7){
            int firstCast = rand.nextInt(6) +1;
            int secondCast = rand.nextInt(6) +1;
            sum = firstCast + secondCast;
            System.out.printf("%d + %d = %d\n", firstCast, secondCast, sum);
        }
    }
}
