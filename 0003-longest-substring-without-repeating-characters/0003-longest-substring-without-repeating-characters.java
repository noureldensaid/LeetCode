class Solution {
public int lengthOfLongestSubstring(String s) {
    int result = 0; // Variable to store the length of the longest substring
    int left = 0; // Left pointer
    int right = 0; // Right pointer
    HashSet<Character> window = new HashSet<>(); // HashSet to store unique characters of the current substring

    while (right < s.length()) {
        if (!window.contains(s.charAt(right))) {
            // If the character at the right pointer is not in the window,
            // add it to the window and move the right pointer to the next character.
            window.add(s.charAt(right));
            result = Math.max(result, window.size()); // Update the result if the current substring length is greater
            right++; // Move the right pointer to the next character
        } else {
            // If the character at the right pointer is already in the window,
            // remove the character at the left pointer from the window and move the left pointer.
            window.remove(s.charAt(left));
            left++; // Move the left pointer to the next character
        }
    }

    return result; // Return the length of the longest substring
}

}