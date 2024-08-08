import java.util.Stack;

//Create a stack of strings, push elements "Apple", "Banana",
// "Cherry", and display the top element using the peek operation.
// Check and display if the stack is empty. Find the size of a stack.
public class StackOp2 {

    public static void main(String[] args) {
        Stack<String> fruits = new Stack<String>();
        String[] arr = {"Apple", " Banana", "Cherry"};
        for (int i = 0; i < arr.length; i++) {
            fruits.push(arr[i]);
        }
        System.out.println(fruits.peek());
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.size());
    }
}
