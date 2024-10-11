import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        HashSet<Integer> set = new HashSet<>();
        for (int i : array) {
            set.add(i);
        }
        System.out.println(set);
    }
}
