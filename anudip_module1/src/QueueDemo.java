import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> q1 = new LinkedList<>();
        q1.add("monday");
        q1.add("tuesday");
        q1.add("wednesday");
        q1.add("thursday");

        System.out.println(q1.peek());
        System.out.println(q1.poll());
        System.out.println(q1);


    }
}
