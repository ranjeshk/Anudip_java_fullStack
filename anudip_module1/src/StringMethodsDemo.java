

public class StringMethodsDemo {
    public static void main(String[] args) {
        String text = "Marine drive is closed due to heavy rain here in Mumbai";
        
        //replace
        String replacedText = text.replace("heavy", "extreme");
        System.out.println("Replaced 'heavy' with 'extreme': " + replacedText);
        
        //contains
        boolean containsWord = text.contains("Mumbai");
        System.out.println("Contains 'Mumbai': " + containsWord);
        
        //replaceAll
        String replaceAllText = text.replaceAll("is", "was");
        System.out.println("ReplaceAll 'is' with 'was': " + replaceAllText);
        
        //indexOf
        int index = text.indexOf("closed");
        System.out.println("Index of 'closed': " + index);
        
        //substring
        String substring = text.substring(0, 13); // "Marine drive"
        System.out.println("Substring (0, 13): " + substring);
        
        //equals
        boolean equals = text.equals("Marine drive is closed due to heavy rain here in Mumbai");
        System.out.println("Equals: " + equals);
        
        //lastIndexOf
        int lastIndex = text.lastIndexOf("rain");
        System.out.println("Last Index of 'rain': " + lastIndex);
        
        //startsWith
        boolean startsWith = text.startsWith("Marine");
        System.out.println("Starts with 'Marine': " + startsWith);
        
        //endsWith
        boolean endsWith = text.endsWith("Mumbai");
        System.out.println("Ends with 'Mumbai': " + endsWith);
        
        //equalsIgnoreCase
        boolean equalsIgnoreCase = text.equalsIgnoreCase("marine drive is closed due to heavy rain here in mumbai");
        System.out.println("Equals Ignore Case: " + equalsIgnoreCase);
        
      
        // toLowerCase
        String lowerCaseText = text.toLowerCase();
        System.out.println("Lower Case: " + lowerCaseText);
        
        //toUpperCase
        String upperCaseText = text.toUpperCase();
        System.out.println("Upper Case: " + upperCaseText);
        
        // isEmpty
        boolean isEmpty = text.isEmpty();
        System.out.println("Is Empty: " + isEmpty);
        
        //length
        int length = text.length();
        System.out.println("Length: " + length);
        
        // split
        String[] words = text.split(" ");
        System.out.println("Split by spaces: ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
