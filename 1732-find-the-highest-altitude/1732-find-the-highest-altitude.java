class Solution {
 public int largestAltitude(int[] gain) {
    int max = Integer.MIN_VALUE; // Variable to track the maximum altitude
    int current = 0; // Variable to keep track of the current altitude
    int[] results = new int[gain.length + 1]; // Array to store the altitudes
    results[0] = current; // Set the initial altitude to 0
    for (int i = 1; i < results.length; i++) {
        current += gain[i - 1]; // Increment i only once and access gain[i-1]
        results[i] = current; // Store the current altitude in the results array
    }
    for (int element : results) {
        max = Math.max(element, max); // Find the maximum altitude
    }
    return max; // Return the maximum altitude
}

}
 