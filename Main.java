import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        int n = 10; // first n natural numbers
        int k = 3;  // remove k elements

        LinkedList<Integer> list = new LinkedList<>();

        // 1) Insert first n natural numbers at end
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        System.out.println("After adding n numbers: " + list);

        // 2) Remove k values from start
        for (int i = 0; i < k; i++) {
            list.removeFirst();
        }
        System.out.println("After removing k elements: " + list);

        // 3) Insert 11,12,13 at beginning
        list.addFirst(13);
        list.addFirst(12);
        list.addFirst(11);
        System.out.println("After adding 11,12,13 at beginning: " + list);

        // 4) Print even position elements (index starts from 0)
        System.out.print("Even position elements: ");
        for (int i = 0; i < list.size(); i += 2) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // 5) Verify poll() and peek()
        System.out.println("Peek element: " + list.peek()); // first element
        System.out.println("Poll element: " + list.poll()); // removes first
        System.out.println("After poll: " + list);
    }
}