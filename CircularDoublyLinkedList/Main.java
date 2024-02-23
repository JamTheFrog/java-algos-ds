package CircularDoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.add(1);
        cdll.add(2);
        cdll.add(3);
        cdll.traverseList(); 
        cdll.insert(4, 1);
        cdll.traverseList(); 
        cdll.delete(2);
        cdll.traverseList(); 
        cdll.deleteList();
        cdll.traverseList(); 
    }
}
