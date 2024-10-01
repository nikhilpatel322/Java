public class LinkedListDS {
    private static class Node {
        Integer data;
        Node next;

        Node(Integer data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public LinkedListDS() {
        head = null;
    }

    public void insertAtEnd(Integer data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public void insertAtHead(Integer data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void delete(Integer data) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.data.equals(data)) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && !current.next.data.equals(data)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        } else {
            System.out.println("Element not found.");
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListDS linkedList = new LinkedListDS();

        linkedList.insertAtEnd(1);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(3);
        linkedList.insertAtHead(0);

        System.out.println("Linked List:");
        linkedList.printList();

        linkedList.delete(2);
        System.out.println("After deleting 2:");
        linkedList.printList();

        linkedList.delete(5);
    }
}
