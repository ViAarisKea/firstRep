public class Dato {
    public static void main(String[] args) {
        int year = 2024;
        String month = "January";
        int date = 31;
        String day = "Wednesday";

        System.out.println(year + "\n" + month + "\n" + date + "\n" + day);
        System.out.println();

        System.out.printf("%s, %s %d, %d \n", day, month, date, year);
        System.out.printf("%s %d %s %d", day, date, month, year);
    }



}
