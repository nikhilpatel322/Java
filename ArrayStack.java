import java.util.Arrays;

public class ArrayStack {
    private int[] data;
    private int top;
    private int capacity;

    public ArrayStack(int capacity) {
        this.data = new int[capacity];
        this.top = -1;
        this.capacity = capacity;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }

        top++;
        data[top] = element;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; 
        }

        int element = data[top];
        top--;
        return element;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; 
        }

        return data[top];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println(Arrays.toString(data).substring(1, top + 2));
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack elements: ");
        stack.display();

        int removedElement = stack.pop();
        System.out.println("Removed element: " + removedElement);

        System.out.println("Stack elements after removal: ");
        stack.display();
    }
}