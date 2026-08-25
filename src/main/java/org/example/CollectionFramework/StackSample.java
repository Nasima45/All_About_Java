package org.example.CollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackSample {
    public static void main(String[] args) {
      Stack<Integer> stack=new Stack<>();
        stack.add(90);
        stack.add(20);
        stack.add(30);
        stack.add(60);
        stack.push(80);
        System.out.println("after adding one more in first: "+stack);
        stack.pop();
        System.out.println("after deleting the first one: "+ stack);
//print what is the first value ->60
        System.out.println(stack.peek());
        System.out.println(stack.search(9));

    }
}
