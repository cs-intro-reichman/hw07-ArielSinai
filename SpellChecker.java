
public class SpellChecker {


	public static void main(String[] args) {

		String word = args[0];
		int threshold = Integer.parseInt(args[1]);

		String[] dictionary = readDictionary("dictionary.txt");
		String correction = spellChecker(word, threshold, dictionary);
		System.out.println(correction);
	}

	public static String tail(String str) {
		// Your code goes here
		if (str.length() == 0) {
			return "";
		}
		return str.substring(1);
	}

	public static int levenshtein(String word1, String word2) {



		// Your code goes here
		if (word2.length() == 0) {
			return word1.length();
		}
		if (word1.length() == 0) {
			return word2.length();
		}

		if (word1.charAt(0) == word2.charAt(0)) {
			return levenshtein(tail(word1), tail(word2));
		}
		
		int a = levenshtein(tail(word1), word2);
		int b = levenshtein(word1, tail(word2));
		int c = levenshtein(tail(word1), tail(word2));

		int minValue = a;
		if (b < minValue) {
			minValue = b;
		}
		if (c < minValue) {
			minValue = c;
		}
		return minValue + 1;
	}

	public static String[] readDictionary(String fileName) {
		String[] dictionary = new String[3000];

		In in = new In(fileName);

		// Your code here
		for (int i=0; i<3000; i++) {
			dictionary[i] = in.readLine();
		}

		return dictionary;
	}

	public static String spellChecker(String word, int threshold, String[] dictionary) {
		// Your code goes here

		String minWord = dictionary[0];
		int minDistance = levenshtein(word, minWord);

		for (int i=1; i<3000; i++) {
			int distance = levenshtein(word, dictionary[i]);
			if (distance < minDistance) {
				minWord = dictionary[i];
				minDistance = distance;
			}
		}

		if (minDistance <= threshold) {
			return minWord;
		}
		return word;
	}

}
