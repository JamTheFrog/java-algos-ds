package CircularDoublyLinkedList;

public class CircularDoublyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public CircularDoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public Node createCircularDoublyLinkedList(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        head.prev = tail;
        tail.next = head;
        size = 1;
        return head;
    }

    public void add(int value) {
        if (head == null) {
            createCircularDoublyLinkedList(value);
        } else {
            Node node = new Node(value);
            tail.next = node;
            node.prev = tail;
            tail = node;
            tail.next = head;
            head.prev = tail;
            size++;
        }
    }

    public void insert(int value, int location) {
        if (location < 0 || location > size) {
            System.out.println("Invalid location");
            return;
        }
        if (location == 0) {
            Node node = new Node(value);
            node.next = head;
            node.prev = tail;
            head.prev = node;
            tail.next = node;
            head = node;
        } else if (location == size) {
            add(value);
        } else {
            Node node = new Node(value);
            Node temp = head;
            for (int i = 0; i < location - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            node.prev = temp;
            temp.next.prev = node;
            temp.next = node;
        }
        size++;
    }

    public void traverseList() {
        Node temp = head;
        int count = 0;
        while (count < size) {
            System.out.print(temp.value + " ");
            temp = temp.next;
            count++;
        }
        System.out.println();
    }

    public int locationOf(int value) {
        int pos = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.value == value) {
                return pos;
            }
            temp = temp.next;
            pos++;
            if (temp == head) {
                break;
            }
        }
        return -1;
    }

    public int delete(int location) {
        if (head == null || location < 0 || location >= size) {
            System.out.println("Invalid location");
            return -1;
        }
        int deletedValue;
        if (location == 0) {
            deletedValue = head.value;
            head = head.next;
            head.prev = tail;
            tail.next = head;
        } else if (location == size - 1) {
            deletedValue = tail.value;
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
        } else {
            Node temp = head;
            for (int i = 0; i < location; i++) {
                temp = temp.next;
            }
            deletedValue = temp.value;
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        size--;
        return deletedValue;
    }

    public void deleteList() {
        head = null;
        tail = null;
        size = 0;
    }
}