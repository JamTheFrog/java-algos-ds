package Arrays;

public class Main {
    static int[] passArray = {1,2,3,15,5,6,7,8,9,15,11,12,13,14,15,16,17,18,19,20};
    public static void main(String[] args){
        int[] array = {1,2,69,15,5,6,7,8,9,15,11,12,13,14,15,16,17,18,19,20};
        SingleDimensionArray singleDimensionArray = new SingleDimensionArray(array);
        singleDimensionArray.sort();
        singleDimensionArray.traverseArray();
        
    }

}
