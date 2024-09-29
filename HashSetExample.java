import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Mango");

        boolean isAdded = hashSet.add("Apple");
        System.out.println("Is 'Apple' added again? " + isAdded);

        System.out.println("HashSet: " + hashSet);

        boolean containsBanana = hashSet.contains("Banana");
        System.out.println("Does the set contain 'Banana'? " + containsBanana);

        hashSet.remove("Mango");
        System.out.println("After removing 'Mango': " + hashSet);

        System.out.println("Iterating over the HashSet:");
        for (String item : hashSet) {
            System.out.println(item);
        }

        System.out.println("Size of the HashSet: " + hashSet.size());
    }
}
