class Solution {
    public boolean isVowel(char s)  {

return (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u');
    }
    public int maxVowels(String a, int k) {
        int left = 0, right = 0, res = 0, ans = 0;
        char[] str = a.toCharArray();
        while(right < str.length && right < k) {
            char s = str[right];
            if(isVowel(s))  res++;
            right++;
        }
        ans = Math.max(ans, res);
        while(right < str.length) {
            char r = str[right++], l = str[left++];
            if(isVowel(r))  res++;
            if(isVowel(l))  res--;
            ans = Math.max(ans, res);
        }
        return ans;
    }
}
