public class Solution {
     public String reverseVowels(String s) {
        HashSet<Character> vowels =
                new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char[] arr = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (!vowels.contains(arr[start])) start++;
            else if (!vowels.contains(arr[end])) end--;
            else {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        return new String(arr);
    }
}