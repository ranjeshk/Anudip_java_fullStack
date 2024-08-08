

public class RemoveWhitespace {
    public static void main(String[] args) {
    	String input = "Its raining in mumbai!";

      
        String result = removeWhitespace(input);

        // Output 
        System.out.println("Original String: " + input);
        System.out.println("String without white spaces: " + result);
    }

    // Method to remove all white spaces from a string
    public static String removeWhitespace(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isWhitespace(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

