import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // Insertion
        map.put(1, "A");
        map.put(2, "B");

        // Deletion
        map.remove(1);

        // Updation (replace value)
        map.put(2, "C");

        System.out.println(map);
    }
}