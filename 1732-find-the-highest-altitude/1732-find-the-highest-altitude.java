class Solution {
public int largestAltitude(int[] gain) {
    int max = Integer.MIN_VALUE;
    int current = 0;
    int[] results = new int[gain.length + 1];
    results[0] = current;
    for (int i = 1; i < results.length; i++) {
        current += gain[i - 1]; // Increment i only once and access gain[i-1]
        results[i] = current;
    }
    for (int element : results) {
        max = Math.max(element, max);
    }
    return max;
}


}