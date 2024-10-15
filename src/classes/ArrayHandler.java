package classes;

import java.util.Random;

public class ArrayHandler {
    public static boolean isSorted(int array[]){
        for(int i = 0; i < array.length - 1; i++){
            //check for each element, if the current element is greater than the next element, return false
            if(array[i] > array[i+1]){
                return false; 
            }
        }
        //otherwise return true if the array is sorted
        return true;
    }

    public static int[] generateRandomArray(int size){
        Random random = new Random();
        int array[] = new int[size];   
        for(int i = 0; i < size; i++){
            array[i] = random.nextInt();
        }
        return array;
    }
}
