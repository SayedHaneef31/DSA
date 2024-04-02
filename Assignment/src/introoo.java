import java.util.ArrayList;

public class introoo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        //ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println(lastRemaining(9));
        // Adding elements to the ArrayList
        //System.out.println("ArrayList after removing alternate elements from start: " + arrayList);
    }

    public static int lastRemaining(int n) {
        boolean leftToRight = true;
        int remaining = n;
        int head = 1;
        int step = 1;

        while (remaining > 1) {
            if (leftToRight || remaining % 2 == 1) {
                head += step;
            }
            remaining /= 2;
            step *= 2;
            leftToRight = !leftToRight;
        }

        return head;
    }
}
