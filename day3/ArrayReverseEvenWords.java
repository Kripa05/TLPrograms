package week1.day3;


public class ArrayReverseEvenWords {

		
	public static void main(String[] args) { 
		
		String sentence = "To print even words in reverse order";
		String[] words = sentence.split(" ");
		
		int len = words.length; 
		
		String finalSentence = ""; 
		String reverseWords = ""; 
		
		for (int i = 0; i < len; i++) { 
			//getting each word
			String reverseword = words[i]; 
			
			if (i % 2 != 0) { 
				for (int j = reverseword.length() - 1; j >= 0; j--) { 
					reverseWords = reverseWords + reverseword.charAt(j); 
				} 
				finalSentence = finalSentence + reverseWords + " "; 
				reverseWords = ""; 
			} 
			else 
				finalSentence = finalSentence + words[i] + " "; 
		} 
		System.out.println(finalSentence); 
	}

}
