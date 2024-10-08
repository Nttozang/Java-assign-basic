package CollectionFramework;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        //Stack - LIFO(Last-in-first-out)
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        System.out.println(stack.peek());

        stack.push(2);
        System.out.println(stack.peek());
        stack.push(4);
        System.out.println(stack.peek());
        stack.push(5);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        //isEmpty(): ตรวจสอบว่า Stack ว่างหรือไม่
        if(stack.empty()){
            System.out.println("stack empty");
        }else {
            System.out.println("stack contain element");
        }
        //size(): คืนค่าจำนวน item ใน Stack
        System.out.println("Current size : "+stack.size());
    }
}
