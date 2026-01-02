import java.util.Collections;
import java.util.Queue;
import java.util.PriorityQueue;
public static class PriorityQueue {

    public static void learnPriorityQueueDS {
        //FIFO but in order values are displayed in pull method  (default is asc)
        Queue<String> queue = new PriorityQueue<>();
        queue.offer("B");
        queue.offer("A");
        queue.offer("F");
        queue.offer("K");
        queue.offer("H");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        //descending order
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer(3.2);
        queue.offer(4.3);
        queue.offer(5.6);
        queue.offer(1.2);
        queue.offer(.2);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }





}