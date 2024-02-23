package CircularSinglyLinkedList;

public class CircularSinglyLinkedList{
    public Node head;
    public Node tail;
    public int size;

    public CircularSinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public Node createCircularSinglyLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = node;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public int add(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createCircularSinglyLinkedList(nodeValue);
        } else {
            tail.next = node;
            node.next = head;
            tail = node;
        }
        size++;
        return size;
    }

    public int insert(int nodeValue, int location) {
        Node node = new Node(nodeValue);
        if (head == null) {
            System.out.println("head");
            createCircularSinglyLinkedList(nodeValue);
        } else if (location == 0) {
            node.next = head;
            head = node;
            tail.next = node;
        } else if (location >= size) {
            add(nodeValue);
        } else {
            int i = 0;
            Node temp = head;
            while (i < location - 1) {
                System.out.println("traversing");
                temp = temp.next;
                i++;
            }
            Node nextNode = temp.next;
            temp.next = node;
            node.next = nextNode;
            System.out.println("nextNode: " + nextNode);
            System.out.println("temp.next" + temp.next);
            System.out.println("node.next" + node.next);

        }
        size++;
        return size;
    }

    public void traverseList() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.println(temp.value);
                temp = temp.next;
            } while (temp != head);
        }
    }

    public int locationOf(int location) {
        int i = 0;
        Node temp = head;
        while (i < location) {
            temp = temp.next;
            i++;
        }
        return i;
    }

    public int delete(int location) {
        if (head == null) {
            System.out.println("head");
            return -1;
        } else if (location == 0) {
            Node temp = head;
            head = head.next;
            tail.next = head;
            size--;
            return temp.value;
        } else if (location >= size) {
            System.out.println("tail");
            Node temp = head.next;
            while(temp.next.next != head){
                temp = temp.next;
            }
            tail.next = null;
            tail = temp;
            tail.next = head;
            size--;
            return temp.value;
        } else {
            int i = 0;
            Node temp = head;
            while (i < location - 1) {
                temp = temp.next;
                i++;
            }
            Node nextNode = temp.next;
            temp.next = nextNode.next;
            size--;
            return nextNode.value;
        }
    }

    public void deleteList() {
        head = null;
        tail = null;
    }
}
