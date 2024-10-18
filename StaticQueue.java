import java.util.Scanner;

public class StaticQueue {
    private static final int MAX = 5;  // Define the maximum size of the queue
    private static int[] queue = new int[MAX];
    private static int front = -1, rear = -1;

    public static void enqueue(int value) {
        if (rear == MAX - 1) {
            System.out.println("Queue is full!");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            queue[rear] = value;
            System.out.println(value + " enqueued.");
        }
    }

    public static void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println(queue[front] + " dequeued.");
            front++;
        }
    }

    public static void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty!");
        } else {
            System.out.print("Queue: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, value;

        while (true) {
            System.out.println("\n1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    value = sc.nextInt();
                    enqueue(value);
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
