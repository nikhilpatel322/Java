public class Box<T> {
    private T item;

    // Setter for the item
    public void set(T item) {
        this.item = item;
    }

    // Getter for the item
    public T get() {
        return item;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Box for Integer values
        Box<Integer> intBox = new Box<>();
        intBox.set(10);  // Set Integer value
        System.out.println("Integer value: " + intBox.get());

        // Create a Box for String values
        Box<String> strBox = new Box<>();
        strBox.set("Hello");  // Set String value
        System.out.println("String value: " + strBox.get());
    }
}
