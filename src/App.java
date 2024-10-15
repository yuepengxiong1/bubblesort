import classes.ArrayHandler;
import classes.ReadWriteHandler;
import classes.SortingAlgorithms;


public class App {
    public static void main(String[] args) throws Exception {

        //if user passes nothing
        if (args.length == 0) {
            System.out.println("There was nothing passed into the program as an argument. Please provide a textfile or a numerical value");

        } else if (args.length == 1) { 
           String store = args[0];
           int array[] = new int[0];

           //Check if the passed argument is a passed file or a numerical value
           if (store.contains(".txt") == true){
            array = new int[ReadWriteHandler.getArraySize(store)]; //initialize the array with the size of the file
            array = ReadWriteHandler.readArrayfromFile(store);// read array from file and put into variable
            System.out.println("Is the intial array sorted? " + ArrayHandler.isSorted(array));

            long startTime = System.currentTimeMillis();
            SortingAlgorithms.bubbleSort(array); //sort the array
            long endTime = System.currentTimeMillis();
            System.out.println("Bubble Sort took " + (endTime - startTime) + "ms to sort the array");
            System.out.println("Is the final array sorted? " + ArrayHandler.isSorted(array));
            ReadWriteHandler.writeArraytoFile(array, "sortedGivenArray.txt");//write the array to new file
            

            //if the passed argument is a numerical value and does not include .txt
            } else if (ArrayHandler.isNumeric(store) == true){
                array = new int[Integer.parseInt(store)]; //initialize the array with the size of the file
                array = ArrayHandler.generateRandomArray(Integer.parseInt(store));
                System.out.println("Generated random array of size " + store);
                ReadWriteHandler.writeArraytoFile(array, "randomlyGeneratedArrayof[" + store + "]Numbers.txt");//write the array to new file
                System.out.println("Is the intial array sorted? " + ArrayHandler.isSorted(array));

                System.out.println("Starting Bubble Sort:");
                long startTime = System.currentTimeMillis();
                SortingAlgorithms.bubbleSort(array); //sort the array
                long endTime = System.currentTimeMillis();

                System.out.println("Bubble Sort took " + (endTime - startTime) + "ms to sort the array");
                System.out.println("Is the final array sorted? " + ArrayHandler.isSorted(array));
                
                ReadWriteHandler.writeArraytoFile(array, "sortedRandomArray.txt");//write the array to new file

              } else {
                System.out.println("Please provide a valid textfile or a numerical value");
              }
        } else {
            System.out.println("Please provide only one argument. Either a textfile or a numerical value");
        } 
    }
}
