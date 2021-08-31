package DataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(10);
        queue.remove(); // null일경우 error (NoSuchElementException)
        queue.offer(7);
        queue.poll(); // null일경우 null 리턴
        queue.offer(3);
        queue.offer(99);
        queue.offer(2);
        queue.offer(1);


        while (!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.poll();
//            System.out.println(queue.poll());
        }
    }
}
