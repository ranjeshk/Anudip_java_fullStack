import java.util.LinkedList;

class IntegerLinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList of integers
        LinkedList<Integer> numbers = new LinkedList<>();

        // Add elements to the LinkedList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Print all the elements of the LinkedList
        System.out.println("Elements of the LinkedList:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
