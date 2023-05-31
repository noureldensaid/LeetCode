class Solution {
 public int maxVowels(String s, int k) {
    Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    char[] arr = s.toCharArray();
    int max = 0;
    int count = 0;

    // Count vowels in the first k characters
    for (int i = 0; i < k; i++) {
        if (vowels.contains(arr[i])) {
            count++;
        }
    }
    max = count;

    // Sliding window approach to count vowels in subsequent substrings
    for (int i = k; i < arr.length; i++) {
        if (vowels.contains(arr[i - k])) {
            count--;
        }
        if (vowels.contains(arr[i])) {
            count++;
        }
        max = Math.max(max, count);
    }

    return max;
}


}