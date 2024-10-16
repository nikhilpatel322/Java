class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DynamicLinkedList {
    Node head;

    public DynamicLinkedList() {
        this.head = null;
    }

    public void insertAtFront(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertAtPosition(int position, int value) {
        if (position < 1) {
            System.out.println("Invalid position!");
            return;
        }

        Node newNode = new Node(value);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        for (int i = 1; i < position - 1; i++) {
            if (temp == null) {
                System.out.println("Position out of bounds!");
                return;
            }
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteFromFront() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        head = head.next;
    }

    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteFromPosition(int position) {
        if (position < 1) {
            System.out.println("Invalid position!");
            return;
        }

        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (position == 1) {
            head = head.next;
            return;
        }

        Node temp = head;
        for (int i = 1; i < position - 1; i++) {
            if (temp == null || temp.next == null) {
                System.out.println("Position out of bounds!");
                return;
            }
            temp = temp.next;
        }

        temp.next = temp.next.next;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DynamicLinkedList list = new DynamicLinkedList();

        list.insertAtFront(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtPosition(2, 15);
        list.printList();

        list.deleteFromPosition(2);
        list.printList();

        list.deleteFromFront();
        list.printList();

        list.deleteFromEnd();
        list.printList();
    }
}
