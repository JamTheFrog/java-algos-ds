package SingleyLinkedList;

public class Main {
    public static void main(String[] args){
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.createSingleyLinkedList(10);
        sll.add(20);
        sll.add(30);
        sll.add(40);
        sll.add(50);
        sll.insert(32, 3);
        sll.traverseList();
    }
}
