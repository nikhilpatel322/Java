public class StaticLinkedList {
    static final int MAX_SIZE = 100;

    int[] data = new int[MAX_SIZE];
    int[] next = new int[MAX_SIZE];
    int head = -1;
    int free = 0;
    int size = 0;

    public StaticLinkedList() {
        for (int i = 0; i < MAX_SIZE - 1; i++) {
            next[i] = i + 1;
        }
        next[MAX_SIZE - 1] = -1;
    }

    public boolean isFull() {
        return free == -1;
    }

    public boolean isEmpty() {
        return head == -1;
    }

    public void addAtPosition(int position, int value) {
        if (position < 1 || position > size + 1) {
            System.out.println("Invalid position!");
            return;
        }

        if (isFull()) {
            System.out.println("List is full!");
            return;
        }

        int newNode = free;
        free = next[free];

        data[newNode] = value;

        if (position == 1) {
            next[newNode] = head;
            head = newNode;
        } else {
            int temp = head;
            for (int i = 1; i < position - 1; i++) {
                temp = next[temp];
            }

            next[newNode] = next[temp];
            next[temp] = newNode;
        }
        size++;
    }

    public void deleteFromPosition(int position) {
        if (position < 1 || position > size) {
            System.out.println("Invalid position!");
            return;
        }

        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }

        int temp;

        if (position == 1) {
            temp = head;
            head = next[head];
        } else {
            int prev = head;
            for (int i = 1; i < position - 1; i++) {
                prev = next[prev];
            }

            temp = next[prev];
            next[prev] = next[temp];
        }

        next[temp] = free;
        free = temp;
        size--;
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }

        int temp = head;
        while (temp != -1) {
            System.out.print(data[temp] + " ");
            temp = next[temp];
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StaticLinkedList list = new StaticLinkedList();

        list.addAtPosition(1, 10);
        list.addAtPosition(2, 20);
        list.addAtPosition(3, 30);
        list.addAtPosition(2, 15);

        list.printList();

        list.deleteFromPosition(2);
        list.printList();

        list.deleteFromPosition(1);
        list.printList();

        list.deleteFromPosition(2);
        list.printList();
    }
}
