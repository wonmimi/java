package DataStructure;

import java.util.ArrayList;
/*
    ArrayList 클래스 활용해서 enqueue, dequeue 기능 구현
 */
public class QueueMyArrayList<T> {
    private ArrayList<T> queue = new ArrayList<>();

   public boolean enqeue(T t){
        return queue.add(t);
    }

    public T deque(){
       if(queue.isEmpty()){
           return null;
       }
       return queue.remove(0); // FIFO
    }

    public static void main(String[] args) {
        QueueMyArrayList<Integer> q1 = new QueueMyArrayList<Integer>();
        q1.enqeue(321);
        q1.enqeue(1013);
        System.out.println(q1.deque());
        System.out.println(q1.deque());

        QueueMyArrayList<String> q2 = new QueueMyArrayList<String>();
        q2.enqeue("ㅎㅎ");
        q2.enqeue("wm");
        q2.enqeue("jm");
        System.out.println(q2.deque());

    }


}
