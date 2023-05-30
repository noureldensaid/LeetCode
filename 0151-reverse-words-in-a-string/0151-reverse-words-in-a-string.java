class Solution {
 public String reverseWords(String s) {
    // Split the input string by whitespace into an array of words
    String[] words = s.trim().split(" +");
    
    StringBuilder result = new StringBuilder();
    
    // Iterate over the words array in reverse order
    for (int i = words.length - 1; i >= 0; i--) {
        // Append each word to the result StringBuilder
        result.append(words[i]);
        
        // Add a space after each word except the last one
        if (i > 0) {
            result.append(" ");
        }
    }
    
    // Convert the StringBuilder to a String and return the result
    return result.toString();
}

}