package collectionframework;

import java.util.Stack;

public class Prog05_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);

        stack.addFirst(1000);
        System.out.println(stack);

        System.out.println(stack.empty());
        System.out.println(stack.size());
        System.out.println(stack.search(3));
    }
}
