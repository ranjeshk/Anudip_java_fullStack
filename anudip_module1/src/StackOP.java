import java.util.Stack;

public class StackOP {
    public static void main(String[] args) {
        Stack<Integer> numStack = new Stack<Integer>();
        //checking if stack is empty for not
        System.out.println(numStack.isEmpty());

        //adding elements to the stack
        for (int i = 0; i < 10; i++) {
            numStack.push(i);
        }
        //printing the stack
        System.out.println(numStack);
        //using add we can add element at a specific index in the stack
        numStack.add(0,50);
        System.out.println(numStack);

        //element at the top of the stack
        System.out.println(numStack.peek());

        //removing all the elements from the stack
        for (int i = 0; i < 10; i++) {
            numStack.pop();
        }
        System.out.println(numStack.isEmpty());

    }
}
