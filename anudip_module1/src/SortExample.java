import java.util.Arrays;

public class SortExample {

    public static void main(String[] args) {
        // Sorting integers
        Integer[] integers = {8, 4, 3, 5, 6};
        Arrays.sort(integers);
        System.out.println("Sorted integers: " + Arrays.toString(integers));

        // Sorting strings
        String[] strings = {"C", "O", "I", "P", "U"};
        Arrays.sort(strings);
        System.out.println("Sorted strings: " + Arrays.toString(strings));
    }
}
