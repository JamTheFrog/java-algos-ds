package Arrays;

public class Main {
    static int[] passArray = {1,2,3,15,5,6,7,8,9,15,11,12,13,14,15,16,17,18,19,20};
    public static void main(String[] args){
        SingleDimensionArray array = new SingleDimensionArray(passArray);
        array.deleteAndRealignRecursive(15);
        array.deleteAndRealignItterative(1);
        array.traverseArray();
    }

}
