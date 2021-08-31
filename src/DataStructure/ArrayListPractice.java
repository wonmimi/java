package DataStructure;


import java.util.ArrayList;

public class ArrayListPractice
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(0,7);
//        list.set(0,7);
        System.out.println("size"+list.size());

        for(int i=0; i<list.size(); i++){
            System.out.println("i :"+i+" => "+list.get(i));
        }

        list.remove(0); // 인덱스 앞으로 당겨진다.
        System.out.println("size"+list.size());

        for(int i=0; i<list.size(); i++){
            System.out.println("i :"+i+" => "+list.get(i));
        }

    }
}
