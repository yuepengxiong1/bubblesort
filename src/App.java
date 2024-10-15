import java.util.Random;
import classes.ReadWriteHandler;
import classes.SortingAlgorithms;
import classes.ArrayHandler;


public class App {
    public static void main(String[] args) throws Exception {

        //if user passes nothing
        /*if (args.length == 0) {
            System.out.println("Please provide the filename as an argument");
            return;
        } else if (args.length == 1) {*/
           String store = "filename.txt";
           int array[] = new int[0];
           int lines = 0;

           //Check if the passed argument is a passed file or a numerical value
           if (store.contains(".txt") == true){
            lines = ReadWriteHandler.getArraySize(store);
            array = new int[lines];
            array = ReadWriteHandler.readArrayfromFile(store);
            
            

            System.out.println(array[0]);
            System.out.println(array[1]);
           }
       // }
        /*
        int array[] = new int[100];
        Random number = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = number.nextInt(10000);
        }

        ReadWriteHandler.writeArraytoFile(array, "filename.txt");
        System.out.println("Array before sorting: ");
        // System.out.println(java.util.Arrays.toString(array)); //shortcut to print array instead of for loop
        System.out.println(ArrayHandler.isSorted(array));

        long start = System.currentTimeMillis();
        System.out.println("Array after sorting: ");
        SortingAlgorithms.bubbleSort(array);
        long end = System.currentTimeMillis();
        // System.out.println(java.util.Arrays.toString(array));
        System.out.println(ArrayHandler.isSorted(array));
        System.out.println("Time taken: " + (end - start) + "ms");
        */

    }

    
}
