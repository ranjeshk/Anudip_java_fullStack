

public class WordCount {
	public static void main(String[] args) {
		// Input 
		String input = "Students are Studying";
		int wordCount = countWords(input);

		System.out.println("Number of words: " + wordCount);
	}

	// Method to count words in a string
	public static int countWords(String str) {
		int count = 0;
		boolean inWord = false;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			// Check if the current character is an alphabetic character
			if (Character.isAlphabetic(c)) {

				if (!inWord) {
					count++;
					inWord = true;
				}
			} else {
				inWord = false;
			}
		}

		return count;
	}
}
