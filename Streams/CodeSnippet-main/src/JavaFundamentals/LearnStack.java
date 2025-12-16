import java.util.Stack;
public static class LearnStack {

    public static void learnStackDS

    {
        //LIFO datastructre , acts as a vertical tower
        // used in undo/redo operations, back and forth in browser

        Stack<String> stackExample = new Stack<String>();
        //to add to the top
        stackExample.push("a");
        stackExample.push("b");
        stackExample.push("c");
        stackExample.push("d");
        stackExample.push("e");

        System.out.println(stackExample);
        //remove from the top (last element)
        stackExample.pop();
        System.out.println(stackExample);
        //to check last element
        // if no element present then it will throw EmptyStackException
        stackExample.peek();
        System.out.println(stackExample);
        //return the index which starts at 1
        //if index not found return -1
        //last element will be the top one so index is 1
        stackExample.search("a");
        System.out.println(stackExample);
    }
}

}