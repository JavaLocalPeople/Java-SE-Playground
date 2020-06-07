import java.util.LinkedList;
import java.util.Queue;

public class InterfaceQueue
{
    /*
    *   - Summary of Queue methods
    *               Throws exception / Returns special value
    *       Insert       add(e)               offer(e)
    *       Remove       remove()             poll()
    *       Examine      element()            peek()
    *
    *   - In FIFO queue, all new elements are inserted at the tail of the queue.
    *   - [offer] method is designed for use when failure is a normal, rather than exceptional occurrence,
    *   for example, in fixed-capacity (or bounded) queues.
    *   - [element] and [peek] methods return, but do not remove, the head of the queue.
    *   - Queue interface does not define the blocking queue methods, which common in concurrent programming.
    *   See BlockingQueue interface.
    *   - null should not be inserted into a Queue.
    *
    *
    *
    * */
    public static void main(String[] args)
    {
        System.out.println("Hello");

        Queue<Integer> q = new LinkedList<>();

        q.offer(1);
        q.add(2);

        System.out.println("q size is: " + q.size());

        int head = q.peek();
        System.out.println("The head of the queue is: " + head);

        int remove = q.poll();
        System.out.println("Noe remove the value in queue: " + remove);
    }
}
