import java.util.Scanner;

public class StaticStack {
    private int[] stack;
    private int top;
    private int maxSize;

    public StaticStack(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full! Cannot push " + value);
            return;
        }
        stack[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot pop.");
            return -1;
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stack[top];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StaticStack stack = new StaticStack(5);
        Scanner scanner = new Scanner(System.in);
        int choice, value;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter value to push: ");
                        value = scanner.nextInt();
                        stack.push(value);
                        break;
                    case 2:
                        System.out.println("Popped value: " + stack.pop());
                        break;
                    case 3:
                        System.out.println("Top element is: " + stack.peek());
                        break;
                    case 4:
                        stack.display();
                        break;
                    case 5:
                        System.out.println("Exiting.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice!");
                }
            } else {
                System.out.println("Invalid choice!");
                scanner.next(); // Consume the invalid input
            }
        }
    }
}
