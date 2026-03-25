import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        // Insertion
        set.add(10);
        set.add(20);
        set.add(30);

        // Deletion
        set.remove(20);

        // Updation (Not direct → remove + add)
        set.remove(10);
        set.add(50);

        System.out.println(set);
    }
}