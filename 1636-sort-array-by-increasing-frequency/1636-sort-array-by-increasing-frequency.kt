class Solution {
  public int[] frequencySort(int[] nums) {
    // Step 1: Create a frequency map
    Map<Integer, Integer> frequencyMap = new HashMap<>();
    for (int num : nums) {
        frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
    }

    // Step 2: Sort the array based on frequency and value
    Integer[] arrayWrapper = new Integer[nums.length];
    for (int i = 0; i < nums.length; i++) {
        arrayWrapper[i] = nums[i];
    }
    Arrays.sort(arrayWrapper, (a, b) -> {
        int freqA = frequencyMap.get(a);
        int freqB = frequencyMap.get(b);
        if (freqA != freqB) {
            return freqA - freqB; // Sort by frequency
        }
        return b - a; // Sort by value in descending order if frequency is equal
    });

    // Convert the sorted array back to int[]
    int[] sortedArray = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
        sortedArray[i] = arrayWrapper[i];
    }

    return sortedArray;
}

}