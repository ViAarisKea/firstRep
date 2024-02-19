public class ForLoops {

    public static void main(String[] args) {


        for(int i = 1; i<=4; i++){
            for(int j = 0; j <= 1; j++){
                System.out.printf("%d = %d\n", i, i*2);
            }
        }

        for (int i = 2; i <= 12; i = i + 2) {
            System.out.print(i + " ");
        }

        System.out.println();

        int number = 2;
        for(int i = 0; i < 6; i++){
            System.out.print(number + " ");
            number = number + 2;
        }


        System.out.println();
        for (int i = 4; i <= 79; i = i + 15) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 30; i >= -20; i = i - 10) {
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = -7; i<= 13; i = i + 4){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i=97; i <= 82; i = i - 3){
            System.out.print(i + " ");
        }


    }
}
