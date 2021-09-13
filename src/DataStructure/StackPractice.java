package DataStructure;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        System.out.println(stack.push(2));
        stack.push(3);
        System.out.println(stack.pop());
        stack.push(5);
        stack.push(2);
        stack.push(6);
        stack.pop();
        stack.push(7);
        System.out.println("top : "+stack.peek()); // top 삭제는 X
        System.out.println("= = search = = ");
        System.out.println(stack.search(7)); // 1
        System.out.println(stack.search(9)); // -1
        System.out.println(stack.search(2)); // 2 (첫번쨰로 찾은)
        System.out.println(stack.search(1)); // 5
        System.out.println("= = pop = = ");
        while (!stack.empty()){
            System.out.println(stack.pop());
        }
//        System.out.println(stack.pop()); // EmptyStackException


    }
}
