public class MyStaticExample {

    // Static variable
    public static int totalCount = 0;

    // Constructor 
    public MyStaticExample() {
        // Increment the total count whenever an object is created
        totalCount++;
    }

    public static void main(String[] args) {
        ///// Create three objects 
        MyStaticExample obj1 = new MyStaticExample();
        MyStaticExample obj2 = new MyStaticExample();
        MyStaticExample obj3 = new MyStaticExample();

        //// Display
        System.out.println("Total objects created: " + totalCount);
    }
}
