package classes;

public class SortingAlgorithms {
    public static void bubbleSort(int[] array){
        int comparisons = 0;
        int passes = 0;
        //first loop is number of passes
        for(int i=0; i< array.length - 1; i++){
            boolean swapped = false; // for each pass, check if there is a swap that occured from previous pass, if not, array is sorted
            //second loop to compare each element
            for(int j=0; j < array.length - i - 1; j++){
                //compare array at now and next index
                //if array at j is bigger, swap
                if(array[j] > array[j+1]){
                    int temp = array[j];// saves the value of array[j] to temp
                    array[j] = array[j+1];// repleaces the value of array[j] with array[j+1]
                    array[j+1] = temp; // replaces the value of array[j+1] with temp
                    swapped = true; // if there is a swap, set swapped to true
                    comparisons++;
                }
            }
            //if there is no swap, break the loop
            if (!swapped){
                break;
            }
        }
    }
}
