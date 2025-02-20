package codewithfreddy;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {

        // stack = LIFO data structure. Last-In First-Out
        // stores objects into a sort of "vertical tower"
        // push() to add to the top
        // pop() to remove from the top

        Stack<String> stack = new Stack<String>();
//        System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("GTA");
        stack.push("FFVII");

        stack.pop();

        // to check item that is on top of the stack
        System.out.println(stack.peek());
        // to search specific item from stack
        System.out.println(stack.search("GTA"));
        System.out.println(stack);

        // uses of stacks
        // 1. undo/redo features in text editors
        // 2. moving back/forward through browser history
        // 3. backtracking algorithms ( maze, file directories)
        // 4. calling functions ( call stack)

//        for( int i = 0; i< 1000000; i++)
//        {
//            stack.push("Fallout76");
//        }

    }
}