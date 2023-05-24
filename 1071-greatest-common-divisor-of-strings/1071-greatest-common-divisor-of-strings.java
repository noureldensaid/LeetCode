class Solution {
       public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) return "";
        int gcd = gcd(str1.length(), str2.length());
        return str2.substring(0, gcd);
    }

    int gcd(int s1, int s2) {
        return s2 == 0 ? s1 : gcd(s2, s1 % s2);
    }
}