import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    public static void main(String[] args) {
        
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);


        System.out.println("Queue elements: " + queue);

        int removedElement = queue.remove();
        System.out.println("Removed element: " + removedElement);

        System.out.println("Queue elements after removal: " + queue);
    }
}