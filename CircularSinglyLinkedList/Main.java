package CircularSinglyLinkedList;

public class Main {
    public static void main(String[] args){
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCircularSinglyLinkedList(10);
        csll.add(20);
        csll.add(30);
        csll.add(40);
        csll.add(50);
        csll.insert(32, 3);
        System.out.println("Traverse 1");
        csll.traverseList();
        csll.delete(3);
        csll.insert(674, 10);
        System.out.println("Traverse 2");
        csll.traverseList();


    }
}
