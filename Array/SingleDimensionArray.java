package Array;

import java.util.Random;

public class SingleDimensionArray {
    int arr[] = null;

    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public SingleDimensionArray(int[] array){
        this.arr = array;
    }

    public void insert(int location, int valueToBeInserted) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted;
                System.out.println("Value successfully inserted");
            } else {
                System.out.println("This cell is already occupied");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void traverseArray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void sequentialSearch(int target) {
        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    System.out.println("The target element was found at the index " + i);
                    return;
                }
            }
            System.out.println("The target element was not found in the array");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        ;

    }

    public int deleteValueFromArray(int target) {
        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    arr[i] = Integer.MIN_VALUE;
                    System.out.println("The target element was deleted");
                    return i;
                }
            }
            System.out.println("The target element was not found in the array");
            return -1;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }

    public int deleteAndRealignRecursive(int target) {
        int val;
        int totalDeleted = 0;
        do {
            val = deleteValueFromArray(target);
            if (val != -1) {
                totalDeleted++;
                realignArray(val);
            }
        } while (val != -1);
        
        return totalDeleted > 0 ? totalDeleted : -1;
    }
    
    private void realignArray(int index) {
        if (index < arr.length - 1) {
            if (arr[index] == Integer.MIN_VALUE) {
                arr[index] = arr[index + 1];
                arr[index + 1] = Integer.MIN_VALUE;
            }
            realignArray(index + 1);
        }
    }
    public int deleteAndRealignItterative(int target){
        int writeIndex = 0;
        int deletedCount = 0; 
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != target) {
                arr[writeIndex++] = arr[i];
            } else {
                deletedCount++;
            }
        }
    
        int newSize = arr.length - deletedCount;
        int[] newArr = new int[newSize];
        System.arraycopy(arr, 0, newArr, 0, newSize);
        arr = newArr;
        
        return deletedCount > 0 ? deletedCount : -1;
    }
    private static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        return;
    }
    private static int partition(int[] array, int lowIndex, int highIndex, int pivot){
        int lp = lowIndex;
        int rp = highIndex;
        
        while(lp<rp){
            while(array[lp] <= pivot && lp<rp){
                lp++;
            }
            while(array[rp] >= pivot && lp<rp){
                rp--;
            }
            swap(array, lp, rp);
        }
        swap(array, lp, highIndex);
        return lp;
    }
    private static void quicksort(int[] array, int lowIndex, int highIndex){
        
        if(lowIndex >= highIndex) return;
        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = array[pivotIndex];
        swap(array, pivotIndex, highIndex);
        int lp = partition(array, lowIndex, highIndex, pivot);
        quicksort(array, lowIndex, lp-1);
        quicksort(array, lp+1, highIndex);
        
    } 
    public int[] sort(){
         quicksort(this.arr, 0, this.arr.length-1);
         return this.arr;
    }

}
