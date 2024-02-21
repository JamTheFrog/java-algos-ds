package Arrays;

public class SingleDimensionArray {
    int arr[] = null;

    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
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
    public void traverseArray(){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public void sequentialSearch(int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("The target element was found at the index " + i);
                return;
            }
        }
        System.out.println("The target element was not found in the array");
        return;

    }
}
