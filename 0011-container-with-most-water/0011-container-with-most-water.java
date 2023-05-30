class Solution {
 public int maxArea(int[] height) {
    int h = 0;
    int w = 0;
    int left = 0;
    int area = 0;
    int right = height.length - 1;

    // Use two pointers, one starting from the left and the other from the right
    while (left < right) {
        // Calculate the width as the distance between the two pointers
        w = right - left; 
        // Calculate the height as the minimum of the two heights
        h = Math.min(height[left], height[right]); 
        // Update the maximum area if necessary
        area = Math.max(area, h * w);  
        // Move the pointer that corresponds to the shorter height
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }

    // Return the maximum area
    return area;
}
 
}
 