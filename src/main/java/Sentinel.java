import java.util.Scanner;

public class Sentinel {
    public static void main(String[] args) {
        final int SENTINEL = -1;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert numbers to sum up");
        while(true){

            int number = scanner.nextInt();
            if(number != SENTINEL){
                sum+=number;
            } else {
                System.out.println(sum);
                break;
            }
        }
    }
}
