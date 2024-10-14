public class reverseword {
   
    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder(); 
        for (int i = words.length - 1; i >= 0; i--) { 
            reversedSentence.append(words[i]).append(" "); 
        }
        return reversedSentence.toString().trim(); 
    }
    public static void main(String[] args) {
        // Test cases
        System.out.println(reverseWords("Hello World")); // "World Hello"
        System.out.println(reverseWords("Java Programming")); // "Programming Java"
    }
} 