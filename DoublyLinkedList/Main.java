package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.add(1);
        dll.add(2);
        dll.add(3);
        dll.traverseList(); 
        dll.insert(4, 1);
        dll.traverseList(); 
        dll.delete(2);
        dll.traverseList(); 
        dll.deleteList();
        dll.traverseList(); 
    }
}

