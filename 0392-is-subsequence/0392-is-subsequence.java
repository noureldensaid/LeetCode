class Solution {
     public boolean isSubsequence(String s, String t) {
         int i = 0;
        int y = 0;
        while (i < s.length() && y < t.length()) {
            if (s.charAt(i) == t.charAt(y)) {
                 i++;
            }
            y++;
        }
        return i==s.length();
    }
}