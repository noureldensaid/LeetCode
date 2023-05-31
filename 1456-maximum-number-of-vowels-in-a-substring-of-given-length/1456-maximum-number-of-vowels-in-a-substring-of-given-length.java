class Solution {
    public int maxVowels(String s, int k) {

        int[] vowels = new int[128];
        vowels['a'] = vowels['e'] = vowels['i'] = vowels['o'] =     vowels['u'] = 1;
        int count = 0;
        int maxCount=0;

        for(int i=0; i<k; i++){
            count += vowels[s.charAt(i)];
        }
        maxCount = count;
        
        for(int i=k; i<s.length(); i++){
            count += vowels[s.charAt(i)] - vowels[s.charAt(i-k)];
            maxCount = Math.max(maxCount, count);
            if(maxCount == k) return maxCount;
        }
        return maxCount;
    }
}