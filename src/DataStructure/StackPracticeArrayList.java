package DataStructure;

import java.util.ArrayList;

/*
- JAVA ArrayList 클래스를 활용해서 스택의 push, pop 기능 구현
 */
public class StackPracticeArrayList<T> {
    private ArrayList<T> stack = new ArrayList<>();

    public boolean push(T data){
        return stack.add(data);
    }

    public T pop(){
        if(stack.isEmpty()) return null;
        return stack.remove(stack.size()-1); // LIFO
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        StackPracticeArrayList<Integer> stack = new StackPracticeArrayList<>();
        stack.push(6);
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
        stack.push(3);

        System.out.println(" P O P");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println(stack.pop());

        StackPracticeArrayList<String> stackString = new StackPracticeArrayList<>();
        stackString.push("Hi");
        System.out.println(stackString.pop());

    }
}
