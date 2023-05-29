class Solution {
       public String mergeAlternately(String word1, String word2) {
        int counter = 0;
        StringBuilder result = new StringBuilder("");
        while (counter < word1.length() || counter < word2.length()) {
            if (counter < word1.length()) result = result.append(word1.charAt(counter));
            if (counter < word2.length()) result = result.append(word2.charAt(counter));
            counter++;
        }
        return result.toString();
    }
}