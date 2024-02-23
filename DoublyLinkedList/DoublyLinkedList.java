package DoublyLinkedList;

public class DoublyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public Node createDoublyLinkedList(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void add(int value) {
        if (head == null) {
            createDoublyLinkedList(value);
        } else {
            Node node = new Node(value);
            tail.next = node;
            node.prev = tail;
            tail = node;
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
            if (head != null) {
                head.prev = node;
            } else {
                tail = node;
            }
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
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
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
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        } else if (location == size - 1) {
            deletedValue = tail.value;
            tail = tail.prev;
            tail.next = null;
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
