class Solution {
 public int lengthOfLongestSubstring(String s) {
    int result = 0;
    int left = 0;
    int right = 0;
    HashSet<Character> window = new HashSet<>();

    while (right < s.length()) {
        if (!window.contains(s.charAt(right))) {
            window.add(s.charAt(right));
            result = Math.max(result, window.size());
            right++;
        } else {
            window.remove(s.charAt(left));
            left++;
        }
    }

    return result;
}

}