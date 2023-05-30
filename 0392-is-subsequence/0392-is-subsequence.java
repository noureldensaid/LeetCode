class Solution {
     public boolean isSubsequence(String s, String t) {
        String res = "";
        int i = 0;
        int y = 0;
        while (i < s.length() && y < t.length()) {
            if (s.charAt(i) == t.charAt(y)) {
                res += s.charAt(i);
                i++;
            }
            y++;
        }
        return res.equals(s);
    }
}