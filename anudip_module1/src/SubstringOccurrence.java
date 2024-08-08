

public class SubstringOccurrence {
    public static void main(String[] args) {
        String mainString = "we are citizens of india, india has a population of 1.4B people!";
        String substring = "india";

        int occurrenceCount = countOccurrences(mainString, substring);

        System.out.println("The substring \"" + substring + "\" occurs " + occurrenceCount + " times.");
    }

    // Method to count occurrences of a substring in the main string
    public static int countOccurrences(String mainString, String substring) {
        int count = 0;
        int subLength = substring.length();
        int mainLength = mainString.length();

        // Iterate through the main string
        for (int i = 0; i <= mainLength - subLength; i++) {
            String currentSubString = mainString.substring(i, i + subLength);

            if (currentSubString.equals(substring)) {
                count++;
            }
        }

        return count;
    }
}
