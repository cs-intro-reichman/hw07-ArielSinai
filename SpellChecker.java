
public class SpellChecker {


	public static void main(String[] args) {

		System.out.println(tail("hello"));

		// String word = args[0];
		// int threshold = Integer.parseInt(args[1]);
		// String[] dictionary = readDictionary("dictionary.txt");
		// String correction = spellChecker(word, threshold, dictionary);
		// System.out.println(correction);


	}

	public static String tail(String str) {
		// Your code goes here
		if (str.equals("")) {
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

		

	}

	public static String[] readDictionary(String fileName) {
		String[] dictionary = new String[3000];

		In in = new In(fileName);

		// Your code here
		for (int i=0; i<3000; i++) {
			dictionary[i] = in.readString();
		}

		return dictionary;
	}

	public static String spellChecker(String word, int threshold, String[] dictionary) {
		// Your code goes here
		return "";
	}

}
