
import java.util.*;

public class SolutionOptimized {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();

        int n = in.nextInt();
        int m = in.nextInt();
        int max = -1;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            deque.offer(num);
            set.add(num);

            if (deque.size() == m + 1) {
                int old = deque.remove();

                if (!deque.contains(old)) {
                    set.remove(old);
                }
            }

            max = Math.max(max, set.size());
        }

        System.out.println(max);
    }
}
