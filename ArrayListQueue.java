import java.util.ArrayList;
import java.util.List;

public class ArrayListQueue {
    private List<Integer> data;

    public ArrayListQueue() {
        data = new ArrayList<>();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public void enqueue(int element) {
        data.add(element);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return data.remove(0);
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1; 
        }

        return data.get(0);
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println(data);
    }

    public static void main(String[] args) {
        ArrayListQueue queue = new ArrayListQueue();

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