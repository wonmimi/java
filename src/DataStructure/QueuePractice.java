package DataStructure;

import java.util.LinkedList;
import java.util.Queue;


public class QueuePractice {


    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        System.out.println(queue.offer(1)); // true 리턴
        queue.offer(10);
        System.out.println(queue.remove()); // 꺼낸 원소 리턴
        queue.offer(7);
        System.out.println(queue.poll()); // 꺼낸 원소 리턴, null일경우 null 리턴
        queue.offer(99);
        System.out.println(queue.peek()); // 꺼내고 삭제는 X
        queue.offer(2);
        System.out.println(queue.add(1));
        queue.poll();
        queue.poll();
        queue.poll();
        queue.remove(); // null일 경우 error (NoSuchElementException)
        queue.poll(); //null 리턴

        System.out.println(queue); // [7, 99, 2, 1]

        while (!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.poll();
        }
    }

}
