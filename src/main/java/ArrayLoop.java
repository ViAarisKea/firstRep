public class ArrayLoop {
    public static void main(String[] args) {
        int[] array = new int[8];
        array[0] = 34;
        array[7] = 117;
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        String[] stringArray = {"Hej", "med", "dig"};
        for(String s : stringArray){
            System.out.print(s + " ");
        }
        System.out.println();
        double[] doubleArray = {3.4, 2.5, 1.2, 6.7};
        System.out.println(doubleArray[2]);
        System.out.println("array length is " + array.length);
    }
}
