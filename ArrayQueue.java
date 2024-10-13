public class ArrayQueue {
    private int[] data;
    private int front;
    private int rear;
    private int capacity;

    public ArrayQueue(int capacity) {
        this.data = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.capacity = capacity;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (rear + 1) % capacity == front;
    }

    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        rear = (rear + 1) % capacity;
        data[rear] = element;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1; // Or throw an exception
        }

        int element = data[front];
        front = (front + 1) % capacity;
        return element;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1; // Or throw an exception
        }

        return data[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        for (int i = front; i <= rear; i = (i + 1) % capacity) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Queue elements: ");
        queue.display();

        int removedElement = queue.dequeue();
        System.out.println("Removed element: " + removedElement);

        System.out.println("Queue elements after removal: ");
        queue.display();
    }
}