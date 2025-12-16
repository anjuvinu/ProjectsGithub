import java.util.Queue;
import java.util.LinkedList
public static class LearnQueue{

    public static void learnQueueDS{

        /**Queue FIFO DS ,used in keyboard buffer ,printer ,
         Collection designed for holding elements prior to processing linear data structure
         enqueue -offer /add
         dequeue - poll /remove
         but add and remove will throw exceptions so will use offer,poll and peek
        Queue is an interface so will use Linkedlist /priority queue to instantiate
         ***/

        Queue<String> queue = new LinkedList<>();

       //since queue implements collection we can use collection methods like isEmpty(),contains etc
        System.out.println(queue.isEmpty());

        queue.offer("Jim");
        queue.offer("Anton");
        queue.offer("Daniel");
        queue.offer("Karen");

        System.out.print(queue);
        queue.peek();
        queue.poll();

        //if not found element will throw exceptions so better to use peek
        queue.element();


    }



}